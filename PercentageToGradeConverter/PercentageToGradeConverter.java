/*  SELF ASSESSMENT of whether my code is easy to understand.
   1. Did I use easy-to-understand meaningful variable names?
       Mark out of 5:   5
       Comment: Yes, All variables are easy to read and self explanatory.
   2. Did I format the variable names properly (in lowerCamelCase)?
       Mark out of 5:   5
       Comment: Yes, All the variables are in lowerCamelCase format and constants are upper case 
       separated by underscore.
   3. Did I indent the code appropriately?
       Mark out of 5:   5
       Comment: Yes the code is indented appropriately.
   4. Did I implement a switch statement as required?
       Mark out of 10:   10
       Comment: Yes I implemented a switch statement to determine the grade.
     Total Mark out of  25 (Add all the previous marks):  25
*/
import java.util.Scanner;
public class PercentageToGradeConverter 
{   
	public static final double MINIMUM_I_GRADE_PERCENTAGE =70;
	public static final double MINIMUM_II1_GRADE_PERCENTAGE =60;
	public static final double MINIMUM_II2_GRADE_PERCENTAGE =50;
	public static final double MINIMUM_III_GRADE_PERCENTAGE =40;
	public static final double MINIMUM_F1_GRADE_PERCENTAGE =35;
	public static final double MINIMUM_F2_GRADE_PERCENTAGE =0;
	public static void main(String[] args) 
	{
		boolean quit=false;
		Scanner input =new Scanner(System.in);	
		String grade="";
		do
		{
			System.out.print("Enter a percentage (or 'quit' to finish)> ");
			int roundedPercentage=0;
			if (input.hasNextDouble())
			{   
				double percentage=input.nextDouble();
				roundedPercentage= (int)Math.round(percentage);
				int tensValue=roundedPercentage/10;
				switch(tensValue)
				{
				case 10:
				case 9:
				case 8:
				case 7:
					grade="I";
					break;
				case 6:
					grade="II.1";
					break;
				case 5:
					grade="II.2";
					break;
				case 4:
					grade="III";
					break;
				case 3:
					if (roundedPercentage>=35)
					    grade="F1";
					else
						grade="F2";
					break;
				case 2:
				case 1:
				case 0:
					grade="F2";
					break;						
				}
				String article="";
				if ((grade.equals("F1")) || grade.equals("F2"))
					article="an";
				else
					article="a";
				if (percentage>=0 && percentage<=100)
				{
					System.out.println("The grade for " + percentage + "% is " + article + " " + grade);
				}
				else
					System.out.println("Error: Percentages must be between 0.0% and 100.0%");
			}
			else
			{
				String percentage=input.next();
				if (percentage.equalsIgnoreCase("quit"))
					quit=true;					
				else
					System.out.println("Error: Enter a number between 0.0 and 100.0, or the word quit to exit the program.");									
			}
		}
		while (!quit);
		input.close();
		
	}

}
