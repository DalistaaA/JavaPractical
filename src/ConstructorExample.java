public class ConstructorExample {

	
//		   String name;
//		   //Constructor
//		   ConstructorExample(){
//		      this.name = "BeginnersBook.com";
//		   }
//		   public static void main(String[] args) {
//			   ConstructorExample obj = new ConstructorExample();
//		      System.out.println(obj.name);
//		   }
	
//		   public ConstructorExample()
//		     {
//		         System.out.println("This is a no argument constructor");
//		     }
//		     public static void main(String args[]) {
//		    	 new ConstructorExample();
//		     }
	
	
//			int empId;  
//			   String empName;  
//				    
//			   //parameterized constructor with two parameters
//			   ConstructorExample(int id, String name){  
//			       this.empId = id;  
//			       this.empName = name;  
//			   }  
//			   void info(){
//			        System.out.println("Id: "+empId+" Name: "+empName);
//			   }  
//				   
//			   public static void main(String args[]){  
//				ConstructorExample obj1 = new ConstructorExample(10245,"Chaitanya");  
//				ConstructorExample obj2 = new ConstructorExample(92232,"Negan");  
//				obj1.info();  
//				obj2.info();  
//			   }  
	
	
	
//				private int var;
//			    //default constructor
//			    public ConstructorExample()
//			    {
//			           this.var = 10;
//			    }
//			    //parameterized constructor
//			    public ConstructorExample(int num)
//			    {
//			           this.var = num;
//			    }
//			    public int getValue()
//			    {
//			            return var;
//			    }
//			    public static void main(String args[])
//			    {
//			            ConstructorExample obj = new ConstructorExample();
//			            ConstructorExample obj2 = new ConstructorExample(100);
//			            System.out.println("var is: "+obj.getValue());
//			            System.out.println("var is: "+obj2.getValue());
//			    }
	
	
	
//				private int var;
//			    public ConstructorExample(int num)
//			    {
//			           var=num;
//			    }
//			    public int getValue()
//			    {
//			            return var;
//			    }
//			    public static void main(String args[])
//			    {
//			    	ConstructorExample myobj = new ConstructorExample();
//			            System.out.println("value of var is: "+myobj.getValue());
//			    }
	
//				ConstructorExample(){
//					System.out.println("MyParentClass Constructor");
//				   }
//				}
//				class MyChildClass extends ConstructorExample{
//				   MyChildClass() {
//					System.out.println("MyChildClass Constructor");
//				   }
//				   public static void main(String args[]) {
//					new MyChildClass();
//				   }
	
	//constructor chaining
	/*
	 * class Employee
{   
    public String empName;
    public int empSalary;
    public String address;

    //default constructor of the class
    public Employee()
    {
    	//this will call the constructor with String param
        this("Chaitanya");
    }

    public Employee(String name)
    {
    	//call the constructor with (String, int) param
    	this(name, 120035);
    }
    public Employee(String name, int sal)
    {
    	//call the constructor with (String, int, String) param
    	this(name, sal, "Gurgaon");
    }
    public Employee(String name, int sal, String addr)
    {
    	this.empName=name;
    	this.empSalary=sal;
    	this.address=addr;
    }

    void disp() {
    	System.out.println("Employee Name: "+empName);
    	System.out.println("Employee Salary: "+empSalary);
    	System.out.println("Employee Address: "+address);
    }
    public static void main(String[] args)
    {
        Employee obj = new Employee();
        obj.disp();
    }
}
	 * 
	 * 
	 * */
	
	//for super
//	class Superclass
//	{
//	   int num = 100;
//	}
	//Child class or subclass or derived class
//	class Subclass extends Superclass
//	{
//	   /* The same variable num is declared in the Subclass
//	    * which is already present in the Superclass
//	    */
//	    int num = 110;
//	    void printNumber(){
//		System.out.println(num);
//	    }
//	    public static void main(String args[]){
//		Subclass obj= new Subclass();
//		obj.printNumber();	
//	    }
//	}
	
/*
 * class Superclass
{
   int num = 100;
}
class Subclass extends Superclass
{
   int num = 110;
   void printNumber(){
	/* Note that instead of writing num we are
	 * writing super.num in the print statement
	 * this refers to the num variable of Superclass
	 */
	/*System.out.println(super.num);
   }
   public static void main(String args[]){
	Subclass obj= new Subclass();
	obj.printNumber();	
   }
}
 * */	
	
	
}

/*
 * class Parentclass
{
   Parentclass(){
	System.out.println("Constructor of parent class");
   }
}
class Subclass extends Parentclass
{
   Subclass(){
	/* Compile implicitly adds super() here as the
	 *  first statement of this constructor.
	 */
	/*System.out.println("Constructor of child class");
   }
   Subclass(int num){
	/* Even though it is a parameterized constructor.
	 * The compiler still adds the no-arg super() here
	 */
	/*System.out.println("arg constructor of child class");
   }
   void display(){
	System.out.println("Hello!");
   }
   public static void main(String args[]){
	/* Creating object using default constructor. This 
	 * will invoke child class constructor, which will 
	 * invoke parent class constructor
	 */
	/*Subclass obj= new Subclass();
	//Calling sub class method 
	obj.display();
	/* Creating second object using arg constructor
	 * it will invoke arg constructor of child class which will
	 * invoke no-arg constructor of parent class automatically 
	 */
	/*Subclass obj2= new Subclass(10);
	obj2.display();
   }
}
 * 
 * 
 * 
 * */

//
//class Parentclass
//{
//   //no-arg constructor
//   Parentclass(){
//	System.out.println("no-arg constructor of parent class");
//   }
//   //arg or parameterized constructor
//   Parentclass(String str){
//	System.out.println("parameterized constructor of parent class");
//   }
//}
//class Subclass extends Parentclass
//{
//   Subclass(){
//       /* super() must be added to the first statement of constructor 
//	* otherwise you will get a compilation error. Another important 
//	* point to note is that when we explicitly use super in constructor
//	* the compiler doesn't invoke the parent constructor automatically.
//	*/
//	super("Hahaha");
//	System.out.println("Constructor of child class");
//
//   }
//   void display(){
//	System.out.println("Hello");
//   }
//   public static void main(String args[]){		
//	Subclass obj= new Subclass();
//	obj.display();	 
//   }
//}


//class Parentclass
//{
//   void display(){
//	System.out.println("Parent class method");
//   }
//}
//class Subclass extends Parentclass
//{
//   void printMsg(){
//	/* This would call method of parent class,
//	 * no need to use super keyword because no other
//	 * method with the same name is present in this class
//	 */
//	display();
//   } 
//   public static void main(String args[]){
//		
//	Subclass obj= new Subclass();
//        obj.printMsg(); 
//   }
//}