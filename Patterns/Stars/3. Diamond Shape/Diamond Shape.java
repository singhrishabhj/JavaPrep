import java.util.Scanner;

public class FallingStars {

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);

        int n = scn.nextInt();
        int sp = n / 2; // Initial spaces
        int str = 1;    // Initial stars

        // Upper half of the diamond
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= sp; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= str; k++) {
                System.out.print("*");
            }

            // Adjust spaces and stars for next row
            if (i < n / 2) {
                str += 2;  // Increase stars
                sp--;      // Decrease spaces
            } else {
                str -= 2;  // Decrease stars
                sp++;      // Increase spaces
            }
            System.out.println(); // Move to the next line
        }
    }
}
