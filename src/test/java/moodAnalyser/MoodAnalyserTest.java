package moodAnalyser;

import org.junit.Assert;
import org.junit.Test;

/*
 * create a class name as MoodAnalyserTest
 */

public class MoodAnalyserTest {
	@Test
	public void analyseSadMood() {
		MoodAnalyser moodAnalyser = new MoodAnalyser();
		moodAnalyser.setMessage("I am in Sad Mood");
		String actualResult = moodAnalyser.analyseMood();
		Assert.assertEquals("SAD", actualResult);
	}

	/*
	 * create object for MoodAnalyser
	 */
	@Test
	public void analyseHappyMood() {
		MoodAnalyser moodAnalyser = new MoodAnalyser();
		moodAnalyser.setMessage("I am in Happy Mood");
		String actualResult = moodAnalyser.analyseMood();
		Assert.assertEquals("HAPPY", actualResult);
	}
}