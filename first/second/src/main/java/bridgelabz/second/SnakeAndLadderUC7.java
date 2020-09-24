package bridgelabz.second;

/**
 * Hello world!
 *
 */
public class SnakeAndLadderUC7 
{
	final static int NO_PLAY = 0;
	final static int LADDER = 1;
	final static int SNAKE = 2;
	final static int WINNING_NUMBER = 100;
    public static void main( String[] args )
    {
    	
//    	int noOfRolls = 0;
    	int start1 = 0, start2 = 0;
    	while(start1 < WINNING_NUMBER   &&   start2 < WINNING_NUMBER) {
//    		noOfRolls++;
    		start1 = pos(start1);
    		if(start1==WINNING_NUMBER) {
    			System.out.println("Player 1 won the game");
    			return;
    		}
    		start2 = pos(start2);
    		if(start2 == WINNING_NUMBER) {
    			System.out.println("Player 2 won the game");
    			return;
    		}
//			int dieVal1 = (int) Math.floor(Math.random() * 6) + 1;
//			int dieVal2 = (int) Math.floor(Math.random() * 6) + 1;
//			int option1 = (int) Math.floor(Math.random() * 10) % 3;
//			int option2 = (int) Math.floor(Math.random() * 10) % 3;
//			switch (option1) {
//			case NO_PLAY:
//				break;
//			case LADDER:
//				if(start1 + dieVal1 > 100)
//					break;
//				start1 += dieVal1;
//				break;
//			case SNAKE:
//				if (start1 > dieVal1)
//					start1 -= dieVal1;
//				else
//					start1 = 0;
//				break;
//			}
//			System.out.println("Die position after " + noOfRolls + " rolls is " + start1);
//    	switch (option2) {
//		case NO_PLAY:
//			break;
//		case LADDER:
//			if(start2 + dieVal2 > 100)
//				break;
//			start2 += dieVal2;
//			break;
//		case SNAKE:
//			if (start2 > dieVal2)
//				start2 -= dieVal2;
//			else
//				start2 = 0;
//			break;
//		}
    	}
//		System.out.println("Die position after " + noOfRolls + " rolls is " + start);
////    	System.out.println( "Random Val " + dieVal );
////    	System.out.println("Option Val " + option );
//    	System.out.println("Total no of rolls done " + noOfRolls);
    }
    
    public static int pos(int start) {
    	int dieVal = (int) Math.floor(Math.random() * 6) + 1;
		int option = (int) Math.floor(Math.random() * 10) % 3;
		switch (option) {
		case NO_PLAY:
			break;
		case LADDER:
			if(start + dieVal > WINNING_NUMBER) {
				int k= pos(start);
				return k;
			}
			start += dieVal;
			if(start == WINNING_NUMBER)
				return WINNING_NUMBER;
			else
				return pos(start);
		case SNAKE:
			if (start > dieVal)
				start -= dieVal;
			else
				start = 0;
			break;
		}
		return start;
    }
}
