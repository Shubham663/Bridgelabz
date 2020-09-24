package bridgelabz.first;

/**
 * Hello world!
 *
 */
public class EmpWageBuilderUC1 
{
    public static void main( String[] args )
    {
    	int IS_FULL_TIME=1;
    	double empCheck = Math.floor(Math.random() * 10)%2;
    	if(IS_FULL_TIME == empCheck)
    		System.out.println("Working Hard");
    	else
    		System.out.println("Ghar pe aish");
        System.out.println( "Hello World!" );
    }
}
