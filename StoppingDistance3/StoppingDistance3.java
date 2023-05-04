/*  SELF ASSESSMENT of whether my code is easy to understand.
   1. Did I use easy-to-understand meaningful and properly formatted variable names and constants?
       Mark out of 5:   5
       Comment: Yes, All variables are easy to read and self explanatory and all the variables are in 
       lowerCamelCase format and constants are upper case separated by underscore.
    2. Did I indent the code appropriately?
       Mark out of 5:   5
       Comment: Yes the code is indented appropriately.Point to note since a lot of loops and if-else
       statements are used here,I have made sure to clearly indent the curly bracket( {} ) here as well to 
       make the code easier to understand as to what part comes under which clause.
   3. Did I make use of the functions appropriately within main and the other functions?
       Mark out of 5:   5
       Comment: Yes, I created and utilized functions appropriately to solve the given problem.
   4. Have I avoided inappropriate duplication of code?
       Mark out of 5:   5
       Comment: Yes, code duplication was avoided in all appropriate circumstances.
     Total Mark out of  20 (Add all the previous marks):  20
*/

import java.util.Scanner;
public class StoppingDistance3 
{
	
	public static final double DRY_COEFFICIENT_OF_FRICTION=0.8;
	public static final double WET_COEFFICIENT_OF_FRICTION=0.4;
	public static final double ICY_COEFFICIENT_OF_FRICTION=0.1;
	public static final double KMPH_TO_MPS_CONSTANT=3.6;
	
	public static double computeCoefficientOfFriction(boolean roadIsIcy, boolean roadIsWet) 
	{	
		double coefficientOfFriction=0;
		if (roadIsIcy)
			coefficientOfFriction=ICY_COEFFICIENT_OF_FRICTION;
		else if ((!roadIsIcy) && (roadIsWet))
		     coefficientOfFriction=WET_COEFFICIENT_OF_FRICTION;
		else
			coefficientOfFriction=DRY_COEFFICIENT_OF_FRICTION;	
		return coefficientOfFriction;
	 }
	public static double computeBrakingDistance(double vehicleSpeed, boolean roadIsIcy, boolean roadIsWet) 
	{
		double coefficientOfFriction=computeCoefficientOfFriction(roadIsIcy,roadIsWet);
		double brakingDistance=(vehicleSpeed*vehicleSpeed)/(250*coefficientOfFriction);
		return brakingDistance;
	}
	public static double computeReactionDistance(double vehicleSpeed, int age) 
	{		
		double reactionTime=1+(Math.abs(age-24)*0.05);
		double reactionDistance=(vehicleSpeed/KMPH_TO_MPS_CONSTANT)*reactionTime;
		return reactionDistance;	
	}
	public static int computeStoppingDistance(double vehicleSpeed, int age, boolean roadIsIcy, boolean roadIsWet) 
	 {		 
		 int stoppingDistance=(int)Math.round(computeReactionDistance(vehicleSpeed,age)+computeBrakingDistance(vehicleSpeed,roadIsIcy,roadIsWet));
		 return stoppingDistance;
	 }
	public static void main(String[] args) 
	{
		
		Scanner input=new Scanner(System.in);
		System.out.print("Enter vehicle speed in km/hr> ");
		double vehicleSpeed=0;
		while (input.hasNext())
        {   
			if (input.hasNextDouble())
            {
        		vehicleSpeed=input.nextDouble();
        		if (vehicleSpeed>=0)
        			break;
        		else
        		{
        			System.out.println("Error: Enter a positive number for the speed of the vehicle.");
					System.out.print("Enter vehicle speed in km/hr> ");
        		}
            }
            else 
            {
            	System.out.println("Error: Enter a positive number for the speed of the vehicle.");
				System.out.print("Enter vehicle speed in km/hr> ");
				input.next();
            }
		}
		System.out.print("Enter age in years> ");
		int age=0;
		while (input.hasNext())
        {   
			if (input.hasNextInt())
            {
        		age=input.nextInt();
        		if (age>0)
        			break;
        		else
        		{
        			System.out.println("Error: Enter a positive whole number for the age of the driver.");
					System.out.print("Enter age in years> ");				
        		}
            }
            else 
            {
            	System.out.println("Error: Enter a positive whole number for the age of the driver.");
				System.out.print("Enter age in years> ");
				input.next();
            }
		}
		String roadCond="";
		System.out.print("Is the road wet (Yes/No)? ");
		String wetRoad=input.next();
		boolean roadIsWet=false;
		while (!(wetRoad.equalsIgnoreCase("yes")) || !(wetRoad.equalsIgnoreCase("no")))
		{
			if (wetRoad.equalsIgnoreCase("yes"))
			{
				roadIsWet=true ;
				roadCond="wet";
				break;
			}
			else if (wetRoad.equalsIgnoreCase("no"))
			{
				roadIsWet=false ;
				roadCond="dry";
				break;
			}
			else
			{
				System.out.println("Error: You must enter either Yes or No.");
				System.out.print("Is the road wet (Yes/No)? ");
				wetRoad=input.next();
			}
		}		
		String roadCond2="";
		System.out.print("Is the road icy (Yes/No)? ");
		String icyRoad=input.next();
		boolean roadIsIcy=false;
		while (!(icyRoad.equalsIgnoreCase("yes")) || !(icyRoad.equalsIgnoreCase("no")))
		{
			if (icyRoad.equalsIgnoreCase("yes"))
			{
				roadIsIcy=true ;
				roadCond2="icy and ";
				break;
			}
			else if (icyRoad.equalsIgnoreCase("no"))
			{
				roadIsIcy=false ;
			    break;
			}
			else
			{
				System.out.println("Error: You must enter either Yes or No.");
				System.out.print("Is the road icy (Yes/No)? ");
				wetRoad=input.next();
			}
		}
		System.out.println("As the road is " +roadCond2 + roadCond + ", the coefficient of friction is " + computeCoefficientOfFriction
				(roadIsIcy,roadIsWet));
		System.out.printf("At a speed of %.1fkm/hr, a driver who is %.0f years old, the reaction distance is %.0fm, the braking distance is %.0f"
				+ "m, and so the stopping distance is %.0fm",vehicleSpeed,(double)age,computeReactionDistance(vehicleSpeed,age),computeBrakingDistance(
						vehicleSpeed,roadIsIcy,roadIsWet),(double)computeStoppingDistance(vehicleSpeed,age,roadIsIcy,roadIsWet));
        input.close();
	}

}
