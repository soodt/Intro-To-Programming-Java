/*  SELF ASSESSMENT of whether my code is easy to understand.
   1. Did I use easy-to-understand meaningful variable and constant names?
       Mark out of 15:   15
       Comment: All the variable and constant have easy to read and self
                explanatory names.
   2. Did I format the variable and constant names properly?
       Mark out of 5: 5  
       Comment: All the variable are in lowerCamelCase format
                and constants in All Caps separated by underscore
   3. Did I indent the code appropriately?
       Mark out of 10:   10
       Comment: The code is properly indented with the entire program
                inside class and main. Proper indentation was also 
                maintained while using if,else statements.
      Total Mark out of  30 (Add all the previous marks):  30
*/


import java.util.Scanner;

public class StoppingDistance2 {

	public static void main(String[] args) {
		Scanner input = new Scanner( System.in );
		System.out.print("Enter vehicle speed in km/hr> ");
		double speed= input.nextDouble();
		System.out.print("Enter age in years> ");
		int age= input.nextInt();
		System.out.print("Is the road wet (Yes/No)? ");
		String roadCondition= input.next();
		
		final double KMPH_TO_MPS_CONSTANT=3.6;/*TO CONVERT SPEED 
		                                              FROM KM/H TO M/S
		                                              WE MUST DIVIDE THE
		                                              SPEED IN KM/H WITH 
		                                              THIS CONSTANT VALUE
		                                               OF3.6
		                                              */
		
		double reactionTime=0;
		if (age<50)
			reactionTime=2;
		else if (age<=59 & age>=50)
			reactionTime=2.5;
		else if (age>=60)
			reactionTime=3;
		
		
		
		double frictionCoefficient=0;
		boolean roadIsWet=roadCondition.equalsIgnoreCase("Yes");
		if (roadIsWet)
			frictionCoefficient=0.4;
		    
		else 
			frictionCoefficient=0.8;
		    
		if (roadIsWet)
			roadCondition="wet";
		else
			roadCondition="dry";
	    
			
		
		
			
		
		double brakingDistance=(speed*speed)/(250*frictionCoefficient);
		double reactionDistance=(speed/KMPH_TO_MPS_CONSTANT)*
				reactionTime;
		double stoppingDistance=reactionDistance+brakingDistance;
		
		
		System.out.println("As the road is " + roadCondition + ", "
				+ "the coefficient "
				+ "of "
				+ "friction is " + frictionCoefficient);
		
		System.out.println("As the driver is " + age + " years old, "
				+ "his/her"
				+ " reaction time is " + reactionTime +"s");
		
		
		System.out.printf( "At a speed of %.1fkm/hr, the reaction distance"
				+ " is "
				+ "%.0fm, the braking distance is %.0fm, and so the"
				+ " stopping "
				+ "distance is %.0fm\n"
				+ "", speed,reactionDistance,brakingDistance,
				stoppingDistance
				);
		input.close();

	}

}
