package exception;

import java.io.*;

class CheckedException {  
//   public static void main(String args[]) throws IOException
//   {
//	FileInputStream fis = null;
//	/*This constructor FileInputStream(File filename)
//	 * throws FileNotFoundException which is a checked
//	 * exception
//         */
//        fis = new FileInputStream("D:/myfile.txt"); 
//	int k; 
//
//	/* Method read() of FileInputStream class also throws 
//	 * a checked exception: IOException
//         */
//	while(( k = fis.read() ) != -1) 
//	{ 
//		System.out.print((char)k); 
//	} 
//
//	/*The method close() closes the file input stream
//	 * It throws IOException*/
//	fis.close(); 	
//   }
	
	
	public static void main(String args[])
	   {
		FileInputStream fis = null;
		try{
		    fis = new FileInputStream("D:/myfile.txt"); 
		}catch(FileNotFoundException fnfe){
	            System.out.println("The specified file is not " +
				"present at the given path");
		 }
		int k; 
		try{
		    while(( k = fis.read() ) != -1) 
		    { 
			System.out.print((char)k); 
		    } 
		    fis.close(); 
		}catch(IOException ioe){
		    System.out.println("I/O error occurred: "+ioe);
		 }
	   }
}