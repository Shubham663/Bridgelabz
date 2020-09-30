package bridgelabz.Pincode;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Hello world!
 *
 */
public class PincodeChecker 
{
    public static void main( String[] args )
    {
    	final String type = "^[^A-Za-z\\W]*[1-9]{1}[0-9]{2}[\\s]?[0-9]{3}[^A-Za-z\\\\W]*$";
    	Pattern pattern = Pattern.compile(type);
    	String input = "400 088";
    	Matcher matcher = pattern.matcher(input);
        System.out.println( "Pincode is right: " + matcher.matches() );
    }
}
