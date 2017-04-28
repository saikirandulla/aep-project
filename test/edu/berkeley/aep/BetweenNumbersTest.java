package edu.berkeley.aep;

import org.junit.Before;
import org.junit.Test;
import java.util.ArrayList;
import java.util.List;

import static org.hamcrest.CoreMatchers.not;
import static org.hamcrest.core.IsNull.nullValue;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;


public class BetweenNumbersTest {
    private BetweenNumbers betweenNumbers;
    @Before
    public void setUp() throws Exception {
        betweenNumbers = new BetweenNumbers();
    }
    @Test
    public void shouldReturnAValueGivenInput() throws Exception{
        List<Integer> inputNumbers = new ArrayList<>();
        inputNumbers.add(3);
        assertThat(betweenNumbers.calculateBetweenNumbers(inputNumbers), not(nullValue()));

    }
    @Test
    public void shouldReturnListOf1GivenInputList02() throws Exception{
        List<Integer> inputNumbers = new ArrayList<>();
        inputNumbers.add(0);
        inputNumbers.add(2);
        List<String> outputNumbers = new ArrayList<>();
        outputNumbers.add("1");
        assertEquals(betweenNumbers.calculateBetweenNumbers(inputNumbers), outputNumbers);

    }
    @Test
    public void shouldReturnListOf15GivenInputList02346() throws Exception {
        List<Integer> inputNumbers = new ArrayList<>();
        inputNumbers.add(0);
        inputNumbers.add(2);
        inputNumbers.add(3);
        inputNumbers.add(4);
        inputNumbers.add(6);
        List<String> outputNumbers = new ArrayList<>();
        outputNumbers.add("1");
        outputNumbers.add("5");
        assertEquals(betweenNumbers.calculateBetweenNumbers(inputNumbers), outputNumbers);
    }

}
