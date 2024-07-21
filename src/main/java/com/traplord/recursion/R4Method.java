package com.traplord.recursion;

public class R4Method {

    static int functHy(int a,int b){

        if (b == 0){
            return 1;
        }
        if(b%2==0){
            return functHy(a*a,b/2);}

            return functHy(a*a,b/2)*a;

    }

    public static void main(String[] args) {
        int a = 5;
        int b = 10;
        System.out.println("The result of R4 method is: " + functHy(a, b));
    }
}
