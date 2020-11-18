package entities;

public class NaturalPerson extends Contributor{

	private Float healthExpenditure;
	
	public NaturalPerson() {
		super();
	}
	
	public NaturalPerson(String name, Float annualIncome, Float healthExpenditure) {
		super(name, annualIncome);
		this.healthExpenditure = healthExpenditure;
	}

	public Float gethealthExpenditure() {
		return healthExpenditure;
	}

	public void sethealthExpenditure(Float healthExpenditure) {
		this.healthExpenditure = healthExpenditure;
	}

	@Override
	public Float taxCalc() {
		
		Float paidTax = 0f;
		
		if(this.annualIncome < 20000 && healthExpenditure == 0)
		{
			paidTax = this.annualIncome * 0.15f;
		}
		
		else if(this.annualIncome < 20000 && healthExpenditure > 0)
		{
			paidTax = (this.annualIncome * 0.15f) - (healthExpenditure * 0.5f);
		}
		
		else if(this.annualIncome >= 20000 && healthExpenditure == 0)
		{
			paidTax = this.annualIncome * 0.25f;
		}
		
		else if(this.annualIncome >= 20000 && healthExpenditure > 0)
		{
			paidTax = (this.annualIncome * 0.25f) - (healthExpenditure * 0.5f);
		}
		
		return paidTax;
	}
}
