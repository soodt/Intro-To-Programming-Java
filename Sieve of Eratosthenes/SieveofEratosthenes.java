/* SELF ASSESSMENT 
   1.    createSequence:
Did I use the correct method definition?
Mark out of 5: 5
Comment: Yes, As stated in the assignment the method named createSequence takes in an integer N and return an array of integers with the sequence 2 to N.
Did I create an array of size n (passed as the parameter) and initialize it?
Mark out of 5: 5
Comment: yes, an array of size n(as given by the parameter) is created and initialized.
Did I return the correct item?
Mark out of 5: 5
Comment: Yes as asked the the method returns an array of integers with the sequence 2 to N.
   2.    crossOutMultiples
Did I use the correct method definition?
Mark out of 5: 5
Comment: Yes, as stated in the assignment the method named crossOutMultiples takes in a int array[] and an int n and crosses out all the multiples of n in the array.
Did I ensure the parameters are not null and one of them is a valid index into the array
Mark out of 2: 2
Comment: Yes, it is ensured through if statements that neither the array is null nor the value is not an invalid index.
Did I loop through the array using the correct multiple?
Mark out of 5: 5
Comment: Yes as asked in the assignment the loop goes through the array using the correct multiple as provided.
Did I cross out correct items in the array that were not already crossed out?
Mark out of 3: 3
Comment: Yes, In this assignment the numbers were transformed to their additive inverse if they are supposed to be crossed out and in the method all the items whether
already crossed or not were crossed appropriately.
   3.    sieve   
Did I have the correct function definition?
Mark out of 5: 5
Comment:Yes, as stated in the assignment the method named sieve takes in integers greater than 2 and returns an array from 2 through to N where all non-prime numbers have
 been crossed out from the sequence using the Sieve of Eratosthenes technique.
Did I make calls to other methods?
Mark out of 5: 5
Comment: Yes, other methods like createSequence and crossOutHigherMultiples were used in making this method.   
Did I return an array with all non-prime numbers are crossed out?
Mark out of 2: 2
Comment: Yes, the method returns an appropriate array with all non-prime numbers are crossed out.
   4.    sequenceTostring  
Did I have the correct function definition?
Mark out of 5: 5
Comment:Yes, as stated in the assignment the method named sequenceTostring takes a sequence of numbers and returns a String representation of the given 
sequence of numbers with non Prime numbers enclosed in square brackets separated by commas.
Did I ensure the parameter to be used is not null?
Mark out of 3: 3
Comment: Yes, it is ensured through if statements that the array is not null.
Did I Loop through the array updating the String variable with the non-crossed out numbers and the crossed numbers in brackets? 
Mark out of 10: 10
Comment: Yes, the the String variable was constantly updated through the loop with Prime numbers and the non-prime numbers in brackets.
   5.    nonCrossedOutSubseqToString  
Did I have the correct function definition
Mark out of 5: 5
Comment: Yes, as stated in the assignment the method named nonCrossedOutSubseqToString takes a sequence of numbers and returns a String representation of the 
sub-sequence of only non-crossed out numbers separated by comma characters.
Did I ensure the parameter to be used is not null?  
Mark out of 3: 3
Comment: Yes, it is ensured through if statements that the array is not null.
Did I loop through the array updating the String variable with just the non-crossed out numbers? 
Mark out of 5: 5
Comment: Yes, the the String variable was constantly updated through the loop with Prime numbers only.
   6.    main  
Did I ask  the user for input n and handles input errors?  
Mark out of 5: 5
Comments: Yes, the user is asked for an input. To handle input errors since there was no particular way
we were asked so i used exception handling to deal with the errors as to not make any changes in the output
displayed in the assignment sheet.
Did I make calls to other methods (at least one)?
Mark out of 5: 5
Comment: Yes, other methods like createSequence, sequenceToString,crossOutHigherMultiples and
nonCrossedOutSubseqToString were used to replicate the output provided in the assignment sheet.
Did I print the output as shown in the question?  
Mark out of 5: 5
Comment: Yes, the output shown in the question is replicated in main.
   7.    Overall
Is my code indented correctly?
Mark out of 4: 4
Comments: Yes, the code is indented appropriately.
Do my variable names make sense?
Mark out of 4: 4
Comments: Yes, all variable names are easy to understand and appropriate.
Do my variable names, method names and class name follow the Java coding standard
Mark out of 4: 4
Comments: Yes, all coding standards such as lowerCamelCase were followed in the assignment.
      Total Mark out of 100 (Add all the previous marks): 100
*/


import java.lang.Math;
import java.util.Scanner;
public class SieveofEratosthenes {
	
	
	public static int[] createSequence(int lastNum){
	
		int[] sequenceOfNum;
		
		if (lastNum>=2) {
			
			sequenceOfNum = new int[lastNum-1];
			
			for (int i=0;i<lastNum-1;i++) {
				
				sequenceOfNum[i]=i+2;
			}
			
		}
		else {
			
			sequenceOfNum = new int[0];
			
		}
		return sequenceOfNum;
		
	}

	public static void crossOutHigherMultiples(int[] sequenceOfNum,int lastPrime)
	{
		if ((sequenceOfNum!=null) && (sequenceOfNum.length!=0)) {
			
			if (lastPrime>=0) {
				
				for (int i=0; i<sequenceOfNum.length;i++) {
					
					for (int j=2; j<=(sequenceOfNum[i]/2);j++) {
						
						if (sequenceOfNum[i]==lastPrime*j) {
							
							sequenceOfNum[i]=-1*Math.abs(sequenceOfNum[i]);
							//In this program negative numbers represent crossed out numbers.
						}
					}
					
				}
			
			}
		
		}
		
	}
	
	public static int[] sieve(int lastNum) {
		
		int[] sequenceOfNum;
		
		if (lastNum>=2) {
		
			sequenceOfNum=createSequence(lastNum);
			
			for (int a=0; sequenceOfNum[a]<=java.lang.Math.sqrt(lastNum);a++) {
				
				if (sequenceOfNum[a]>0) {
					
					crossOutHigherMultiples(sequenceOfNum,a+2);
				}
			}
	
		}
		
		else {
			
			sequenceOfNum=createSequence(0);
			
		}
		
		return sequenceOfNum;
	}
	
	public static String sequenceToString(int[] sequenceOfNum)
	{	
		String allPrimes="";
		
		if ((sequenceOfNum!=null) && (sequenceOfNum.length!=0)) {
		
			for (int i=0; i<sequenceOfNum.length;i++) {
				
				if (sequenceOfNum[i]>0) {
					
					if (i==sequenceOfNum.length-1) {
						
						allPrimes=allPrimes+sequenceOfNum[i];
					}
					else {
						
					allPrimes=allPrimes+sequenceOfNum[i]+", ";
					}
				}
				
				else if (sequenceOfNum[i]<0) {
					
					if (i==sequenceOfNum.length-1) {
						
						allPrimes=allPrimes+"["+Math.abs(sequenceOfNum[i])+"]";
					}
					else {
					
						allPrimes=allPrimes+"["+Math.abs(sequenceOfNum[i])+"]"+", ";
						
					}
				}
				
			}
		}
		return allPrimes;
	}
	
	public static String nonCrossedOutSubseqToString(int[] sequenceOfNum) {
		
		String allPrimes="";
		
		if ((sequenceOfNum!=null) && (sequenceOfNum.length!=0)) {
			
			for (int i=0; i<sequenceOfNum.length;i++) {
				
				if (sequenceOfNum[i]>0) {
					
					allPrimes=allPrimes+sequenceOfNum[i]+", ";
				}
			}
			
			allPrimes=allPrimes.substring(0, allPrimes.length()-2);
			
		}
			
		return allPrimes;
	}
	
	public static void main(String[] args) {
		
		try {
		
			Scanner input=new Scanner(System.in);
			System.out.print("Enter int >= 2 : ");
			int lastNum=input.nextInt();
			int[] sequenceOfNum=createSequence(lastNum);
			System.out.println(sequenceToString(sequenceOfNum));
			
			for (int a=0; sequenceOfNum[a]<=java.lang.Math.sqrt(lastNum);a++) {
				
				if (sequenceOfNum[a]>0) {
					
					crossOutHigherMultiples(sequenceOfNum,a+2);
					System.out.println(sequenceToString(sequenceOfNum));
					
				}
			}
			System.out.print(nonCrossedOutSubseqToString(sequenceOfNum));
			input.close();
		
		}
		catch(ArrayIndexOutOfBoundsException exception) {
		}
		catch(NegativeArraySizeException exception) {
		}
		catch(java.util.InputMismatchException exception) {	
		}
		catch (ArithmeticException exception) {
			
		}
	}

}
