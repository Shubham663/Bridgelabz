package bridgelabz.first;

/**
 * Hello world!
 *
 */
public class EmpWageBuilderUC5 
{
    public static void main( String[] args )
    {
    	final int IS_FULL_TIME = 1;
    	final int IS_PART_TIME= 2;
    	final int PER_HOUR_WAGE = 20;
    	int totalWage=0;
    	
    	for(int i=0;i<20;i++) {
    		int noOfHrs = 0;
//    		int empWage=0;
    		final int empCheck = (int)Math.floor(Math.random() * 10)%3;
    		switch(empCheck) {
    		case IS_FULL_TIME: 	noOfHrs = 8;
    						System.out.println("Working Hard");
    						break;
    		case IS_PART_TIME:	noOfHrs = 4;
    						System.out.println("Enjoying life");
    						break;
    		default:			System.out.println("Ghar pe aish");
    		}
    		final int empWage= noOfHrs*PER_HOUR_WAGE;
    		totalWage+=empWage;
    	}
        System.out.println( "Employee's wage for the month :" + totalWage);
    }
}
