import java.util.Scanner;
public class ETest1 {
	
    public static boolean isNude( int number ) {
		
		int numOfDigit=getNumberOfDigits(number);
		int count=0;
		boolean nude=false;
		for (int index=1;numOfDigit>=index;index++) {
			int num=getDigit(number,index);
			if (num!=0 && (number%num)==0)
				count+=1;
			
		}
		if (count==numOfDigit)
			nude=true;
		return nude;
	}
	
	public static int getNumberOfDigits( int number ) {
	
		 int count=0;
		 int numberCopy=number;
		 int quotient=number/10;
		 while ((quotient!=0) && number!=0) {
			 
			 quotient=number/10;
			 number=number%10;
			 count++;
		
		 }
		 if (((quotient==0) && (numberCopy<10) && (numberCopy>-10)) || (numberCopy%10==0))
			 count+=1;
		 
		 return count;
		 
	}
		
	public static int getDigit( int number, int digitNumber ) {
		
		 
		 int quotient=number/10;
		 if (digitNumber>0) {
		 for (int index=0;digitNumber>index;index++) {
			 quotient=number/10;
		     number=number%10;	
		 }
		 }
		 else
			 quotient=-1;
		 return quotient;
	}
	
	public static boolean isZygodrome( int number ) {
		
		boolean isZyg=false;
		int numOfDigit= getNumberOfDigits(number );
		for (int index=1;numOfDigit>index;index++) {
			
			int num1=getDigit(number,index);
			int num2=getDigit(number,(index+1));
			int count=1;
			if (num1==num2)
			{
				boolean con=true;
				while (con) {
					
					if (num1!=getDigit(number,count)) {
						index=count;
						con=false;
					}
					if (count>=numOfDigit)
						con=false;
					count++;
					
				}
			}
				
			
		}
		return isZyg;
	}
	
	public static void main(String[] args) {
		
		boolean quit=false;
		Scanner input = new Scanner(System.in);
		while (!quit) {
			
			int number=0;
			System.out.print("Enter the maximum positive whole number to be considered (or -1 to quit)> ");
			
			if (input.hasNextInt()) {
				
				number=input.nextInt();
				if ((number<0) && (number!=-1))
					System.out.println("Error: twenty is not a positive whole number.");
				else {
					String zygAndNude="";
					int count=0;
					for (int index=0;number>=index;index++) {
						
						if (isNude(index) && isZygodrome(index)) {
							count++;
							if (index==11)	
								zygAndNude+=""+index;
							else
								zygAndNude+=""+index+", ";
						}
					}
					if (count>0)
						System.out.println("The numbers which are both zygodromes and nude up to " + number +" are " + zygAndNude );
					else
						System.out.println("There are no numbers which are both zygodromes and nude up to "+number);
				}
			}
				
				
			else
				System.out.println("Error: twenty is not a positive whole number.");
			
		}
		input.close();
	}

}
