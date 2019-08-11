package finalExample;

public class Demo {

//	//Blank final variable
//	   final int MAX_VALUE;
//		 
//	   Demo(){
//	      //It must be initialized in constructor
//	      MAX_VALUE=100;
//	   }
//	   void myMethod(){  
//	      System.out.println(MAX_VALUE);
//	   }  
//	   public static void main(String args[]){  
//	      Demo obj=new  Demo();  
//	      obj.myMethod();  
//	   }  
	
	
//	final int MAX_VALUE=99;
//	   void myMethod(){  
//	      MAX_VALUE=101;
//	   }  
//	   public static void main(String args[]){  
//	      Demo obj=new  Demo();  
//	      obj.myMethod();  
//	   } 
	
	
	
//	//Blank final variable
//	   final int ROLL_NO;
//		 
//	   Demo(int rnum){
//	      //It must be initialized in constructor
//	      ROLL_NO=rnum;
//	   }
//	   void myMethod(){  
//	      System.out.println("Roll no is:"+ROLL_NO);
//	   }  
//	   public static void main(String args[]){  
//		   Demo obj=new  Demo(1234);  
//	      obj.myMethod();  
//	   }  
	
	
	static final int ROLL_NO;
	   static{ 
	      ROLL_NO=1230;
	   }  
	   public static void main(String args[]){  
	      System.out.println(Demo.ROLL_NO);  
	   }  
}
