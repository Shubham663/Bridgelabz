package bridgelabz.Mood_Analyzer;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class MoodAnalyzerTest 
{
	private MoodAnalyzer moodAnalyzer ;
	
	@Before
	public void init() {
		moodAnalyzer = new MoodAnalyzer("NULL");
	}
    /**
     * Rigorous Test :-)
     */
    @Test
    public void checkMoodNull()
    {
        assertEquals("Happy", moodAnalyzer.analyseMood() );
    }
    
    @Test
    public void checkMoodEmpty(){
    	assertEquals("Happy",moodAnalyzer.analyseMood());
    }
    
}
