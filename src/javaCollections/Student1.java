package javaCollections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Student1 {

	private String studentname;
    private int rollno;
    private int studentage;

    public Student1(int rollno, String studentname, int studentage) {
        this.rollno = rollno;
        this.studentname = studentname;
        this.studentage = studentage;
    }
    
    public String getStudentname() {
		return studentname;
	}
	public void setStudentname(String studentname) {
		this.studentname = studentname;
	}
	public int getRollno() {
		return rollno;
	}
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	public int getStudentage() {
		return studentage;
	}
	public void setStudentage(int studentage) {
		this.studentage = studentage;
	}
    
    /*Comparator for sorting the list by Student Name*/
    
	public static Comparator<Student1> StuNameComparator = new Comparator<Student1>() {

	public int compare(Student1 s1, Student1 s2) {
	   String StudentName1 = s1.getStudentname().toUpperCase();
	   String StudentName2 = s2.getStudentname().toUpperCase();

	   //ascending order
	   return StudentName1.compareTo(StudentName2);

	   //descending order
	   //return StudentName2.compareTo(StudentName1);
    }};

    /*Comparator for sorting the list by roll no*/
    public static Comparator<Student1> StuRollno = new Comparator<Student1>() {

	public int compare(Student1 s1, Student1 s2) {

	   int rollno1 = s1.getRollno();
	   int rollno2 = s2.getRollno();

	   /*For ascending order*/
	   return rollno1-rollno2;

	   /*For descending order*/
	   //rollno2-rollno1;
   }};
    @Override
    public String toString() {
        return "[ rollno=" + rollno + ", name=" + studentname + ", age=" + studentage + "]";
    }
    
    
    public static void main(String args[]){
 	   ArrayList<Student1> arraylist = new ArrayList<Student1>();
 	   arraylist.add(new Student1(101, "Zues", 26));
 	   arraylist.add(new Student1(505, "Abey", 24));
 	   arraylist.add(new Student1(809, "Vignesh", 32));

 	   /*Sorting based on Student Name*/
 	   System.out.println("Student Name Sorting:");
 	   Collections.sort(arraylist, Student1.StuNameComparator);

 	   for(Student1 str: arraylist){
 			System.out.println(str);
 	   }

 	   /* Sorting on Rollno property*/
 	   System.out.println("RollNum Sorting:");
 	   Collections.sort(arraylist, Student1.StuRollno);
 	   for(Student1 str: arraylist){
 			System.out.println(str);
 	   }
 	}
}
