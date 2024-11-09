package com.shilpa;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class HelloWorld {

    /*
     * Complete the 'fizzBuzz' function below.
     *
     * The function accepts INTEGER n as parameter.
     */

    public static void fizzBuzz(int n) {
    // Write yifour code here
        if(n%3==0){
        	
            if(n%5==0)
            {
                System.out.println("FizzBuzz");
            }
            else
            {
                System.out.println("Fizz");
            }
        }
        else
        {
        	
            if(n%5==0)
            {
                System.out.println("Buzz");
            }
            else
            {
                System.out.println(n);
            }
        }
    }
    public static void main(String[] args) throws IOException {
        int n=15;
        for(int i=1;i<=n;i++)
        {
            fizzBuzz(i);
        }
        
    }

}

