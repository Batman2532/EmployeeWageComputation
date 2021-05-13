
public class CompanyWage {
	//declaring variables
	 public final String company ;
	    public final int empRatePerHr;
	    public final int noOfWorkingDays;
	    public final int maxHrsPeronth;
	    public int totalEmpWage;
	    public int dailyWage[];

	   //calling constructor
	    public CompanyWage(String company, int empRatePerHr, int noOfWorkingDays, int maxHrsPeronth) {
	        this.company = company;
	        this.empRatePerHr = empRatePerHr;
	        this.noOfWorkingDays = noOfWorkingDays;
	        this.maxHrsPeronth = maxHrsPeronth;
	    }

	    public void setTotalEmpWage(int totalEmpWage) {//storing total wage of the employee
	        this.totalEmpWage = totalEmpWage;
	    }
	    	
	    public void printDailyWage(){//printing to daily wage of the employee
	        for (int i=0;i<dailyWage.length;i++){
	            System.out.println("Day "+(i+1)+"\t Wage = "+dailyWage[i]);
	        }
	    }
	   
	    public String toString() { //printing company name and total wage of the employee for that company
	        return "Total Emp Wage for Company:" + company + " is: " + totalEmpWage + "\n";
	    }
}
