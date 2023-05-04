import java.util.Scanner;
public class Tutorialdate {


	public static  boolean validDate(int days,int month,int year)
	{
		boolean validDate=false;
		if ((month>0) && (month<=12))
		{
			if (days<=daysInMonth(month,year) && days>0)
			{
				validDate=true;
			}
			else
				validDate=false;		
		}
		return validDate;
	}
	public static  int daysInMonth(int month,int year)
	{
		int days=0;
		switch(month)
		{
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:
			 days=31;
		case 2:
			if (isLeapYear(year))
			    days=29;
			else days=28;
		case 4:		
		case 6:		
		case 9:		
		case 11:
			 days=30;		
		}
		return days;
	}
	public static  boolean isLeapYear(int year)
	{
		boolean isLeapYear = (((year%4 == 0) && (year%100 != 0)) || (year%400 == 0));
		return isLeapYear;
	}
	public static void main(String[] args) {
		Scanner input = new Scanner( System.in );
		System.out.print("Enter the Days in month");	
		int days=input.nextInt();
		System.out.print("Enter the month");	
		int month=input.nextInt();
		System.out.print("Enter the year");	
		int year=input.nextInt();
		if (validDate(days,month,year))
		{
			System.out.println("The entered date is valid");
		}
		else
			System.out.println("The entered date is not valid");
		input.close();
			
		

	}

}
