import java.util.*;
import java.io.*;
import java.math.*;

class Solution {
    public static void main(String[] argh) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt(); // Number of test cases
        for (int i = 0; i < t; i++) {
            int a = in.nextInt(); // Read a
            int b = in.nextInt(); // Read b
            int n = in.nextInt(); // Read n

            //System.out.println("I am just about to enter your code");

            for (int j = 0; j < n; j++) {
                //System.out.println("I am inside J loop");
                int res = 0;

                // Accumulate the result based on the formula
                for (int k = 0; k <= j; k++) {
                    res += (int) Math.pow(2, k) * b; // Cast Math.pow to int
                }

                // Print the result for this iteration
                System.out.print((res + a) + " ");
            }
            System.out.println(); // Move to the next line after each test case
        }
        in.close();
    }
}
