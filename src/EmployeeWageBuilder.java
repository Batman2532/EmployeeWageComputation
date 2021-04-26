
public class EmployeeWageBuilder {

	public static void main(String[] args) {
		int present = 1, wage = 0, fullDayHr = 8, wagePerHr = 20;
		
		double empCheck = Math.floor(Math.random() * 10 % 2);
		if (empCheck == present) {
			System.out.println("Employee is present");
			wage=wagePerHr*fullDayHr;
			System.out.println(wage + " Daily Wage");
		}
		else
			System.out.println("Employee is absent");
		
	}

}
