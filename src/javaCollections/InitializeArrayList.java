package javaCollections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class InitializeArrayList {

	/*
	 * Method 1: Initialization using Arrays.asList
		Syntax:		
		ArrayList<Type> obj = new ArrayList<Type>(
		        Arrays.asList(Object o1, Object o2, Object o3, ....so on));
	 * */
	
//	 public static void main(String args[]) {
//		   ArrayList<String> obj = new ArrayList<String>(
//			Arrays.asList("Pratap", "Peter", "Harsh"));
//		  System.out.println("Elements are:"+obj);
//	   }
	 
	
	/*
	 * Method 2: Anonymous inner class method to initialize ArrayList
		Syntax:		
		ArrayList<T> obj = new ArrayList<T>(){{
				   add(Object o1);
				   add(Object o2);
				   add(Object o3);
		                   ...
		                   ...
				   }};
	 * */
//	 public static void main(String args[]) {
//		   ArrayList<String> cities = new ArrayList<String>(){{
//			   add("Delhi");
//			   add("Agra");
//			   add("Chennai");
//			   }};
//		  System.out.println("Content of Array list cities:"+cities);
//	   }
	 
	 
	 
	 /*
	  * Method3: Normal way of ArrayList initialization
		Syntax:		
		ArrayList<T> obj = new ArrayList<T>();
			   obj.add("Object o1");
			   obj.add("Object o2");
			   obj.add("Object o3");
		                        ...
		                        ...
	  * */
//	public static void main(String args[]) {
//		   ArrayList<String> books = new ArrayList<String>();
//		   books.add("Java Book1");
//		   books.add("Java Book2");
//		   books.add("Java Book3");
//		  System.out.println("Books stored in array list are: "+books);
//	   }
	
	
	/*
	 * Method 4: Use Collections.ncopies
		Collections.ncopies method can be used when we need to initialize the ArrayList with the same value for all of its elements. 
		Syntax: count is number of elements and element is the item value
		
		ArrayList<T> obj = new ArrayList<T>(Collections.nCopies(count, element));
	 * */
	
	public static void main(String args[]) {
		   ArrayList<String> intlist = new ArrayList<String>(Collections.nCopies(10, "Raja"));
		  System.out.println("ArrayList items: "+intlist);
	   }
}
