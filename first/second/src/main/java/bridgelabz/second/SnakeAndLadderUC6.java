package bridgelabz.second;

/**
 * Hello world!
 *
 */
public class SnakeAndLadderUC6 
{
    public static void main( String[] args )
    {
    	final int NO_PLAY = 0;
    	final int LADDER = 1;
    	final int SNAKE = 2;
    	int noOfRolls = 0;
    	int start = 0;
    	while(start<100) {
    		noOfRolls++;
    		
			int dieVal = (int) Math.floor(Math.random() * 6) + 1;
			int option = (int) Math.floor(Math.random() * 10) % 3;
			switch (option) {
			case NO_PLAY:
				break;
			case LADDER:
				if(start + dieVal > 100)
					break;
				start += dieVal;
				break;
			case SNAKE:
				if (start > dieVal)
					start -= dieVal;
				else
					start = 0;
				break;
			}
			System.out.println("Die position after " + noOfRolls + " rolls is " + start);
    	}
//    	System.out.println( "Random Val " + dieVal );
//    	System.out.println("Option Val " + option );
    	System.out.println("Total no of rolls done " + noOfRolls);
    }
}
