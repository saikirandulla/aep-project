package edu.berkeley.aep;

import org.junit.Before;
import org.junit.Test;
import java.util.ArrayList;
import java.util.List;

import static org.hamcrest.CoreMatchers.not;
import static org.hamcrest.core.IsNull.nullValue;
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

}
