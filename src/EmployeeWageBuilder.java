  
public class EmployeeWageBuilder {

	public static void main(String[] args) {
		int  wage = 0, fullDayHr = 8, wagePerHr = 20, partTimeHr = 4, totalWages=0, workingDays=0,workingHours=0;
		
		while(workingDays == 20 && workingHours == 100) {
		
		double empCheck = Math.floor(Math.random() * 10 % 3);
	
		int attendance=(int) empCheck;
		
		switch(attendance) {
		
		case 0:
			System.out.println("Employee is absent");
			break;
		
		 case 1: 
			 System.out.println("Employee is present");
			 wage=wagePerHr*fullDayHr; 
			workingDays=workingDays++;
			workingHours=workingHours+8;
			 break;  
		 case 2:
			 System.out.println("Employee is present Half Day");
				wage=wagePerHr*partTimeHr;
				workingDays=workingDays++;
				workingHours=workingHours+4;
				break;
		}
		totalWages=totalWages+wage;
		System.out.println(totalWages + " Monthly Wage");
		}

	}

}
