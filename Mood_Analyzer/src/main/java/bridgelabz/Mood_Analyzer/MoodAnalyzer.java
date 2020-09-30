package bridgelabz.Mood_Analyzer;

public class MoodAnalyzer {
	private String mood;
	private String message=null;
	private MoodErrors moodErrors;
	
	public MoodAnalyzer() {
		super();
	}
	
	public enum MoodErrors{
		NULL,
		EmptyMood;
	}

	public MoodAnalyzer(String message) {
		super();
		this.message = message;
	}


	public String analyseMood() {
		if(message == null)
			message = "I am in Sad mood";
		if(message.contains("NULL") || message.length()==0)
		{
			if(message.contains("NULL"))
				moodErrors = MoodErrors.NULL;
			else
				moodErrors = MoodErrors.EmptyMood;
			try
			{
				if(moodErrors == MoodErrors.NULL)
					throw new NullMoodException(" the mood message provided by user is NULL");
				else
					throw new NullMoodException(" the mood message provided by user is Empty");
			}catch(NullMoodException e) {
				System.err.println("Execution ended because" + e.getMessage());
			}
			finally {
				return "Happy";
			}
		}
		if(message.contains("Happy"))
			mood = "SAD";
		else
			mood = "HAPPY";
		return mood;
	}
}
