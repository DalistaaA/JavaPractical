package garbagecollection;

public class garbagecollection {

	public static void main(String args[]){  
        /* Here we are intentionally assigning a null 
         * value to a reference so that the object becomes
         * non reachable
         */
		garbagecollection obj=new garbagecollection();  
	obj=null;  
		
        /* Here we are intentionally assigning reference a 
         * to the another reference b to make the object referenced
         * by b unusable.
         */
	garbagecollection a = new garbagecollection();
	garbagecollection b = new garbagecollection();
	b = a;
	System.gc();  
   }  
   protected void finalize() throws Throwable
   {
        System.out.println("Garbage collection is performed by JVM");
   }
}
