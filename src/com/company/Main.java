package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        System.out.println ("Enter your number here: ");
        int i;
        int k = scan.nextInt();
        int j;
        for (i = 0; i <= k-1; i++) {
            //i = 0; i<=3 ==TRUE;
            // i=1; 1<=3 ==TRUE
            // i=2; 2<=3 == TRUE
            //i = 3 3<=3 == TRUE
            //i = 4 4<=3 == FALSE /out of the loop

            for (j = 1; j <= k - i; j++){
                //j=1; j<=4-i(0)  - TRUE
                //j=2; j<=4-i(0) - TRUE
                //j=3; j<=4-i(0)  - TRUE
                //j=4; j<=4-i(0)  - TRUE
                //j=5; j<=4-i(0) - FALSE OUT OF THE LOOP
                //-----------
                //j=1; j<=4-i(1)  - TRUE
                //j=2; j<=4-i(1) - TRUE
                //j=3; j<=4-i(1)  - TRUE
                //j=4; j<=4-i(1)  - false - out of the loop
                //-----------
                //j=1; j<=4-i(2)  - TRUE
                //j=2; j<=4-i(2) - TRUE
                //j=3; j<=4-i(2)  - false - out of the loop
                //---------
                //j=1; j<=4-i(3)  - TRUE
                //j=2; j<=4-i(3) - false - out of the loop
                //----------
                //j=1; j<=4-i(4)  - false - out of the loop
                System.out.print("*");
            }

            System.out.println("");

        }

    }
}


