package exception;

public class Example1
{
   void productCheck(int weight) throws UserDefinedException{
	if(weight<100){
		throw new UserDefinedException("Product Invalid");
	}
   }
   
    public static void main(String args[])
    {
    	Example1 obj = new Example1();
        try
        {
            obj.productCheck(60);
        }
        catch (UserDefinedException ex)
        {
            System.out.println("Caught the exception");
            System.out.println(ex.getMessage());
        }
    }
}