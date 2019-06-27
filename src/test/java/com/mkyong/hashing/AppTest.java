package com.mkyong.hashing;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class AppTest 
    extends TestCase
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public AppTest( String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( AppTest.class );
    }

    /**
     * Rigourous Test :-)
     */
    public void testApp()
    {
        assertTrue( true );
    }

	public void TestEvenOdd(){
	
		App obj = new App();
		String result = obj.checkevenodd(10);
		String expected = "even";
		assertEquals(result, expected);
		
	}

  public void TestEvenOdd1(){
	
		App obj1 = new App();
		String result = obj1.checkevenodd(11);
		String expected = "odd";
		assertEquals(result, expected);
	}
}
