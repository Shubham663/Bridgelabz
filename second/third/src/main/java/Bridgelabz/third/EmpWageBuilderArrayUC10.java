package Bridgelabz.third;

/**
 * Hello world!
 *
 */

class EmpWageChars{
	final private String companyName;
	final private int empRatePerHour;
	final private int maxHoursPerMonth;
	final private int numOfWorkingDays;
	public int getMaxHoursPerMonth() {
		return maxHoursPerMonth;
	}
	public int getNumOfWorkingDays() {
		return numOfWorkingDays;
	}
	public int getEmpRatePerHour() {
		return empRatePerHour;
	}
	public String getCompanyName() {
		return companyName;
	}
	private int totalEmpWage;
	public EmpWageChars(String companyName, int empRatePerHour, int numOfWorkingDays,
	    	int maxHoursPerMonth) {
		this.empRatePerHour = empRatePerHour;
		this.maxHoursPerMonth = maxHoursPerMonth;
		this.numOfWorkingDays = numOfWorkingDays;
		this.companyName = companyName;
	}
	public void setTotalEmpWage(int totalEmpWage) {
		this.totalEmpWage = totalEmpWage;
	}
}




public class EmpWageBuilderArrayUC10 
{
	static final int IS_FULL_TIME = 1;
	static final int IS_PART_TIME= 2;
	private int noOfCompanies = 0;
	public void incNoOfCompanies() {
		this.noOfCompanies++;
	}
	EmpWageChars []empWageCharacters= new EmpWageChars[5];
	
	public void addEmpWageChars(EmpWageChars empWageChars) {
		this.empWageCharacters[this.noOfCompanies++] = empWageChars;
	}
    
	public static void main( String[] args )
    {
    	EmpWageBuilderArrayUC10 compArray = new EmpWageBuilderArrayUC10();
    	EmpWageChars comp1 = new EmpWageChars("Dmart",200,17,100);
    	EmpWageChars comp2 = new EmpWageChars("Amazon",300,15,90);
    	compArray.addEmpWageChars(comp1);
    	compArray.addEmpWageChars(comp2);
    	compArray.calcEmpWage();
    }
    
	public void calcEmpWage() {
    	for(int i=0;i<this.noOfCompanies;i++) {
    		this.empWageCharacters[i].setTotalEmpWage(this.calcEmpWage(this.empWageCharacters[i]));
    	}
    }
    
    public int calcEmpWage (EmpWageChars empWageChar) { 
    	int totalWorkingHrs=0;
    	int totalWage=0;
    	int days=0;
    	while(totalWorkingHrs < empWageChar.getMaxHoursPerMonth()     &&    days < empWageChar.getNumOfWorkingDays()) {
    		int noOfHrs = 0;
    		final int empCheck = (int)Math.floor(Math.random() * 10)%3;
    		switch(empCheck) {
    		case IS_FULL_TIME: 	noOfHrs = 8;
    						days += 1;
    						break;
    		case IS_PART_TIME:	noOfHrs = 4;
    						days += 1;
    						break;
    		}
    		totalWorkingHrs += noOfHrs;
    		final int empWage= noOfHrs*empWageChar.getEmpRatePerHour();
    		totalWage+=empWage;
    	}
    	if(totalWorkingHrs >= empWageChar.getMaxHoursPerMonth())
    		System.out.println( "Employee's wage for completing " + empWageChar.getMaxHoursPerMonth() + " or more Hrs in "+empWageChar.getCompanyName()+" is " + totalWage);
    	else
    		System.out.println("Employee's wage after working " + empWageChar.getNumOfWorkingDays() + " or more days in "+empWageChar.getCompanyName()+" is "  + totalWage);
    	return totalWage;
    }
}
