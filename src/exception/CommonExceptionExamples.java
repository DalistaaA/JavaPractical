package exception;

public class CommonExceptionExamples {
	/******************************************************************************************/
	//Eample 01 -Arithmetic exception
//	public static void main(String args[])
//	   {
//	      try{
//	         int num1=30, num2=0;
//	         int output=num1/num2;
//	         System.out.println ("Result: "+output);
//	      }
//	      catch(ArithmeticException e){
//	         System.out.println ("You Shouldn't divide a number by zero");
//	      }
//	   }
	
	/******************************************************************************************/
	//Eample 02 - ArrayIndexOutOfBounds Exception
//	public static void main(String args[])
//	   {
//	      try{
//	        int a[]=new int[10];
//	        //Array has only 10 elements
//	        a[11] = 9;
//	      }
//	      catch(ArrayIndexOutOfBoundsException e){
//	         System.out.println ("ArrayIndexOutOfBounds");
//	      }
//	   }
	
	/******************************************************************************************/
	//Eample 03 - NumberFormat Exception
//	public static void main(String args[])
//	   {
//	      try{
//		 int num=Integer.parseInt ("XYZ") ;
//		 System.out.println(num);
//	      }catch(NumberFormatException e){
//		  System.out.println("Number format exception occurred");
//	       }
//	   }
	
	/******************************************************************************************/
	//Eample 04 - StringIndexOutOfBound Exception
//	public static void main(String args[])
//	   {
//	      try{
//		 String str="beginnersbook";
//		 System.out.println(str.length());;
//		 char c = str.charAt(0);
//		 c = str.charAt(40);
//		 System.out.println(c);
//	      }catch(StringIndexOutOfBoundsException e){
//		  System.out.println("StringIndexOutOfBoundsException!!");
//	       }
//	   }
	
	/******************************************************************************************/
	//Eample 05 -NullPointer Exception
	public static void main(String args[])
	   {
		try{
			String str=null;
			System.out.println (str.length());
		}
	        catch(NullPointerException e){
			System.out.println("NullPointerException..");
		}
	   }
	
	/******************************************************************************************/
	//Eample 06
}
