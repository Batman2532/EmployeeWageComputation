
public class WageBuilderMain {

	public static void main(String[] args) {
		EmployeeWageBuilder empWageBuilder = new EmployeeWageBuilder();		
		empWageBuilder.addCompanyEmpWage("tata", 100, 20, 120);
		empWageBuilder.addCompanyEmpWage("Reliance", 100, 21,100);
		empWageBuilder.calculateWage();	
	}

}
