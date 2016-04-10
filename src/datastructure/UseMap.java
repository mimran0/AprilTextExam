package datastructure;

import java.util.*;

public class UseMap {

	public static void main(String[] args) {
		/*
		 * Demonstrate how to use Map that includes storing and retrieving elements.
		 * Add List<String> into a Map. Like, Map<String, List<string>> list = new HashMap<String, List<String>>();
		 * Use For Each loop and while loop with Iterator to retrieve data.
		 * 
		 */

		Map<String, List<String>> list = new HashMap<String, List<String>>();
		System.out.println(list);
		// storing list into the map
		list.put("Imran", Arrays.asList("3474846905","106","2519ny_md","Shahajada"));
		list.put("Fruit",Arrays.asList("mango","apple","banana","orange"));
		System.out.println(list);


		System.out.println(list.get("Imran"));

		System.out.println(list.get("Imran").get(0));

		//using for loop for first key
		System.out.println("using for loop for first key");
		for (int i=0;i<list.get("Imran").size();i++){
			System.out.println(list.get("Imran").get(i));

		}
		// using for loop for second key
		System.out.println("using for loop for second key");
		for (int i=0;i<list.get("Fruit").size();i++){
			System.out.println(list.get("Fruit").get(i));

		}

        // using for each loop for the first key
		System.out.println("using for each loop for the first key");
		for (String abc:list.get("Imran")){
			System.out.println(abc);

		}

		//using for each loop for the Second key
		System.out.println("using for each loop for the Second key");
		for (String abc:list.get("Fruit")){
			System.out.println(abc);

		}




		// using while loop for first key
		System.out.println("using while loop for first key");
		int j=0;
		while (j<list.get("Imran").size()){
			System.out.println(list.get("Imran").get(j));
			j=j+1;
		}



		// using while loop for Second key
		System.out.println("using while loop for Second key");
		int w=0;
		while (w<list.get("Fruit").size()){
			System.out.println(list.get("Fruit").get(w));
			w=w+1;
		}



  // using iterator and while loop
		System.out.println("using iterator and while loop");
       Iterator ite=list.get("Fruit").iterator();
		while (ite.hasNext()){
			Object element=ite.next();
			System.out.println(element);
		}










	}

}
