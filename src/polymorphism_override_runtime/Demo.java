package polymorphism_override_runtime;

public class Demo extends Abc {

//	public void disp(){
//		System.out.println("disp() method of Child class");
//	   }
//	   public void newMethod(){
//		System.out.println("new method of child class");
//	   }
//	   public static void main( String args[]) {
//		/* When Parent class reference refers to the parent class object
//		 * then in this case overridden method (the method of parent class)
//		 *  is called.
//		 */
//		Abc obj = new Abc();
//		obj.disp();
//
//		/* When parent class reference refers to the child class object
//		 * then the overriding method (method of child class) is called.
//		 * This is called dynamic method dispatch and runtime polymorphism
//		 */
//		Abc obj2 = new Demo();
//		obj2.disp();
//	   }
	
	
	public void myMethod(){
		//This will call the myMethod() of parent class
		super.myMethod();
		System.out.println("Overriding method");
	   }
	   public static void main( String args[]) {
		Demo obj = new Demo();
		obj.myMethod();
	   }
}
