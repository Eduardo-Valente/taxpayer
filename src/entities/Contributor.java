package entities;

public abstract class Contributor {
		
		protected String name;
		protected Float annualIncome;
		
		public Contributor() {}
		
		public Contributor(String name, Float annualIncome) {
			
			this.name = name;
			this.annualIncome = annualIncome;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public Float getAnnualIncome() {
			return annualIncome;
		}

		public void setAnnualIncome(Float annualIncome) {
			this.annualIncome = annualIncome;
		}

		public abstract Float taxCalc();
		
		public String toString() {
			
			return this.name + " $ " + String.format("%,.2f", taxCalc());
		}
}
