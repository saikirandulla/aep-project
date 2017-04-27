package edu.berkeley.aep;

//Computes the nth number of the Fibonacci Sequence
public class Fibonacci {
    private int nthFibonacciNumber;

    public int calculateFibonacciNumber(int nthFibonacciNumber) {
        this.nthFibonacciNumber = nthFibonacciNumber;
        if (nthFibonacciNumber == 1) return 0;
        else if (nthFibonacciNumber == 2 | nthFibonacciNumber == 3) return 1;
        else {

            return (calculateFibonacciNumber(nthFibonacciNumber - 1) + calculateFibonacciNumber(nthFibonacciNumber -2));
        }
    }
}
