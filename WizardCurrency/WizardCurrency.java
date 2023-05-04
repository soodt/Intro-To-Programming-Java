import java.util.Scanner;
public class WizardCurrency {
	
	public static final double VALUE_OF_KNUTS=1;
	public static final double VALUE_OF_SICKLES=29;
	public static final double VALUE_OF_GALLEON=493;
	public static final double VALUE_OF_POUND=162.7254;
	public static final double VALUE_OF_PENCE=1.6272;
	public static final double POUND_TO_PENCE=100.00;
	
	public static int convertGBPToKnuts( int pounds, int pence ) {
	
		return (int)Math.round(pounds*VALUE_OF_POUND+pence*VALUE_OF_PENCE);
	}
	public static String convertKnutsToWizardingCurrency( int totalKnuts ) {
		
		int numberOfGalleons=(int)(totalKnuts/VALUE_OF_GALLEON);
		int numberOfSickles=(int)((totalKnuts%VALUE_OF_GALLEON)/VALUE_OF_SICKLES);
		int numberOfKnuts=(int)((totalKnuts%VALUE_OF_GALLEON)%VALUE_OF_SICKLES);
		
		return ("HP"+numberOfGalleons+":"+numberOfSickles+":"+numberOfKnuts);
	}
	public static String convertGBPToWizardingCurrency( int pounds, int pence ) {
		
		return(convertKnutsToWizardingCurrency(convertGBPToKnuts(pounds, pence )));
	}
	public static int convertWizardingCurrencyToKnuts( int numGalleons, int numSickles, int numKnuts ) {
		
		return (int)(numKnuts+(numSickles*VALUE_OF_SICKLES)+(numGalleons*VALUE_OF_GALLEON));
	}
	public static int convertWizardingCurrencyToPence( int numGalleons, int numSickles, int numKnuts ) {
		
		double penceAmount=Math.round(convertWizardingCurrencyToKnuts(numGalleons, numSickles, numKnuts)/VALUE_OF_PENCE);
		return ((int)penceAmount);
	}
	public static double getNumberFromUser( String prompt, String errorMessage, Scanner input, boolean integerRequired ) {
		
		boolean condition=true;
		double userNumber=0;
		while (condition){
			System.out.print(prompt);
			if (integerRequired)
			{
				if (input.hasNextInt())
				{
					userNumber=input.nextInt();
					condition=false;
				}
				else
				{   
					if (prompt.equals("Select function> "))
						break;
					System.out.println(errorMessage);
				    input.next();
				}
			}
			else
			{
				if (input.hasNextDouble())
				{
					userNumber=input.nextDouble();
					condition=false;
				}
				else 
				{
					System.out.println(errorMessage);
					input.next();
				}
			}
		}
		 return userNumber;
	}

	public static void main(String[] args) {
		
	   Scanner input=new Scanner(System.in);
	   boolean quit=false;
	   while (!quit)
	   {
			System.out.println("1. Convert Wizarding Currency To GBP");
			System.out.println("2. Convert Knuts To Wizarding Currency and GBP");
			System.out.println("3. Convert GBP to Wizarding Currency");
			System.out.println("4. Quit");
			
			String prompt="Select function> ";
			String errorMessage="Error: Invalid selection.";
			boolean integerRequired=true;			
			double userNumber=(int)getNumberFromUser( prompt,  errorMessage, input, integerRequired);
			switch((int)userNumber)
			{
			default:
				System.out.println("Error: Invalid selection.");
				quit=true;
				break;
			case 1:
				prompt="Enter the number of Galleons > ";
				errorMessage="Error: The number of Galleons should be an integer (e.g. 3)";
				integerRequired=true;
				int numGalleons=(int)getNumberFromUser( prompt,  errorMessage, input, integerRequired);
				prompt="Enter the number of Sickles > ";
				errorMessage="Error: The number of Sickles should be an integer (e.g. 5)";
				int numSickles=(int)getNumberFromUser( prompt,  errorMessage, input, integerRequired);
				prompt="Enter the number of Knuts > ";
				errorMessage="Error: The number of Knuts should be an integer (e.g. 12)";
				int numKnuts=(int)getNumberFromUser( prompt,  errorMessage, input, integerRequired);
				double gbp=convertWizardingCurrencyToPence( numGalleons, numSickles, numKnuts )/POUND_TO_PENCE;
				System.out.printf("In British Pounds HP%.0f:%.0f:%.0f is GBP%.2f\n",(double)numGalleons, (double)numSickles, (double)numKnuts,gbp);
				quit=true;
				break;
				
			case 2:
				prompt="Enter the number of Knuts > ";
				errorMessage="Error: The number of Knuts should be an integer (e.g. 56)";
				integerRequired=true;
				int totalKnuts=(int)getNumberFromUser( prompt,  errorMessage, input, integerRequired);
				String wizardCurrency=convertKnutsToWizardingCurrency(totalKnuts);
				System.out.printf(totalKnuts+" knuts is "+wizardCurrency+" is equal to GBP%.2f",((double)(totalKnuts/VALUE_OF_POUND)));
				quit=true;
				
				
			case 3:
				prompt="Enter the number of British pounds and pence (e.g. 1.24) > ";
				errorMessage="Error: Invalid number of British pounds and pence";
				integerRequired=false;
				gbp=getNumberFromUser( prompt,  errorMessage, input, integerRequired);
				double gbpInPence=gbp*POUND_TO_PENCE;
				int pound=(int)(gbpInPence/100);
				int pence=(int)(gbpInPence%100);
				wizardCurrency=convertGBPToWizardingCurrency(pound, pence );
				System.out.println("In wizarding currency GBP"+gbp+" is "+wizardCurrency);
				quit=true;
				
			case 4:
				quit=true;
				
			
		
	   }
	   }

	}

}
