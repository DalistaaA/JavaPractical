package exception;

public class ExampleforThroughKeyword {

	/*
	 * Syntax of through
	 * throw new exception_class("error message");
	 * throw new ArithmeticException("dividing a number by 5 is not allowed in this program");
	 * */
	
	static void checkEligibilty(int stuage, int stuweight){ 
	      if(stuage<12 && stuweight<40) {
	         throw new ArithmeticException("Student is not eligible for registration"); 
	      }
	      else {
	         System.out.println("Student Entry is Valid!!"); 
	      }
	   } 

	   public static void main(String args[]){ 
	     System.out.println("Welcome to the Registration process!!");
	     checkEligibilty(10, 39); 
	     System.out.println("Have a nice day.."); 
	 } 
	
	   
	   /*
	    * public void myMethod() throws ArithmeticException, NullPointerException
			{
			  // Statements that might throw an exception 
			}
			
			public static void main(String args[]) { 
			  try {
			    myMethod();
			  }
			  catch (ArithmeticException e) {
			    // Exception handling statements
			  }
			  catch (NullPointerException e) {
			    // Exception handling statements
			  }
			}
*/
}

//import java.io.*;
//class ThrowExample { 
//  void myMethod(int num)throws IOException, ClassNotFoundException{ 
//     if(num==1)
//        throw new IOException("IOException Occurred");
//     else
//        throw new ClassNotFoundException("ClassNotFoundException");
//  } 
//} 
//
//public class Example1{ 
//  public static void main(String args[]){ 
//   try{ 
//     ThrowExample obj=new ThrowExample(); 
//     obj.myMethod(1); 
//   }catch(Exception ex){
//     System.out.println(ex);
//    } 
//  }
//}
