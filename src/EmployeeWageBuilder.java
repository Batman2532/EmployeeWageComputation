  
public class EmployeeWageBuilder {
	
	public String company;
	public int workingHoursPerMonth;
	public int workingDaysPerMonth;
	
	public EmployeeWageBuilder(String company,int workingHours,int workingDays) {
		this.company = company;
		this.workingHoursPerMonth = workingHours;
		this.workingDaysPerMonth = workingDays;
		
	}
	public int CalculateWage() {

		int fullDayHr = 8, wagePerHr = 20, partTimeHr = 4,totalWages=0, wage=0, workingDays =0,workingHours=0;
		
		while(workingDays < workingDaysPerMonth && workingHours < workingHoursPerMonth) {
		
		double empCheck = Math.floor(Math.random() * 10 % 3);
	
		int attendance=(int) empCheck;
		
		switch(attendance) {
		
		case 0:
			break;
		 case 1: 
			 wage=wagePerHr * fullDayHr; 
			 
			workingDays=workingDays++;
			workingHours=workingHours+8;
			 break;  
		 case 2:
			 wage=wagePerHr*partTimeHr;
			 
				workingDays=workingDays++;
				workingHours=workingHours+4;
				break;
		}
		totalWages=totalWages + wage;
		}
		
		return totalWages;
		
	}

	
	public static void main(String[] args) {
		
		EmployeeWageBuilder tata = new EmployeeWageBuilder("tata", 100, 20);
		int totalW = tata.CalculateWage();
		System.out.println("total salary for month in company "+tata.company+" "+totalW);
 }

}
