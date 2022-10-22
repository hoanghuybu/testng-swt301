
package com.tien.fibonacci.core;

public class CheckFibonacci {

    // A utility method that returns true if x is perfect square
    public static boolean isPerfectSquare(int x) {
        int s = (int) Math.sqrt(x);
        return (s * s == x);
    }

    // Returns true if n is a Fibonacci Number, else false
    public static boolean isFibonacci(int n) {
        // n is Fibonacci if one of 5*n*n + 4 or 5*n*n - 4 or both
        // is a perfect square
        return isPerfectSquare(5 * n * n + 4)
                || isPerfectSquare(5 * n * n - 4);
    }

    //check the index of the Fibonacci number input
    public static int checkIndex(int n)
    {   
        // if Fibonacci number is less
        // than 2, its index will be
        // same as number
        if (n <= 1)
            return n;
     
        int a = 0, b = 1, c = 1;
        int res = 1;
     
        // iterate until generated fibonacci
        // number is less than given
        // fibonacci number
        while (c < n)
        {
            c = a + b;
             
            // res keeps track of number of
            // generated fibonacci number
            res++;
            a = b;
            b = c;
        }
    
        return res;
    }  
}
