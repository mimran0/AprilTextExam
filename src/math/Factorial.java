package math;

import java.util.Scanner;

/**
 * Created by mrahman on 4/9/16.
 */
public class Factorial {

    public static void main(String[] args) {
        /*
         * Factorial of 5! = 5 x 4 X 3 X 2 X 1 = 120.
         * Write a java program to find Factorial of a given number using Recursion as well as Iteration.
         *
         */


        // Iteration Way..

        System.out.println(("Ente a number"));
        Scanner sc=new Scanner(System.in);


           int input;

        input=sc.nextInt();




            int Result=1;

            for (int i = 1; i <= input; i++) {

                Result *= i;

            }

            System.out.println("Factorial Number of "+input+" is "+Result);







    }
}
