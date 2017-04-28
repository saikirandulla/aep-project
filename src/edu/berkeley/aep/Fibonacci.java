package edu.berkeley.aep;

//Computes the nth number of the Fibonacci Sequence
public class Fibonacci {
    private int nthFibonacciNumber;

    public int calculateFibonacciNumber(int nthFibonacciNumber) {

        if (nthFibonacciNumber < 0) {
            throw new IllegalArgumentException("Negative Numbers not Allowed");
        }

        this.nthFibonacciNumber = nthFibonacciNumber;
        if (this.nthFibonacciNumber == 0) return 0;
        else if (this.nthFibonacciNumber == 1 | this.nthFibonacciNumber == 2) return 1;
        else {

            return (calculateFibonacciNumber(this.nthFibonacciNumber - 1)
                    + calculateFibonacciNumber(this.nthFibonacciNumber - 2));
        }

        }

    public int calculateFibonacciNumberWoRecursion(int nthFibonacciNumber) {
        if (nthFibonacciNumber < 0) {
            throw new IllegalArgumentException("Negative Numbers not Allowed");
        }
        this.nthFibonacciNumber = nthFibonacciNumber;
        if (this.nthFibonacciNumber == 0) return 0;
        else if (this.nthFibonacciNumber == 1 | this.nthFibonacciNumber == 2) return 1;
        else {
            int fib =1;
            int prev_fib = 1;
            for (int i =2; i <this.nthFibonacciNumber; ++i){
                int temp = fib;
                fib += prev_fib;
                prev_fib = temp;
            }
            return fib;
        }

    }
}

