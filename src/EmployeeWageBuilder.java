  
public class EmployeeWageBuilder {

	public static void main(String[] args) {
		int present = 1, wage = 0, fullDayHr = 8, wagePerHr = 20, partTime = 2, partTimeHr = 4, totalWages=0;
		
		for(int i=0; i<20; i++) {
		
		double empCheck = Math.floor(Math.random() * 10 % 3);
	
		int attendance=(int) empCheck;
		
		switch(attendance) {
		
		case 0:
			System.out.println("Employee is absent");
			break;
		
		 case 1: 
			 System.out.println("Employee is present");
			 wage=wagePerHr*fullDayHr; 
			 break;  
		 case 2:
			 System.out.println("Employee is present Half Day");
				wage=wagePerHr*partTimeHr;
				break;
		}
		totalWages=totalWages+wage;
		System.out.println(totalWages + " Monthly Wage");
		}
		
	}

}
