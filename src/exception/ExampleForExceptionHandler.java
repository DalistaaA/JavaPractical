package exception;
public class ExampleForExceptionHandler {
	//Example 01
	public static void main(String args[]) {
	      int num1, num2;
	      try {
	         /* We suspect that this block of statement can throw 
	          * exception so we handled it by placing these statements
	          * inside try and handled the exception in catch block
	          */
	         num1 = 0;
	         num2 = 62 / num1;
	         System.out.println(num2);
	         System.out.println("Hey I'm at the end of try block");
	      }
	      catch (ArithmeticException e) { 
	         /* This block will only execute if any Arithmetic exception 
	          * occurs in try block
	          */
	         System.out.println("You should not divide a number by zero");
	      }
	      catch (Exception e) {
	         /* This is a generic Exception handler which means it can handle
	          * all the exceptions. This will execute if the exception is not
	          * handled by previous catch blocks.
	          */
	         System.out.println("Exception occurred");
	      }
	      System.out.println("I'm out of try-catch block in Java.");
	   }

	/*****************************************************************************************/
	
	//Example 02
//	public static void main(String args[]){
//	      try{
//	         int arr[]=new int[7];
//	         arr[4]=30/0;
//	         System.out.println(arr[6]+" "+"Last Statement of try block");
//	      }
//	      catch(ArithmeticException e){
//	         System.out.println("You should not divide a number by zero");
//	      }
//	      catch(ArrayIndexOutOfBoundsException e){
//	         System.out.println("Accessing array elements outside of the limit");
//	      }
//	      catch(Exception e){
//	         System.out.println("Some Other Exception");
//	      }
//	      System.out.println("Out of the try-catch block");
//	   }
	
	/*****************************************************************************************/
	//Example 03
//	public static void main(String args[]){
//	      try{
//	         int arr[]=new int[7];
//	         arr[10]=10/5;
//	         System.out.println("Last Statement of try block");
//	      }
//	      catch(ArithmeticException e){
//	         System.out.println("You should not divide a number by zero");
//	      }
//	      catch(ArrayIndexOutOfBoundsException e){
//	         System.out.println("Accessing array elements outside of the limit");
//	      }
//	      catch(Exception e){
//	         System.out.println("Some Other Exception");
//	      }
//	      System.out.println("Out of the try-catch block");
//	   }
	
	/*****************************************************************************************/
	//Example 04
//	public static void main(String args[]){
//	      try{
//	         int arr[]=new int[7];
//	         arr[10]=10/5;
//	         System.out.println("Last Statement of try block");
//	      }
//	      catch(Exception e){
//	         System.out.println("Some Other Exception");
//	      }
//	      catch(ArithmeticException e){
//	         System.out.println("You should not divide a number by zero");
//	      }
//	      catch(ArrayIndexOutOfBoundsException e){
//	         System.out.println("Accessing array elements outside of the limit");
//	      }
//	      System.out.println("Out of the try-catch block");
//	   }
	
	
}
