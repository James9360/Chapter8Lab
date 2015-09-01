package edu.carrollcc.cis232;

import static com.jcabi.matchers.RegexMatchers.matchesPattern;
import static org.junit.Assert.*;
import static org.junit.contrib.java.lang.system.TextFromStandardInputStream.emptyStandardInputStream;

import org.junit.Rule;
import org.junit.Test;
import org.junit.contrib.java.lang.system.SystemOutRule;
import org.junit.contrib.java.lang.system.TextFromStandardInputStream;

public class Question1Test {

	@Rule
    public final TextFromStandardInputStream systemInMock= emptyStandardInputStream();

    @Rule
	public final SystemOutRule systemOutRule = new SystemOutRule().enableLog();

    
    @Test
    /**
	 * Ensures the code can handle a single word
	 */
    public void testSingleWord()
    {
        systemInMock.provideText("hello");
    	Question1.main(null);
    	String output = systemOutRule.getLogWithNormalizedLineSeparator();
        assertThat(output, matchesPattern("(?m).*\n?Hello\n?$"));
    }
	
	@Test
	/**
	 * Ensures the code handles . as a sentence ender
	 */
	public void testWithPeriod() {
		systemInMock.provideText("most people believe that if it ain't broke, don't fix it. engineers believe that if it ain't broke, it doesn't have enough features yet.");
    	Question1.main(null);
    	String output = systemOutRule.getLogWithNormalizedLineSeparator();
        assertThat(output, matchesPattern("(?m).*\n?Most people believe that if it ain't broke, don't fix it. Engineers believe that if it ain't broke, it doesn't have enough features yet.\n?$"));
	}
	
	@Test
	/**
	 * Ensures the code handles ? as a sentence ender
	 */
	public void testWithQuestionMarks() {
		systemInMock.provideText("why do they call it hyper text? too much JAVA.");
    	Question1.main(null);
    	String output = systemOutRule.getLogWithNormalizedLineSeparator();
        assertThat(output, matchesPattern("(?m).*\n?Why do they call it hyper text? Too much JAVA.\n?$"));
	}
	
	@Test
	/**
	 * Ensures the code handles ! as a sentence ender
	 */
	public void testWithExclamationMark() {
		systemInMock.provideText("hey! you're looking at this! wow!");
    	Question1.main(null);
    	String output = systemOutRule.getLogWithNormalizedLineSeparator();
        assertThat(output, matchesPattern("(?m).*\n?Hey! You're looking at this! Wow!\n?$"));
	}
	

}
