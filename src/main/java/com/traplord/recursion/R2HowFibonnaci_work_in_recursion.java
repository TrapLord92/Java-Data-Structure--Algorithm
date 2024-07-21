package com.traplord.recursion;

public class R2HowFibonnaci_work_in_recursion {

    static int fibonacci(int n) {
        if (n <= 1) {
            return n;
        }
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

//    Explain

    /*
    *word : fibonacci(n) = fibonacci(n-1) + fibonacci(n-2)
    * seed values : fibonacci(0) = 0, fibonacci(1) = 1
    *
    * starting point finding n value
    *          n=5//(5-1) = 4, (5-2) = 3
    * fib(5) = fib(4) + fib(3)
    * fib(4) = fib(3) + fib(2)
    *  n=4//(4-1) = 3, (4-2) = 5
    * fib(3) = fib(2) + fib(1)
    * n=3//(3-1) = 2, (3-2) = 1
    * fib(2) = fib(1) + fib(0)
    * n=2//(2-1) = 1, (2-2) =1
    * fib(1) = fib(0) + 0
    * n=1// = 1
    * n=0// = 0
    *
    * then
    * fibonacci(5) = fibonacci(4) + fibonacci(3)
    * fibonacci(3)= fibonacci(2) + fibonacci(1)
    * fibonacci(2) = fibonacci(1) + fibonacci(0)
    * fibonacci(1) = 1
    * fibonacci(0) = 0
    *
    * end point : finding fibonacci value of n=5
    * fibonacci(5) = 1 + 1 = 2
    *
    *
    *
    *
    *
    *
    *
    *
    *
    *
    *
    *
    *
    *
    *
    *
    *
    *
    *
    *
    *
    *
    *
    *
    *
    * */

























    public static void main(String[] args) {
        int number = 5;
        System.out.println("Fibonacci number at position " + number + " is: " + fibonacci(number));
    }
}
