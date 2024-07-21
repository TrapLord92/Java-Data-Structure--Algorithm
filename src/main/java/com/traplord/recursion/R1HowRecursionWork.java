package com.traplord.recursion;

public class R1HowRecursionWork {
    //How recursion works?

    static int factorial( int n){

        if (n==1){
            return 1;
        }
        else{
            return n * factorial(n-1);
        }


    }

    //Explaining

   // recursion formula: n * factorial(n-1)


    /* start point finding n value
                        //n-1=4
    * fatorial(5) = 5 * factorial(4)

                       //n-1=3
    * fatorial(4) = 4 * factorial(3)

                       //n-1=2

    * fatorial(3) = 3 * factorial(2)
    *
    fatorial(2) = 2 * factorial(1)
     fatorial(1) = 1

     then
end point: finding factioral value of n=5
     fatorial(2) = 2 * 1 = 2
     fatorial(3) = 3 * 2 = 6
     fatorial(4) = 4 * 6 = 24
     fatorial(5) = 5 * 24 = 120
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

    public static void main (String[] args) {
        System.out.println("Fatcorial of 5 is " + factorial(5));
    }







}
