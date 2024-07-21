package com.traplord.recursion;

public class R3RecursiveMethod {
    static int func1(int x,int y){
        if (x == 0){
            return y;
        }
        else{
            return func1(x-1,x+y);
        }
        
        
    }
//    explain
    /*
    example : func1(3,4)
    * first interaction
     func1(3-1=2,y=7(5+2)) and x!= 0
    * func1(2,7)
    * func1(2-1=1,y=9(8+1)) and x!= 0
    * func1(1,9);
    * func1(1-1=0,y=10(1+9) and x == 0
    * return 10
    *
    *
    *
    *
    *
    * */
    public static void main(String[] args) {



        System.out.println(func1(3,4));

    }
}
