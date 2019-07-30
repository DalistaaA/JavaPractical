
public class FirstCode {

	public static void main(String args[]) {
		
		System.out.println("Hello World");
		
		int num =5; //4 bytes  -> 32bits -> -2,147,483,648 to 2,147,483,647
		num =8;
		System.out.println(num);
		
		long l=500000000l; //8bytes
		int i =5; //4 bytes -> 32bits
		short s=5; //2 bytes -> 16bits
		byte b =5; //1 bytes -> 8bits
		float f = 5.5f; 
		double d =5.5; 
		
		char c = 'A';  //American Standard Code For Information Interchange
		c=66;
		System.out.println(c);
		
		
		double d1 =5; //implicit conversion
		int k =(int)5.6; // type casting
		System.out.println(k);
		
		int m =4;
		int n =5;
		
		//n = n + m;
		n++;
		System.out.println(n);
		
	}
}
