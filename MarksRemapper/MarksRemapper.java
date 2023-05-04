import java.util.Scanner;
public class MarksRemapper {
	
	public static double determineAverage( double[] arrayOfNumbers )
	{
	double average=0.0;
	double sum=0;
	
	if (arrayOfNumbers!=null)
	{
		if (arrayOfNumbers.length>0)
		{
		for(int count=0; count<arrayOfNumbers.length;count++)
		{
			double num =arrayOfNumbers[count];
			sum+=num;
		}
	
	average=sum/arrayOfNumbers.length;
	return average;
	}
		else
			return average;
	}
	else
	return average;
	}
	
	public static double determineStandardDeviation( double[] arrayOfNumbers, double average ) 
	{
		double sumOfSquaredDifferences = 0.0;
		double standardDeviation =0.0;
		if (arrayOfNumbers!=null)
		{
		if (arrayOfNumbers.length>0)
		{
		for (int index=0; index < arrayOfNumbers.length; index++)
		{
		double num=arrayOfNumbers[index];
		sumOfSquaredDifferences += Math.pow(num-average,2.0);
		}
		
		standardDeviation = Math.sqrt( sumOfSquaredDifferences/((double) arrayOfNumbers.length));
		return standardDeviation;
		}
		else
			return standardDeviation;
		}
		else
		return standardDeviation;
		
	}
	
	public static boolean modifyAllMarks( double[] arrayOfMarks, double desiredAverage, double desiredStandardDeviation )
	{
		boolean cond=true;
		if (arrayOfMarks!=null)
		{
		if (arrayOfMarks.length==0)
				cond=false;
		if (arrayOfMarks.length>0)
		{
		double oldAverage=determineAverage( arrayOfMarks );
		double oldStandardDeviation=determineStandardDeviation(arrayOfMarks,oldAverage );
		for (int index=0; index < arrayOfMarks.length; index++)
		{
			double oldMark =arrayOfMarks[index];
			if (oldStandardDeviation==0)
				oldStandardDeviation=1;
			double newNum= desiredAverage + (oldMark - oldAverage)*desiredStandardDeviation/oldStandardDeviation;
			if (newNum<0) 
			{
				newNum=0;
			}
			else if (newNum>100)
			{
				newNum=100;
			}
			arrayOfMarks[index]=newNum;
		}
		}
		}
		 if (arrayOfMarks==null)
			cond=false;
		return cond;
	}

	public static void main(String[] args) {
		
		Scanner input= new Scanner(System.in);
		System.out.print("Enter all percentages (separated by spaces): ");
		
		double[] tempArray = new double[100];
		int numOfElem=0;
		int count1=0;
		String myLine = input.nextLine();
		Scanner inputLine = new Scanner( myLine );
		while (inputLine.hasNext())
		{
		if (inputLine.hasNextDouble())
		{	
		double number=inputLine.nextDouble();
		if (number>100)
			number=100.0;
		if (number<0)
			number=0.0;
		tempArray[count1]=number;
		numOfElem+=1;
		count1++;
		}
		else
		{
			String error=inputLine.next();
			System.out.println(" Error: "+error+" is not a valid number.");
		    
		}
		}
		inputLine.close();
		
		double[] marksArray=new double[numOfElem];
		 
		if (numOfElem>0)
		{
		System.arraycopy( tempArray, 0, marksArray, 0,numOfElem);
		}
		double[] clone = marksArray.clone();
		double originalAverage=determineAverage(marksArray);
		double originalStandev=determineStandardDeviation( marksArray, originalAverage );
				
		modifyAllMarks( marksArray,60,20 );
	
		double newAverage=determineAverage(marksArray);
		double newStandev=determineStandardDeviation( marksArray, newAverage );
		String output="";
		if (marksArray!=null)
		{
		for (int count=0;count<=(numOfElem-1);count++)
		{
			if (count<(numOfElem-1))
			output=output+Math.round(clone[count]*10)/10.00+"->"+Math.round(marksArray[count]*10)/10.00+", ";
			else if (count==(numOfElem-1))
				output=output+Math.round(clone[count]*10)/10.00+"->"+Math.round(marksArray[count]*10)/10.00;
		}
		}
		{
			if (marksArray!=null)
		{
		if (marksArray.length>0)
		{
		System.out.println("The original average was " + Math.round(originalAverage*10)/10.00 + " and the standard deviation was " + Math.round(originalStandev*10)/10.00);
		System.out.println(output);
		System.out.println("The new average is " +  Math.round(newAverage*10)/10.00+ " and the new standard deviation is "+ Math.round(newStandev*10)/10.00);
		}
		}
		}
		input.close();
	}

}
