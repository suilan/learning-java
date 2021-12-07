// TO-DO:SolutionScanner
// Comment the unnecessary imports because it was copy from hackerrank and is not in use in this local code.
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // The class Scanner is to read from the Stdin (Standard Input)
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int N = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        // Condition from the problem statement
        if( N>0 && N<=100 ){
            isWeird(N);
        }

        scanner.close();
    }

    public static void isWeird(int number){

        // the % symbol returns the rest of the division
        if( (number%2)>0 ){
            System.out.println("Weird");
        }
        else if(number>20){
            System.out.println("Not Weird");
        }
        else if(number>5){
            System.out.println("Weird");
        }else if(number>1){
            System.out.println("Not Weird");
        }
    }
}