import java.util.Scanner;
public class ETestSample {
	
	public static int computeNextProperDivisor( int number, int lastProperDivisor ) {
		
		int num=-1;
		
		for (int index=lastProperDivisor+1;index<number;index++)
		{
			if (number%index==0)
			{
				num=index;
				break;
			}
		}
		
		
		return num;
	}
	
	public static int sumOfProperDivisors( int number ) {
		
		int sum=1;
		boolean con=true;
		int index=1;
		while (con)
		{
		
		if (index>=number)
		{
			con=false;
			break;
		}
		int a=computeNextProperDivisor(number,index);
		if (a!=-1)
		sum+=a;
		else
			con=false;
		
		index=a;
		}
		
		return sum;
	}
	
	public static String isDeficientPerfectOrAbundant( int number) { 
		
		String answer="";
		int a=sumOfProperDivisors(number);
		if (a>number)
			answer="Abudant";
		if (a<number)
			answer="Deficient";
		if (a==number)
			answer="Perfect";
		
		return answer;
	}
	
	public static boolean isAdmirable( int number ) {
		
		int sum=sumOfProperDivisors( number );
		boolean con=true;
		boolean answer=false;
		int index=1;
		while (con) {
			
			if (sum-2*1==number) {
				
				con=false;;
			    answer=true;
			    break;
			}
			
			
			if (sum-2*computeNextProperDivisor( number, index )==number) {
				
				con=false;;
			    answer=true;
			    break;
			}
				
			if (index>=number)
			{
				con=false;
			}
			index++;
		}
		
		return answer;
	}

	public static void main(String[] args) {
		
		boolean con=true;
		Scanner input=new Scanner(System.in );
		while (con) {
			
			System.out.print("Enter the positive whole number to be considered (or 'quit')> ");
				
			if (input.hasNextInt())
			{
				int a =input.nextInt();
				
				if (a<0) {
					System.out.println(" Error: "+a+" is not a positive whole number. ");
				}
				if (a>=0) {
				String ans1=isDeficientPerfectOrAbundant(a);
				boolean ans2=isAdmirable(a);
				String adm="";
				if (ans2) {
					adm="Admirable";
				}
				
				if (!ans2) {
					adm="not Admirable";
				}
					
				System.out.println(a + " is " + ans1+" and is " +adm);
			}
			}
			else
			{
				String b=input.next();
				if (b.equalsIgnoreCase("quit")) {
					
					break;
				}
				System.out.println(" Error: "+b+" is not a positive whole number. ");
				
				
			}
				
		}
	}

}
