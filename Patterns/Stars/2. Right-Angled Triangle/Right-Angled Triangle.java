//So we have to print the stars as inverted half pyramid

import java.util.Scanner;

public class FallingStars{

    public static void main(String[] args)
    {

        Scanner scn = new Scanner(System.in);

        int n = scn.nextInt();

        for(int i = 1; i<=n ;i++)
        {

            for (int j = 1; j<=i; j++ )
            {
                System.out.print("* ");  //print oon same line

            }   System.out.println();      // cursor move to next line after each row
        }  
    }
}