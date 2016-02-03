package edu.carrollcc.cis232;

import static com.jcabi.matchers.RegexMatchers.matchesPattern;
import static org.junit.Assert.assertThat;
import static org.junit.contrib.java.lang.system.TextFromStandardInputStream.emptyStandardInputStream;

import org.junit.Rule;
import org.junit.Test;
import org.junit.contrib.java.lang.system.ExpectedSystemExit;
import org.junit.contrib.java.lang.system.SystemOutRule;
import org.junit.contrib.java.lang.system.TextFromStandardInputStream;

public class Question2Test {

	private static final String RX_INVALID = "(?smiu).*\n?invalid.*\n?$";

	@Rule
    public final TextFromStandardInputStream systemInMock= emptyStandardInputStream();

    @Rule
	public final SystemOutRule systemOutRule = new SystemOutRule().enableLog();
    
    @Rule
    public final ExpectedSystemExit exit = ExpectedSystemExit.none();

    
    @Test
    /**
	 * Ensures the code will show invalid input message
	 */
    public void testInvalidInput(){
    	exit.expectSystemExit();
        systemInMock.provideText("One,Two");
    	Question2.main(null);
    	String output = systemOutRule.getLogWithNormalizedLineSeparator();
        assertThat(output, matchesPattern(RX_INVALID));
        System.exit(0);
    }
    
    @Test
    /**
	 * Tests for handling of integer values
	 */
    public void testIntegerAverage()
    {
    	exit.expectSystemExit();
        systemInMock.provideText("1,2,3");
    	Question2.main(null);
    	String output = systemOutRule.getLogWithNormalizedLineSeparator();
        assertThat(output, matchesPattern("(?smiu).*\n?2.000\n?$"));
        System.exit(0);
    }
    
    @Test
    /**
	 * Tests for handling of double values
	 */
    public void testDoubleInput()
    {
    	exit.expectSystemExit();
        systemInMock.provideText("1,2.5,2.5,6");
    	Question2.main(null);
    	String output = systemOutRule.getLogWithNormalizedLineSeparator();
        assertThat(output, matchesPattern("(?smiu).*\n?3.000\n?$"));
        System.exit(0);
    }
    
    @Test
    /**
	 * Tests limit to 3 decimal values
	 */
    public void testLimitToThreeDecimal()
    {
    	exit.expectSystemExit();
        systemInMock.provideText("1,2.5,2.5,6,9,100,2,172.3232,1.41414141414,2.3333333");
    	Question2.main(null);
    	String output = systemOutRule.getLogWithNormalizedLineSeparator();
        assertThat(output, matchesPattern("(?smiu).*\n?29.907\n?$"));
        System.exit(0);
    }
}
