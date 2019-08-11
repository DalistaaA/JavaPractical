package intetrface_changes;

public class Example implements MyInterface {

	// implementing abstract method
    public void existingMethod(String str){           
        System.out.println("String is: "+str);  
    }  
    public static void main(String[] args) {  
    	Example obj = new Example();
    	
    	//calling the default method of interface
        obj.newMethod();     
        //calling the abstract method of interface
        obj.existingMethod("Java 8 is easy to learn"); 
      //calling the static method of interface
        MyInterface.anotherNewMethod();
  
    }  
}
