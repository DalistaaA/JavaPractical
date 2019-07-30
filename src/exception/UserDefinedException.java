package exception;

public class UserDefinedException extends Exception{

	//for Example.java file
//	String str1;
//	   /* Constructor of custom exception class
//	    * here I am copying the message that we are passing while
//	    * throwing the exception to a string and then displaying 
//	    * that string along with the message.
//	    */
//	UserDefinedException(String str2) {
//		str1=str2;
//	   }
//	   public String toString(){ 
//		return ("UserDefinedException Occurred: "+str1) ;
//	   }
	
	public UserDefinedException(String s)
    {
        // Call constructor of parent Exception
        super(s);
    }
	}
