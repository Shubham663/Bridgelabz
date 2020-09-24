package bridgelabz.first;

/**
 * Hello world!
 *
 */
public class EmpWageBuilderUC3 
{
    public static void main( String[] args )
    {
    	final int IS_FULL_TIME = 1;
    	final int IS_PART_TIME= 2;
    	final int PER_HOUR_WAGE = 20;
    	int noOfHrs = 0;
    	int empWage=0;
    	double empCheck = Math.floor(Math.random() * 10)%3;
    	if(IS_FULL_TIME == empCheck) {
    		noOfHrs = 8;
    		System.out.println("Working Hard");
    		
    	}
    	else if(IS_PART_TIME == empCheck) {
    		noOfHrs = 4;
    		System.out.println("Enjoying life");
    	}
    	else
    		System.out.println("Ghar pe aish");
    	empWage= noOfHrs*PER_HOUR_WAGE;
        System.out.println( "Employee's wage for the day :" + empWage);
    }
}
