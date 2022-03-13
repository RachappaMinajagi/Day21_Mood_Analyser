package moodAnalyser;

/*
 * Given a Message, ability to analyse and respond
   Happy or Sad Mood - Create MoodAnalyser Object - Call analyseMood function with message as
   parameter and return Happy or Sad Mood
 */
public class MoodAnalyser {
	private String message;

	/*
	 * create Constructor for MoodAnalyser
	 */
	public MoodAnalyser() {
		this.message = null;
	}

	public MoodAnalyser(String message) {
		this.message = message;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String analyseMood() {
		if (message.toLowerCase().contains("happy") || message.toLowerCase().contains("any")) {
			return "HAPPY";
		} else if (message.toLowerCase().contains("sad")) {
			return "SAD";
		} else {
			return null;
		}
	}

	public static void main(String args[]) {
		System.out.println("Mood Analyser");
		/*
		 * create object of MoodAnalyser
		 */
		MoodAnalyser moodAnalyser = new MoodAnalyser();

		moodAnalyser.setMessage("I am Happy");
		System.out.println(moodAnalyser.analyseMood());

		moodAnalyser.setMessage("I am Sad");
		System.out.println(moodAnalyser.analyseMood());
	}
}