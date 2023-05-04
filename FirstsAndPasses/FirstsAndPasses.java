/*  SELF ASSESSMENT of whether my code is easy to understand.
   1. Did I use easy-to-understand meaningful variable and constant names?
       Mark out of 10:   10
       Comment: Yes, All variables are easy to read and self explanatory.
   2. Did I format the variable and constant names properly (in lowerCamelCase and UPPERCASE)?
       Mark out of 5:   5
       Comment: Yes, All the variables are in lowerCamelCase format and constants are upper case 
       separated by underscore.
   3. Did I indent the code appropriately?
       Mark out of 10:   10
       Comment: Yes the code is indented appropriately.Point to note since a lot of loops and if-else
       statements are used here,I have made sure to clearly indent the curly bracket( {} ) here as well to 
       make the code easier to understand as to what part comes under which clause.
   4. Did I implement a for loop to read the input as required?
       Mark out of 10:   10
       Comment: Yes for loop was used to get the input about the marks from the users as we knew
       the size of the loop required,which is the size of the class.
      Total Mark out of  35 (Add all the previous marks):  35
*/
import java.util.Scanner;
public class FirstsAndPasses 
{
		public static final double MINIMUM_FIRST_CLASS_PERCENTAGE = 70.0;
		public static final double MINIMUM_MARK = 0.0;
		public static final double MAXIMUM_MARK = 100.0;
		public static final double MINIMUM_PASS_MARK = 40.0;
		public static void main(String[] args) 
		{
		    int numberOfGradesEntered = 0;
		    int numberOfFirsts = 0;
		    int numberOfPassers = 0;
		    double percentageOfPassers=0;
		    Scanner input = new Scanner( System.in );		                           
		    System.out.print("Enter the number of students in the class> ");
		    int numberOfStudents=input.nextInt();
		    if (numberOfStudents<1)
		        System.out.println("Error:  The number of students must be greater than 0");
		    else
		    {   
		    	for (int count=1;count<=numberOfStudents;)
		    	{
		    	     System.out.print("Enter the percentage obtained by student " + count +"> ");
		             double mark = input.nextDouble();
		             if ((mark >= MINIMUM_MARK) && (mark <= MAXIMUM_MARK))
		             {		        	    
		            	 numberOfGradesEntered++;
		            	 numberOfFirsts += (Math.round(mark) >= MINIMUM_FIRST_CLASS_PERCENTAGE)? 1 : 0;		
		            	 numberOfPassers += (Math.round(mark) >= MINIMUM_PASS_MARK)? 1 : 0;
		            	 percentageOfPassers=100.0*((double)numberOfPassers)/((double)numberOfGradesEntered);
		            	 count++;		          		                				                			                		
		             }
		             else System.out.println("Invalid percentage.  Please enter the mark again for this student.");	   
		    	}	
		    	System.out.printf("In this class of %d students, %d got a first class honour and %.1f%% passed the class\n",
		            				numberOfStudents,numberOfFirsts,percentageOfPassers);
		        		             
            }
            input.close();
          }
}
		

	
		          
		          
