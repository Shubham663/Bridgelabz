package Bridgelabz.third;

/**
 * Hello world!
 *
 */
public class EmpWageBuilderUC7 
{
	static final int IS_FULL_TIME = 1;
	static final int IS_PART_TIME= 2;
	static final int PER_HOUR_WAGE = 20;
	static final int MAX_WORKING_HRS = 100;
	static final int MAX_WORKING_DAYS = 15;
    public static void main( String[] args )
    {
//    	int totalWorkingHrs=0;
    	int totalWage=0;
//    	int days=0;
    	totalWage = calcEmpWage();
    	System.out.print(totalWage);
    }
    public static int calcEmpWage() { 
    	int totalWorkingHrs=0;
    	int totalWage=0;
    	int days=0;
    	while(totalWorkingHrs < MAX_WORKING_HRS     &&    days < MAX_WORKING_DAYS) {
    		int noOfHrs = 0;
//    		int empWage=0;
    		final int empCheck = (int)Math.floor(Math.random() * 10)%3;
    		switch(empCheck) {
    		case IS_FULL_TIME: 	noOfHrs = 8;
    						days += 1;
    						System.out.println("Working Hard");
    						break;
    		case IS_PART_TIME:	noOfHrs = 4;
    						days += 1;
    						System.out.println("Enjoying life");
    						break;
    		default:			System.out.println("Ghar pe aish");
    		}
    		totalWorkingHrs += noOfHrs;
    		final int empWage= noOfHrs*PER_HOUR_WAGE;
    		totalWage+=empWage;
    	}
    	if(totalWorkingHrs>=100)
    		System.out.print( "Employee's wage for completing " + MAX_WORKING_HRS + " or more Hrs ");
    	else
    		System.out.print("Employee's wage after working " + MAX_WORKING_DAYS + " or more days ");
    	return totalWage;
    }
}
