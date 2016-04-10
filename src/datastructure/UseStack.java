package datastructure;

import java.util.Iterator;
import java.util.Stack;

public class UseStack {

	public static void main(String[] args) {
		/*
		 * Demonstrate how to use Stack that includes push,peek,remove,pop elements.
		 * Use For Each loop and while loop with Iterator to retrieve data.
		 * 
		 */


		Stack st=new Stack();
		// using push method
		st.push(3);
		st.push("limon");
		st.push("imran");
		st.push("hello");
		st.push("Goods");
		st.push("md302958");
		System.out.println(st);

		// peek method
		System.out.println(st.peek());
		// remove method
		st.remove(5);
		System.out.println(st);
		// pop method
		st.pop();
		System.out.println("after pop method the list is: "+st);


		//for each loop
		System.out.println("Using for each loop below output displayed in the console");
		for (Object abc:st){
			System.out.println(abc);
		}

       // while loop with iterator
		System.out.println("Using while loop with iterator");
		Iterator ite=st.iterator();
		while (ite.hasNext()){
			Object element=ite.next();
			System.out.println(element);
		}



	}

}
