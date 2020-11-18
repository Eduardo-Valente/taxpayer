package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Contributor;
import entities.LegalPerson;
import entities.NaturalPerson;

/* 1) Calculates the natural person or legal person tax paid 
 * 2) Shows the total of taxes paid 
 */

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		List<Contributor> contributors = new ArrayList<>();
		
		Integer numberOfContributors = 0;
		Integer numberOfEmployees = 0;
		String nameOfContributor;
		Float annualIncome, healthExpenditure;
		Float totalTaxPaid = 0f;
		
		System.out.print("Enter the number of tax payers: ");
		numberOfContributors = sc.nextInt();
		
		for(int i = 1; i <= numberOfContributors; i++)
		{
			System.out.println("Tax payer #" + i + " data:");
			System.out.print("Individual or company (i/c)? ");
			char option = sc.next().toLowerCase().charAt(0);
			System.out.print("Name: ");
			sc.nextLine();
			nameOfContributor = sc.nextLine();
			System.out.print("Annual Income: ");
			annualIncome = sc.nextFloat();
			
			switch(option)
			{
				case 'i': 
					
					System.out.print("Health expenditures: ");
					healthExpenditure = sc.nextFloat();
					
					contributors.add(new NaturalPerson(nameOfContributor, annualIncome, healthExpenditure));
					
				break;
				
				case 'c': 
					
					System.out.print("Number of employees: ");
					numberOfEmployees = sc.nextInt();
					contributors.add(new LegalPerson(nameOfContributor, annualIncome, numberOfEmployees));
					
				break;
			}
		}
		
		System.out.println();
		System.out.println("TAXES PAID: ");
		
		for(Contributor con : contributors)
		{
			System.out.println(con);
			totalTaxPaid += con.taxCalc();
		}
		
		System.out.println();
		System.out.printf("TOTAL TAXES: %,.2f%n", totalTaxPaid);
		
		sc.close();
	}

}
