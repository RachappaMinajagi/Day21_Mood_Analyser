package moodAnalyser;

/*
 * TC 1.2 Repeat To pass this Test Case when calling
          analyseMood method with no params should return Happy
 */
public class MoodAnalyser {
	private String message;

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

		MoodAnalyser moodAnalyser = new MoodAnalyser();

		moodAnalyser.setMessage("I am Happy");
		System.out.println(moodAnalyser.analyseMood());

		moodAnalyser.setMessage("I am Sad");
		System.out.println(moodAnalyser.analyseMood());
	}
}