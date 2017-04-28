package edu.berkeley.aep;

import java.util.ArrayList;
import java.util.List;

//Returns the integers between a list of integers in the format 2, 4, 11-15
public class BetweenNumbers {
    private List<Integer> inputNumbers = new ArrayList<>();

    public <T> T calculateBetweenNumbers(List<Integer> inputNumbers) {
        this.inputNumbers = inputNumbers;
        List<String> outputNumbers = new ArrayList<>();
        for (int i=0; i< inputNumbers.size()-1; i++){
            if((inputNumbers.get(i+1) - inputNumbers.get(i)) <= 1){
                continue;
            }
            else if ((inputNumbers.get(i+1) - inputNumbers.get(i)) == 2){
                outputNumbers.add(String.valueOf(inputNumbers.get(i)+1));
            }
            else{
                String a = String.valueOf(inputNumbers.get(i) + 1);
                String b = String.valueOf(inputNumbers.get(i+1) -1);
                String c = "-";

                outputNumbers.add(a+c+b);

            }
        }

    return (T) outputNumbers;}
}
