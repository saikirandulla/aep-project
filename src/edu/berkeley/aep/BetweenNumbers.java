package edu.berkeley.aep;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by macbook on 4/28/17.
 */
public class BetweenNumbers {
    private List<Integer> inputNumbers = new ArrayList<>();

    public <T> T calculateBetweenNumbers(List<Integer> inputNumbers) {
        this.inputNumbers = inputNumbers;
        return (T) this.inputNumbers;

    }
}
