package polymorphism_overload_compiletime;

public class Sample {

//	public static void main(String args[])
//	   {
//	       DisplayOverloading obj = new DisplayOverloading();
//	       obj.disp('a');
//	       obj.disp('a',10);
//	   }
	
//	public static void main(String args[])
//    {
//        DisplayOverloading obj = new DisplayOverloading();
//        obj.disp('a');
//        obj.disp(5);
//    }
	
	
	public static void main(String args[])
	   {
	       DisplayOverloading obj = new DisplayOverloading();
	       obj.disp('x', 51 );
	       obj.disp(52, 'y');
	   }
}
