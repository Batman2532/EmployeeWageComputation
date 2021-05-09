import java.util.ArrayList;

class EmployeeWageBuilder implements WageCalculationInterface {
	
    public ArrayList<CompanyWage> companyWageList = new ArrayList<>();


    public  void addCompanyEmpWage(String company, int empRatePerHr, int noOfWorkingDays, int maxHrsPeronth) {
        CompanyWage  companyWage = new CompanyWage(company, empRatePerHr, noOfWorkingDays, maxHrsPeronth);
        companyWageList.add(companyWage);    }

  
	public void calculateWage() {
        for (int i = 0; i < companyWageList.size(); i++) {
        	 CompanyWage  companyWage = companyWageList.get(i);
            companyWage.setTotalEmpWage(this.calculateWage(companyWage));
            companyWage.printDailyWage();
            System.out.println("--------------");
            System.out.println(companyWage);
        }
    }
		

	public int calculateWage(CompanyWage companyWage) {

		int empHr = 0, workingDays =0,totalHr=0;	
		companyWage.dailyWage = new int[companyWage.noOfWorkingDays];
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
		companyWage.dailyWage[workingDays-1] = empHr * companyWage.empRatePerHr;
		}
		return totalHr * companyWage.empRatePerHr;	
		
	}

	
}
