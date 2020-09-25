package Bridgelabz.third;

/**
 * Hello world!
 *
 */
public class EmpWageBuilderUC8 
{
	static final int IS_FULL_TIME = 1;
	static final int IS_PART_TIME= 2;
//	static final int PER_HOUR_WAGE = 20;
//	static final int MAX_WORKING_HRS = 100;
//	static final int MAX_WORKING_DAYS = 15;
    public static void main( String[] args )
    {
    	calcEmpWage("Google",200,20,100);
    	calcEmpWage("fb",250,15,90);
//    	System.out.print(totalWage);
    }
    public static void calcEmpWage(String companyName, int empRatePerHour, int numOfWorkingDays,
    	int maxHoursPerMonth	) { 
    	int totalWorkingHrs=0;
    	int totalWage=0;
    	int days=0;
    	while(totalWorkingHrs < maxHoursPerMonth     &&    days < numOfWorkingDays) {
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
    		final int empWage= noOfHrs*empRatePerHour;
    		totalWage+=empWage;
    	}
    	if(totalWorkingHrs>=100)
    		System.out.println( "Employee's wage for completing " + maxHoursPerMonth + " or more Hrs in "+companyName+" is " + totalWage);
    	else
    		System.out.println("Employee's wage after working " + numOfWorkingDays + " or more days in "+companyName+" is "  + totalWage);
//    	return totalWage;
    }
}
