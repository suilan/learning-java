import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        // https://docs.oracle.com/javase/7/docs/api/java/util/Scanner.html
        Scanner scan = new Scanner(System.in);
        
        // change delimeter to new line 
        scan.useDelimiter("[;\r\n]+");
        int i = scan.nextInt();

        // Write your code here.
        double d = scan.nextDouble();

        String s = scan.next();

        System.out.println("String: " + s);
        System.out.println("Double: " + d);
        System.out.println("Int: " + i);
    }
}