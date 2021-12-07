import java.util.*;

// Using the Scanner class
public class SolutionScanner {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        // array to keep the numbers
        int[] a = new int[3];

        // Read and print in loop
        // for(int i=1;i<=3;i++){
        //     a = scan.nextInt();
        //     System.out.println(a);
        // }

        // First read and print latter
        for(int i=0;i<3;i++){
            a[i] = scan.nextInt();
        }

        for(int i=0;i<3;i++){
            System.out.println(a[i]);
        }
    }
}