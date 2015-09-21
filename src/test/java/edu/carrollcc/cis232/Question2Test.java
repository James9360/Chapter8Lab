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

	private static final String RX_INVALID_AMOUNT = "(?smiu).*\n?invalid amount.*\n?$";

	@Rule
    public final TextFromStandardInputStream systemInMock= emptyStandardInputStream();

    @Rule
	public final SystemOutRule systemOutRule = new SystemOutRule().enableLog();
    
    @Rule
    public final ExpectedSystemExit exit = ExpectedSystemExit.none();

    
    @Test
    /**
	 * Ensures the code can handle a 0 to show "invalid amount"
	 */
    public void testZeroDollars(){
    	exit.expectSystemExit();
        systemInMock.provideText("0");
    	Question2.main(null);
    	String output = systemOutRule.getLogWithNormalizedLineSeparator();
        assertThat(output, matchesPattern(RX_INVALID_AMOUNT));
        System.exit(0);
    }
    
    @Test
    /**
	 * Ensures the code can handle a negative number to show "invalid amount"
	 */
    public void testNegativeAmount()
    {
    	exit.expectSystemExit();
        systemInMock.provideText("-10");
    	Question2.main(null);
    	String output = systemOutRule.getLogWithNormalizedLineSeparator();
        assertThat(output, matchesPattern(RX_INVALID_AMOUNT));
        System.exit(0);
    }
    
    @Test
    /**
	 * Ensures the code can handle a 1 to show One and no cents
	 */
    public void testOneDollar()
    {
        systemInMock.provideText("1");
    	Question2.main(null);
    	String output = systemOutRule.getLogWithNormalizedLineSeparator();
        assertThat(output, matchesPattern("(?smiu).*\n?one and (no|00?) cents\n?$"));
    }
    
    @Test
    /**
	 * Ensures the code can handle 1 cent to display 1 cent
	 */
    public void testOneCent()
    {
        systemInMock.provideText(".01");
    	Question2.main(null);
    	String output = systemOutRule.getLogWithNormalizedLineSeparator();
        assertThat(output, matchesPattern("(?smiu).*\n?0?1 cent\n?$"));
    }
    
    @Test
    /**
	 * Ensures the code can handle 99 cents
	 */
    public void test99Cents()
    {
        systemInMock.provideText(".99");
    	Question2.main(null);
    	String output = systemOutRule.getLogWithNormalizedLineSeparator();
        assertThat(output, matchesPattern("(?smiu).*\n?99 cents\n?$"));
    }
    
    @Test
    /**
	 * Ensures the code can handle one hundred dollars
	 */
    public void testOneHundredDollars()
    {
        systemInMock.provideText("100.00");
    	Question2.main(null);
    	String output = systemOutRule.getLogWithNormalizedLineSeparator();
        assertThat(output, matchesPattern("(?smiu).*\n?one hundred and (no|00?) cents\n?$"));
    }
    
    @Test
    /**
	 * Ensures the code can handle one thousand dollars
	 */
    public void testOneThousandDollars()
    {
        systemInMock.provideText("1000.00");
    	Question2.main(null);
    	String output = systemOutRule.getLogWithNormalizedLineSeparator();
        assertThat(output, matchesPattern("(?smiu).*\n?one thousand and (no|00?) cents\n?$"));
    }
	
    @Test
    /**
	 * Ensures the code can handle one million dollars
	 */
    public void testOneMillionDollars()
    {
        systemInMock.provideText("1000000.00");
    	Question2.main(null);
    	String output = systemOutRule.getLogWithNormalizedLineSeparator();
        assertThat(output, matchesPattern("(?smiu).*\n?one million and (no|00?) cents\n?$"));
    }
    
    @Test
    /**
	 * Ensures the code can handle a large number
	 */
    public void testALargeNumber()
    {
        systemInMock.provideText("901258.25");
    	Question2.main(null);
    	String output = systemOutRule.getLogWithNormalizedLineSeparator();
        assertThat(output, matchesPattern("(?smiu).*\n?nine hundred one thousand two hundred fifty-eight and 25 cents\n?$"));
    }
    
    @Test
    /**
	 * Ensures the code can handle a large number with hyphens
	 */
    public void testALotOfHyphens()
    {
        systemInMock.provideText("31021.99");
    	Question2.main(null);
    	String output = systemOutRule.getLogWithNormalizedLineSeparator();
        assertThat(output, matchesPattern("(?smiu).*\n?thirty-one thousand twenty-one and 99 cents\n?$"));
    }
    
    @Test
    /**
	 * Ensures the code can handle invalid input
	 */
    public void testNonNumber()
    {
    	exit.expectSystemExit();
        systemInMock.provideText("hi");
    	Question2.main(null);
    	String output = systemOutRule.getLogWithNormalizedLineSeparator();
    	assertThat(output, matchesPattern(RX_INVALID_AMOUNT));
    	System.exit(0);
    }
    
    @Test
    /**
	 * Ensures the code can handle 0s appended to the end of the cents
	 */
    public void testExtraZeroes()
    {
        systemInMock.provideText("123.23000000");
    	Question2.main(null);
    	String output = systemOutRule.getLogWithNormalizedLineSeparator();
    	assertThat(output, matchesPattern("(?smiu).*\n?one hundred twenty-three and 23 cents\n?$"));
    }
}
