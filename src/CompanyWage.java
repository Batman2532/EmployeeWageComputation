
public class CompanyWage {
	 public final String company ;
	    public final int empRatePerHr;
	    public final int noOfWorkingDays;
	    public final int maxHrsPeronth;
	    public int totalEmpWage;

	   
	    public CompanyWage(String company, int empRatePerHr, int noOfWorkingDays, int maxHrsPeronth) {
	        this.company = company;
	        this.empRatePerHr = empRatePerHr;
	        this.noOfWorkingDays = noOfWorkingDays;
	        this.maxHrsPeronth = maxHrsPeronth;
	    }

	    public void setTotalEmpWage(int totalEmpWage) {
	        this.totalEmpWage = totalEmpWage;
	    }

	   
	    public String toString() {
	        return "Total Emp Wage for Company:" + company + " is: " + totalEmpWage + "\n";
	    }
}
