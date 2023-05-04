/*  SELF ASSESSMENT of whether my code is easy to understand.
   1. Did I use easy-to-understand meaningful variable names?
       Mark out of 5:   5
       Comment: Yes, All variable name are easy to read and self explanatory.
   2. Did I format the variable names properly (in lowerCamelCase)?
       Mark out of 5:   5
       Comment: Yes, All the variables are in lowerCamelCase format.
   3. Did I indent the code appropriately?
       Mark out of 5:   
       Comment: Yes the code is indented appropriately.
   4. Did I implement a while loop or do-while loop as required?
       Mark out of 10: 10  
       Comment: Yes, I implemented a while loop as required to solve the assignment.
      Total Mark out of  25 (Add all the previous marks):  25
*/
import java.util.Scanner;

public class RangeOfHeights {

	public static void main(String[] args) {
			
		Scanner input = new Scanner( System.in );		
		double minimumHeight = 0;
		double maximumHeight = 0;
		double currentHeight=0;
		boolean quit=false;
				
			while (!quit) 
			{
				System.out.print("Enter a height in metres (0.0 to finish)> ");	
				currentHeight = input.nextDouble();
				
				if (currentHeight==0)
					quit=true;
				if (currentHeight>0) 
				{			
					
					if ((currentHeight < minimumHeight) || (minimumHeight==0))
						minimumHeight = currentHeight;
					if (currentHeight > maximumHeight)
						maximumHeight = currentHeight;
					System.out.println("Heights entered so far are in the range " +
			             	minimumHeight + " to " + maximumHeight );
				}
				else if(currentHeight<0)
					System.out.println("Negative heights are invalid.");
			}
				
										    }
							   }
		
		
		
	

	


