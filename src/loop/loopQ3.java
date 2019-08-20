package loop;

public class loopQ3 {

	static String s = ""; 
	public
	    static void main(String[] args) 
	    { 
	    P: 
	        for (int i = 2; i < 7; i++) { 
	            if (i == 3) 
	                continue; 
	            if (i == 5) 
	                break P; 
	            s = s + i; 
	        } 
	        System.out.println(s); 
	    } 
}
