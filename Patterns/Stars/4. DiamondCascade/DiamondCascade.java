// DiamondCascade

import java.util.Scanner;

public class DiamondCascade{
    public static void main(String[] args){

        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int ans = DC(n);
        System.out.println(ans);
    }

    public static void DC(n){

        int str = 1;

        for(int i = 0 ; i <= n; i++){
            for(int j = 0; j <= str; j++){
                System.out.print("* ");
            }

            if(i == n/2){
                str ++;
            }else{
                str--;
            }
            System.out.println();
        }
    }
}