package maxandmin;
import java.util.Scanner;
public class maxandmin {

	public static void main(String[] args) {
		
		
		
		System.out.print("Enter your list of numbers separated by spaces:");
		Scanner input = new Scanner( System.in );
		Scanner inputLine = new Scanner( input.nextLine() );
		if (inputLine.hasNextDouble())
		{
			double minimumNumber = inputLine.nextDouble();
			double maximumNumber = minimumNumber;
			while (inputLine.hasNextDouble())
			{
				double currentNumber = inputLine.nextDouble();
				if (currentNumber < minimumNumber)
					minimumNumber = currentNumber;
				if (currentNumber > maximumNumber)
					maximumNumber = currentNumber;
			}
			System.out.println("The numbers you entered are between " +
				             	minimumNumber + " and " + maximumNumber );
		}
		else
		{
			System.err.println("Error: No numbers provided.");
		}
	}
			
		

	}


