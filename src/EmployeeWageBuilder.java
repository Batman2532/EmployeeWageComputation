  
public class EmployeeWageBuilder {
	
	private int numOfCompany = 0;
    private CompanyWage[] companyEmpWageArray = new CompanyWage[5];


    private  void addCompanyEmpWage(String company, int empRatePerHr, int noOfWorkingDays, int maxHrsPeronth) {
        companyEmpWageArray[numOfCompany] = new CompanyWage(company, empRatePerHr, noOfWorkingDays, maxHrsPeronth);
        numOfCompany++;
    }

  
	private void calculateWage() {
        for (int i = 0; i < numOfCompany; i++) {
            companyEmpWageArray[i].setTotalEmpWage(this.calculateWage(companyEmpWageArray[i]));
            System.out.println(companyEmpWageArray[i]);
        }
    }
		

	public int calculateWage(CompanyWage companyWage) {

		int empHr = 0, workingDays =0,totalHr=0;	
		while(workingDays < companyWage.noOfWorkingDays && totalHr < companyWage.maxHrsPeronth) {
			workingDays++;
		double empCheck = Math.floor(Math.random() * 10 % 3);	
		int attendance=(int) empCheck;
		switch(attendance) {
		
			case 0:
			break;
		 case 1: 
			 empHr = 8;  
			 break;  
		 case 2:
			 empHr = 4;				
				break;
		}
		totalHr = totalHr + empHr;
		}
		return totalHr * companyWage.empRatePerHr;	
		
	}

	
	public static void main(String[] args) {
		EmployeeWageBuilder empWageBuilder = new EmployeeWageBuilder();		
		empWageBuilder.addCompanyEmpWage("tata", 100, 20, 120);
		empWageBuilder.addCompanyEmpWage("Reliance", 100, 21,100);
		empWageBuilder.calculateWage();		
	}

}
