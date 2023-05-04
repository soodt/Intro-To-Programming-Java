package tutorialfactorial;

public class tutorialfactorial {
	
	public static int computeFactorial(int number)
	{
		
		int result = 1;
		for (int index=2; (index<=number); index++)
			result *= index;
		return result;
	}
	
	public static boolean isFactorian(int number2)
	{
		int quotient=1;
		int number=number2;
		int factorial=0;
		while (quotient>0)
		{
			quotient=number2/10;
			int remainder=number2-(10*quotient);
			number2=quotient;
			factorial= factorial+computeFactorial(remainder);
			
			
		}
		if (factorial==number)
		{
		return true;
		}
		else 
			return false;
	}

	public static void main(String[] args) {
		
		int number=145;
		
		//System.out.println(computeFactorial(number));
		System.out.print(isFactorian(number));
		
	}

}
