package datastructure;

import java.util.ArrayList;

public class UseArrayList {

	public static void main(String[] args) {
		/*
		 * Demonstrate how to use ArrayList that includes add,peek,remove,retrieve elements.
		 * Use For Each loop and while loop with Iterator to retrieve data.
		 * 
		 */

		// Creating a arraylist.
		ArrayList al=new ArrayList();
		System.out.println(al.size());

		// adding values with element
		al.add(0, "3");
		al.add(1, "3");
		al.add(2, 8);
		al.add(3, "hello");
		al.add(4, " this is wipro");
		System.out.println(al.size());

		// display the arraylist
		System.out.println(al);

		// there is not peek method for arraylist.


       // removing an element
		al.remove(4);
		System.out.println(al);

       // retrive element
		Object abc = al.get(3);
		System.out.println(abc);
		System.out.println(al.get(2));

		// using for loop to retrive data
            System.out.println("Using for loop below output is displayed in the console");
		for (int i=0;i<=al.size()-1;i++){
			System.out.println(al.get(i));
		}
		// using for each loop
		System.out.println("Using for loop each below output is displayed in the console");
         for (Object o:al){
			 System.out.println(o);
		 }

		// using while loop
		System.out.println("Using while loop below output is displayed in the console");
		int j=0;
		while (j<=al.size()){
			System.out.println(al.get(j));
			j++;
		}


	}

}
