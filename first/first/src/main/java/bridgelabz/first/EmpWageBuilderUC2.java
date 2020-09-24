package bridgelabz.first;

/**
 * Hello world!
 *
 */
public class EmpWageBuilderUC2 
{
    public static void main( String[] args )
    {
    	final int IS_FULL_TIME = 1;
    	final int PER_HOUR_WAGE = 20;
    	int noOfHrs = 0;
    	int empWage=0;
    	double empCheck = Math.floor(Math.random() * 10)%2;
    	if(IS_FULL_TIME == empCheck) {
    		noOfHrs = 8;
    		System.out.println("Working Hard");
    		
    	}
    	else
    		System.out.println("Ghar pe aish");
    	empWage= noOfHrs*PER_HOUR_WAGE;
        System.out.println( "Employee's wage for the day :" + empWage);
    }
}
