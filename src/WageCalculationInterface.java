
	public interface WageCalculationInterface {
	    public void addCompanyEmpWage(String company, int empRatePerHr, int noOfWorkingDays, int maxHrsPeronth);
	    public void calculateWage();
	    public int calculateWage(CompanyWage companyWage);
	}

