package string.problems;


import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by mrahman on 4/9/16.
 */
public class Anagram {

    public static void main(String[] args) {
        //Write a Java Program to check if the two String are Anagram. Two String are called Anagram when there is
        //same character but in different order.For example,"CAT" and "ACT", "ARMY" and "MARY".

        System.out.println("Enter First String");
         Scanner sc= new Scanner(System.in);
        String st1=sc.nextLine();
        System.out.println("Enter Second String");
        String st2=sc.nextLine();


        boolean status=true;

        // checking if both sting contains same length
        if (st1.length()!=st2.length()){
            status=false;
        }
        else {
// converting string into arrays
            char[] st1Array=st1.toLowerCase().toCharArray();
            char[] st2Array=st2.toLowerCase().toCharArray();


// sorting both arrays
            Arrays.sort(st1Array);
            Arrays.sort(st2Array);

            // checking both strings are equal
            status=Arrays.equals(st1Array,st2Array);
        }

        //output

        if (status){
            System.out.println(st1+" and "+st2+" are anagram");
        }
        else {
            System.out.println(st1+" and "+st2+" are not anagram");
        }



    }
}
