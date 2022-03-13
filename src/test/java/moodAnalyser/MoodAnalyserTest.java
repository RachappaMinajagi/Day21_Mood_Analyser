package moodAnalyser;

import org.junit.Assert;
import org.junit.Test;

public class MoodAnalyserTest {
	/*
	 * Create method for TestCase For Sad and Any Mood
	 */

	@Test
	public void analyseSadMood() {
		MoodAnalyser moodAnalyser = new MoodAnalyser();
		moodAnalyser.setMessage("I am in Sad Mood");
		String actualResult = moodAnalyser.analyseMood();
		Assert.assertEquals("SAD", actualResult);
	}

	@Test
	public void analyseAnyMood() {
		MoodAnalyser moodAnalyser = new MoodAnalyser();
		moodAnalyser.setMessage("I am in any Mood");
		String actualResult = moodAnalyser.analyseMood();
		Assert.assertEquals("HAPPY", actualResult);
	}
}