/*  SELF ASSESSMENT of whether my code is easy to understand.
   1. Did I use appropriate CONSTANTS instead of numbers within the code?
       Mark out of 5:  4 
       Comment:I used constants where i thought was appropriate but that 
               still left one number within the code that I didnt deem
               necessary to make a constant because the value is 
               random value from the formula.
   2. Did I use easy-to-understand, meaningful CONSTANT names?
       Mark out of 5:  4 
       Comment: The constant KM_PER_H_TO_M_PER_S_CONSTANT is long and messy
               but I gave preference to making a constant with easily 
               readable name
   3. Did I format the CONSTANT names properly (in UPPERCASE)?
       Mark out of 5:   5
       Comment: Yes constant are named properly with all uppercase letters
   4. Did I use easy-to-understand meaningful variable names?
       Mark out of 10: 10  
       Comment: All variable names are concise, easy to understand and 
                self explanatory
   5. Did I format the variable names properly (in lowerCamelCase)?
       Mark out of 5:   5
       Comment: Yes all variables are formated to lowerCamelCase.
   6. Did I indent the code appropriately?
       Mark out of 10:   10
       Comment: The code is properly indented.
     Total Mark out of  40 (Add all the previous marks):  38
*/



import java.util.Scanner;
public class StoppingDistance1 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner( System.in );
		System.out.print("Enter vehicle speed in km/hr> ");
		double speed= input.nextDouble();
		System.out.print("Enter reaction time in seconds> ");
		double reactionTime= input.nextDouble();
		
		final double KM_PER_H_TO_M_PER_S_CONSTANT=3.6;/*TO CONVERT SPEED 
		                                              FROM KM/H TO M/S
		                                              WE MUST DIVIDE THE
		                                              SPEED IN KM/H WITH 
		                                              THIS CONSTANT VALUE
		                                               OF3.6
		                                              */
		
		double reactionDistance=(speed/KM_PER_H_TO_M_PER_S_CONSTANT)*
				reactionTime;
		double brakingDistance=((speed/KM_PER_H_TO_M_PER_S_CONSTANT)*
				(speed/KM_PER_H_TO_M_PER_S_CONSTANT))/20;
		double stoppingDistance=reactionDistance+brakingDistance;
		
		System.out.printf( "At a speed of %.1fkm/hr and with a "
				+ "reaction time of %.1fs, the stopping distance"
				+ " would be %.1fm\n"
				+ "", speed,reactionTime,stoppingDistance
				);
		input.close();

		

	}

}
