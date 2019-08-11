package polymorphism_overload_compiletime;

public class DisplayOverloading {

//	public void disp(char c)
//    {
//         System.out.println(c);
//    }
//    public void disp(char c, int num)  
//    {
//         System.out.println(c + " "+num);
//    }
	
//	 public void disp(char c)
//	    {
//	        System.out.println(c);
//	    }
//	    public void disp(int c)
//	    {
//	       System.out.println(c );
//	    }
	
	
	public void disp(char c, int num)
	   {
	       System.out.println("I’m the first definition of method disp");
	   }
	   public void disp(int num, char c)
	   {
	       System.out.println("I’m the second definition of method disp" );
	   }
	    
	    
	    
}
