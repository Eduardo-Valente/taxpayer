package entities;

public class LegalPerson extends Contributor {

	private Integer numberOfEmployees;

	public LegalPerson() {
		super();
	}
	
	public LegalPerson(String name, Float annualIncome, Integer numberOfEmployees) {
		super(name, annualIncome);
		this.numberOfEmployees = numberOfEmployees;
	}
	
	public Integer getNumberOfEmployees() {
		return numberOfEmployees;
	}

	public void setNumberOfEmployees(Integer numberOfEmployees) {
		this.numberOfEmployees = numberOfEmployees;
	}

	@Override
	public Float taxCalc() {
		
		if(this.numberOfEmployees > 10)
		{
			return annualIncome * 0.14f;
		}
		else {
			return annualIncome * 0.16f;
		}
	}
}
