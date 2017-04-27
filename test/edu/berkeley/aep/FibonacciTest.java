package edu.berkeley.aep;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.core.IsNull.nullValue;
import static org.junit.Assert.assertEquals;
import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.assertThat;



public class FibonacciTest {
    private Fibonacci fibonacci;

    @Before
    public void setUp() throws Exception {
        fibonacci = new Fibonacci();
    }

    @Test
    public void shouldReturnAValueGivenInput() throws Exception{
        int nthFibonacciNumber =40;
        assertThat(fibonacci.calculateFibonacciNumber(nthFibonacciNumber), not(nullValue()));

    }

    @Test
    public void firstTermOfFibonacciSeriesShouldBe0() throws Exception{
        int nthFibonacciNumber =0;
        assertEquals(0, fibonacci.calculateFibonacciNumber(nthFibonacciNumber));

    }

    @Test
    public void SecondTermOfFibonacciSeriesShouldBe1() throws Exception{
        int nthFibonacciNumber =1;
        assertEquals(1, fibonacci.calculateFibonacciNumber(nthFibonacciNumber));

    }

}
