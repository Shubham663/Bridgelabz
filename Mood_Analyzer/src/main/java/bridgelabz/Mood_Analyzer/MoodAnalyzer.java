package bridgelabz.Mood_Analyzer;

public class MoodAnalyzer {
	private String mood;
	private String message="";
	
	public MoodAnalyzer() {
		super();
	}


	public MoodAnalyzer(String message) {
		super();
		this.message = message;
	}


	public String analyseMood() {
		if(message.length()==0)
			message = "I am in Sad mood";
		if(message.contains("Sad"))
			mood = "SAD";
		else
			mood = "HAPPY";
		return mood;
	}
}
