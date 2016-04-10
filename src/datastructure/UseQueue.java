package datastructure;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class UseQueue {

	public static void main(String[] args) {
		/*
		 * Demonstrate how to use Queue that includes add,peek,remove,retrieve elements.
		 * Use For Each loop and while loop with Iterator to retrieve data.
		 * 
		 */

		Queue QueueA= new LinkedList<>();
		System.out.println(QueueA);

		// using add method
		QueueA.add("abc");
		QueueA.add("341");
		QueueA.add("&");
		QueueA.add("imran");
		QueueA.add("limon");
		QueueA.add("pen");

		System.out.println(QueueA);
		// using peek method
		System.out.println(QueueA.peek());
		// remove method
		QueueA.remove();
		System.out.println(QueueA);

// Using for each loop
		System.out.println("Below list retrived by using for each loop");
		for(Object object : QueueA) {
			String element2 = (String) object;
			System.out.println(element2);
		}


//While loop with iterator
		System.out.println("Below list retrived by using iterator with while loop");
		Iterator ite=QueueA.iterator();
		while (ite.hasNext()){
			Object element=ite.next();
			System.out.println(element);
		}


	}

}
