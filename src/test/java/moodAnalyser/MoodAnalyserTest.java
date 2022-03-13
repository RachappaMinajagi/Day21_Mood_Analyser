package moodAnalyser;

import org.junit.Assert;
import org.junit.Test;

public class MoodAnalyserTest {
	@Test
	public void analyseSadMood() {
		MoodAnalyser moodAnalyser = new MoodAnalyser();
		String actualResult = moodAnalyser.analyseMood("I am Sad in Mood");
		Assert.assertEquals("SAD", actualResult);
	}

	@Test
	public void analyseAnyMood() {
		MoodAnalyser moodAnalyser = new MoodAnalyser();
		String actualResult = moodAnalyser.analyseMood("I am Any in Mood");
		Assert.assertEquals("HAPPY", actualResult);
	}
}