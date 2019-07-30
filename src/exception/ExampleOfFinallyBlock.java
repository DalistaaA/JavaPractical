package exception;

public class ExampleOfFinallyBlock {


	/*****************************************************************************************/
	//Example 07
//	public static void main(String args[]) {
//	      try{  
//		 int num=121/2;  
//		 System.out.println(num);  
//	      }  
//	      catch(ArithmeticException e){
//	         System.out.println("Number should not be divided by zero");
//	      }  
//	      /* Finally block will always execute
//	       * even if there is no exception in try block
//	       */
//	      finally{
//		 System.out.println("This is finally block");
//	      }  
//	      System.out.println("Out of try-catch-finally");  
//	   }   
	
	/*****************************************************************************************/
	//Example 08
//	public static void main(String args[])
//	   {
//	      System.out.println(ExampleOfFinallyBlock.myMethod());  
//	   }
//	   public static int myMethod()
//	   {
//	      try {
//	        return 112;
//	      }
//	      finally {
//	        System.out.println("This is Finally block");
//	        System.out.println("Finally block ran even after return statement");
//	      }
//	   }
	   
	   
	   
	   /***************************************************************************************/
	   //Example 09
//	   public static int myMethod()
//	   {
//	       try {
//	            //try block
//	            return 0;
//	       }
//	       finally {
//	            //finally
//	            System.out.println("Inside Finally block");
//	       }
//	  }
//	  public static void main(String args[])
//	  {
//	       System.out.println(ExampleOfFinallyBlock.myMethod());
//	  }
	  

	   /***************************************************************************************/
	   //Example 10
//		public static void main(String args[]){
//		    try{
//		       System.out.println("First statement of try block");
//		       int num=45/3;
//		       System.out.println(num);
//		    }
//		    catch(ArrayIndexOutOfBoundsException e){
//		       System.out.println("ArrayIndexOutOfBoundsException");
//		    }
//		    finally{
//		       System.out.println("finally block");
//		    }
//		    System.out.println("Out of try-catch-finally block");
//		  }
	  

	   /***************************************************************************************/
	   //Example 11
//		public static void main(String args[]){
//		     try{
//		        System.out.println("First statement of try block");
//		        int num=45/0;
//		        System.out.println(num);
//		     }
//		     catch(ArrayIndexOutOfBoundsException e){
//		        System.out.println("ArrayIndexOutOfBoundsException");
//		     }
//		     finally{
//		        System.out.println("finally block");
//		     }
//		     System.out.println("Out of try-catch-finally block");
//		   }
	  
	/***************************************************************************************/
	   //Example 12
		public static void main(String args[]){
		      try{
		         System.out.println("First statement of try block");
		         int num=45/0;
		         System.out.println(num);
		      }
		      catch(ArithmeticException e){
		         System.out.println("ArithmeticException");
		      }
		      finally{
		         System.out.println("finally block");
		      }
		      System.out.println("Out of try-catch-finally block");
		   }
	  
	  
	  
	  
	  
	  
	  
	  
	  //Example for finally and close
//	  try{ 
//		    OutputStream osf = new FileOutputStream( "filename" );
//		    OutputStream osb = new BufferedOutputStream(opf);
//		    ObjectOutput op = new ObjectOutputStream(osb);
//		    try{
//		       output.writeObject(writableObject);
//		    }
//		    finally{
//		       op.close();
//		    }
//		}
//		catch(IOException e1){
//		     System.out.println(e1);
//		}
	  
	  // Example for Finally block without catch
//	  InputStream input = null;
//	  try {
//	      input = new FileInputStream("inputfile.txt");
//	  } 
//	  finally {
//	      if (input != null) {
//	         try {
//	           in.close();
//	         }catch (IOException exp) {
//	             System.out.println(exp);
//	          }
//	      }
//	  }
	  
	  //Finally block and System.exit()
//	  try {
//		   //try block
//		   System.out.println("Inside try block");
//		   System.exit(0);
//		}
//		catch (Exception exp) {
//		   System.out.println(exp);
//		}
//		finally {
//		   System.out.println("Java finally block");
//		}
}
