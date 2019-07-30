package exception;

public class Example {

	public static void main(String args[]){
		try{
			System.out.println("Starting of try block");
			// I'm throwing the custom exception using throw
			throw new UserDefinedException("This is My error Message");
		}
		catch(UserDefinedException exp){
			System.out.println("Catch Block") ;
			System.out.println(exp) ;
		}
	   }
}
