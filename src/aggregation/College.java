package aggregation;

public class College {

	String collegeName;
	   //Creating HAS-A relationship with Address class
	   Address collegeAddr; 
	   College(String name, Address addr){
	       this.collegeName = name;
	       this.collegeAddr = addr;
	   }
	   
	   
	   public static void main(String args[]){
	       Address ad = new Address(55, "Agra", "UP", "India");
	       College obj = new College("Jaffna", ad);
	       System.out.println(obj.collegeName);
	       System.out.println(obj.collegeAddr);
	       System.out.println(obj.collegeAddr.streetNum);
	       System.out.println(obj.collegeAddr.city);
	       System.out.println(obj.collegeAddr.state);
	       System.out.println(obj.collegeAddr.country);
	   }
}
