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
		moodAnalyzer = new MoodAnalyzer("");
	}
    /**
     * Rigorous Test :-)
     */
    @Test
    public void checkMoodNull_Or_Empty()
    {
        assertEquals("Happy", moodAnalyzer.analyseMood() );
    }
    
    
    
}
