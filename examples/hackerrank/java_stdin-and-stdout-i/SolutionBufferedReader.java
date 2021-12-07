import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

// Using the Scanner class
public class SolutionBufferedReader {

    public static void main(String[] args) {

        // https://docs.oracle.com/javase/8/docs/api/java/io/InputStreamReader.html
        InputStreamReader isr = new InputStreamReader(System.in);

        // https://docs.oracle.com/javase/8/docs/api/java/io/BufferedReader.html
        BufferedReader br = new BufferedReader(isr);
        
        // array to keep the numbers
        int[] a = new int[3];

        // First read and print latter
        for(int i=0;i<3;i++){
            try {
                a[i] = Integer.parseInt(br.readLine());
            } catch (Exception e) {
                System.out.println("Couldn`t read number");
            }
        }

        for(int i=0;i<3;i++){
            System.out.println(a[i]);
        }
    }
}