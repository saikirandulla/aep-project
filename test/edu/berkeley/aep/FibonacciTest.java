package edu.berkeley.aep;

/**
 * Created by macbook on 4/26/17.
 */
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class FibonacciTest {
    private Fibonacci nthNumber;

    @Before
    public void setUp() throws Exception {
        nthNumber = new Fibonacci();
    }

    @Test
    public void firstTermOfFibonacciSeriesShouldBe0() throws Exception{
        assertEquals(0, nthNumber.calculateFibonacciNumber());

    }
}
