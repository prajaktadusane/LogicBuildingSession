/* Write a program that determines whether a student passes or fails based on their grades in three 
subjects. If the student scores more than 40 in all subjects, they pass. If the student fails in one or 
more subjects, print the number of subjects they failed in. 

 * */

package javaPrograms;

public class Student_ResultDemo {

	public static void main(String[] args) {
	    int sub1 = 75;
	    int  sub2 = 80;
	    int sub3 = 35;
	    
	    int fail_sub = 0;
	    
	    if(sub1 <= 40)
	    	fail_sub++;
	    
	    if(sub2 <= 40)
	    	fail_sub++;
	    
	    if(sub3 <= 40)
	    	fail_sub++;
	    
	    if(fail_sub == 0)
	    {
	    	System.out.println("Student is pass");
	    	
	    }
	    else
	    {
	    	System.out.println("The student is failed in  "  + fail_sub +  " Subject" );
	    }
	    

	}

}
