package edu.berkeley.aep;

//Computes the nth number of the Fibonacci Sequence
public class Fibonacci {
    private int nthFibonacciNumber;

    public int calculateFibonacciNumber(int nthFibonacciNumber) {
        this.nthFibonacciNumber = nthFibonacciNumber;
        if (nthFibonacciNumber == 0) return 0;
        else if (nthFibonacciNumber == 1 | nthFibonacciNumber == 2) return 1;
    return -1;
    }
}
