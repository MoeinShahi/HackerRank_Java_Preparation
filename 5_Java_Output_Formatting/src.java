import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("================================");
        for (int i = 0; i < 3; i++) {
            String s1 = sc.next();         // Read the string
            int x = sc.nextInt();          // Read the integer
            
            // Pad the string to ensure it takes 15 characters, left-aligned
            s1 = String.format("%-15s", s1); // Format the string to 15 characters
            
            // Format the integer to ensure it has at least 3 digits, padded with zeros
            String newX = String.format("%03d", x); 
            
            // Print the formatted string and integer
            System.out.println(s1 + newX);
        }
        System.out.println("================================");
        sc.close();
    }
}
