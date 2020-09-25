package Bridgelabz.third;

/**
 * Hello world!
 *
 */
public class EmpWageBuilderUC9 
{
	static final int IS_FULL_TIME = 1;
	static final int IS_PART_TIME= 2;
	final private String companyName;
	final private int empRatePerHour;
	final private int maxHoursPerMonth;
	final private int numOfWorkingDays;
	public EmpWageBuilderUC9(String companyName, int empRatePerHour, int numOfWorkingDays,
    	int maxHoursPerMonth	) {
		this.empRatePerHour = empRatePerHour;
		this.maxHoursPerMonth = maxHoursPerMonth;
		this.numOfWorkingDays = numOfWorkingDays;
		this.companyName = companyName;
	}
    public static void main( String[] args )
    {
    	EmpWageBuilderUC9 comp1= new EmpWageBuilderUC9("Google",200,17,100);
    	EmpWageBuilderUC9 comp2= new EmpWageBuilderUC9("fb",250,15,90);
    	comp1.calcEmpWage();
    	comp2.calcEmpWage();
//    	System.out.print(totalWage);
    }
    public int calcEmpWage() { 
    	int totalWorkingHrs=0;
    	int totalWage=0;
    	int days=0;
    	while(totalWorkingHrs < this.maxHoursPerMonth     &&    days < this.numOfWorkingDays) {
    		int noOfHrs = 0;
//    		int empWage=0;
    		final int empCheck = (int)Math.floor(Math.random() * 10)%3;
    		switch(empCheck) {
    		case IS_FULL_TIME: 	noOfHrs = 8;
    						days += 1;
//    						System.out.println("Working Hard");
    						break;
    		case IS_PART_TIME:	noOfHrs = 4;
    						days += 1;
//    						System.out.println("Enjoying life");
    						break;
//    		default:			System.out.println("Ghar pe aish");
    		}
    		totalWorkingHrs += noOfHrs;
    		final int empWage= noOfHrs*this.empRatePerHour;
    		totalWage+=empWage;
    	}
    	if(totalWorkingHrs >= this.maxHoursPerMonth)
    		System.out.println( "Employee's wage for completing " + this.maxHoursPerMonth + " or more Hrs in "+this.companyName+" is " + totalWage);
    	else
    		System.out.println("Employee's wage after working " + this.numOfWorkingDays + " or more days in "+this.companyName+" is "  + totalWage);
    	return totalWage;
    }
}
