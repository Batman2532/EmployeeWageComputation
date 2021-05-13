import java.util.Scanner;

public class WageBuilderMain {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		 System.out.println("Welcome to Employee Wedge Builder...");
	        System.out.println("************************************\n");
	        int num;
	        System.out.println("Enter No. of Companies");
	        num = scanner.nextInt();
	        
	        WageCalculationInterface empWageBuilder = new EmployeeWageBuilder(); //calling WageCalculationInterface
	        for (int i = 0; i < num; i++) {
	            System.out.println(
	                    "Enter Company Details as given:\n CompanyName EmployeeRatePerHr NoOfWorkingDays MaxHrsPerMonth");
	            empWageBuilder.addCompanyEmpWage(scanner.next(), scanner.nextInt(), scanner.nextInt(), scanner.nextInt());//Storing company details in empWageBuilser
	        }
	        System.out.println("");
	        empWageBuilder.calculateWage();//calling calculate Wage method
		
	}

}
