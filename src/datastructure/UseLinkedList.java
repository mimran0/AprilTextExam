package datastructure;

import java.util.LinkedList;

public class UseLinkedList {

	public static void main(String[] args) {
		/*
		 * Demonstrate how to use LinkedList that includes add,peek,remove,retrieve elements.
		 * Use For Each loop and while loop with Iterator to retrieve data.
		 * 
		 */
		LinkedList ll = new LinkedList();

		ll.add("F");
		ll.add("B");
		ll.add("D");
		ll.add("E");
		ll.add("C");
		ll.addLast("Z");
		ll.addFirst("A");
		ll.add(1, "A2");
		System.out.println("Original contents of ll: " + ll);


		// remove elements from the linked list
		ll.remove("F");
		ll.remove(2);
		System.out.println("Contents of ll after deletion: "
				+ ll);

		// remove first and last elements
		ll.removeFirst();
		ll.removeLast();
		System.out.println("ll after deleting first and last: "
				+ ll);

		// get and set a value
		Object val = ll.get(2);
		ll.set(2, (String) val + " Changed");
		System.out.println("ll after change: " + ll);

// Using for loop to retived data
		System.out.println("Below are the output of for loop");
		for (int i=0;i<=ll.size()-1;i++){
			System.out.println(ll.get(i));
		}


		//using for each loop
		System.out.println("Below are the output of for each loop");

		for (Object j:ll){
			System.out.println(j);
		}

		// using while loop
		System.out.println("Below are the output of while loop");
		int k=0;

		while (k<=ll.size()){
			System.out.println(ll.get(k));
			k=k+1;
		}


	}

}
