package javaCollections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;
import java.util.Iterator;

public class LoopArrayList {

//	public static void main(String[] args) {
//
//	      ArrayList<Integer> arrlist = new ArrayList<Integer>();
//	      arrlist.add(14);
//	      arrlist.add(7);
//	      arrlist.add(39);
//	      arrlist.add(40);
//
//	      /* For Loop for iterating ArrayList */
//	      System.out.println("For Loop");
//	      for (int counter = 0; counter < arrlist.size(); counter++) { 		      
//	          System.out.println(arrlist.get(counter)); 		
//	      }   		
//
//	      /* Advanced For Loop*/ 		
//	      System.out.println("Advanced For Loop"); 		
//	      for (Integer num : arrlist) { 		      
//	           System.out.println(num); 		
//	      }
//
//	      /* While Loop for iterating ArrayList*/ 		
//	      System.out.println("While Loop"); 		
//	      int count = 0; 		
//	      while (arrlist.size() > count) {
//		 System.out.println(arrlist.get(count));
//	         count++;
//	      }
//
//	      /*Looping Array List using Iterator*/
//	      System.out.println("Iterator");
//	      Iterator iter = arrlist.iterator();
//	      while (iter.hasNext()) {
//	         System.out.println(iter.next());
//	      }
//	   }
	
	
	/*
	 * How to iterate arraylist elements using Enumeration interface
	 * */
	public static void main(String[] args) {
	      //create an ArrayList object
	      ArrayList<String> arrayList = new ArrayList<String>();
	 
	      //Add elements to ArrayList
	      arrayList.add("C");
	      arrayList.add("C++");
	      arrayList.add("Java");
	      arrayList.add("DotNet");
	      arrayList.add("Perl");
	 
	      // Get the Enumeration object
	      Enumeration<String> e = Collections.enumeration(arrayList);
	 
	      // Enumerate through the ArrayList elements
	      System.out.println("ArrayList elements: ");
	      while(e.hasMoreElements())
	      System.out.println(e.nextElement());
	   }
}
