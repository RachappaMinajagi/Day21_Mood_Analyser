package moodAnalyser;

/*
 * TC 1.2 Any Mood TestCase Mood Analyser
 */
public class MoodAnalyser {
	public static void main(String args[]) {
		System.out.println("Mood Analyser");
		/*
		 * create object of moodAnalyser
		 */
		MoodAnalyser moodAnalyser = new MoodAnalyser();
		String message = moodAnalyser.analyseMood("I am Happy");
		System.out.println(message);
		message = moodAnalyser.analyseMood("I am Sad");
		System.out.println(message);
	}

	public String analyseMood(String message) {
		if (message.toLowerCase().contains("happy") || message.toLowerCase().contains("any")) {
			return "HAPPY";
		} else if (message.toLowerCase().contains("sad")) {
			return "SAD";
		} else {
			return null;
		}
	}
}