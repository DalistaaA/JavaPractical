package aggregation;

public class Staff {

	String employeeName;
	   //Creating HAS-A relationship with Address class
	   Address employeeAddr; 
	   Staff(String name, Address addr){
	       this.employeeName = name;
	       this.employeeAddr = addr;
	   }
	   
	   public static void main(String args[]){
	       Address ad = new Address(55, "Agra", "UP", "India");
	       Staff obj = new Staff("Chaitanya", ad);
	       System.out.println(obj.employeeName);
	       //System.out.println(obj.employeeAddr);
	       System.out.println(obj.employeeAddr.streetNum);
	       System.out.println(obj.employeeAddr.city);
	       System.out.println(obj.employeeAddr.state);
	       System.out.println(obj.employeeAddr.country);
	   }
}
