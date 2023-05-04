
public class Christmas {

	public static void main(String[] args) {
		int months=12;
		for(int count=1;months>=count;count++)
		{
			int count2=count;
			String day="";
			if (count2==1)
			{
				day="first";		  
			}
			if (count2==2)
			{
				day="second";		  
			}
			if (count2==3)
			{
				day="third";		  
			}
			if (count2==4)
			{
				day="fourth";		  
			}
			if (count2==5)
			{
				day="fifth";		  
			}
			if (count2==6)
			{
				day="sixth";		  
			}
			if (count2==7)
			{
				day="seventh";		  
			}
			if (count2==8)
			{
				day="eighth";		  
			}
			if (count2==9)
			{
				day="nineth";		  
			}
			if (count2==10)
			{
				day="tenth";		  
			}
			if (count2==11)
			{
				day="eleventh";		  
			}
			if (count2==12)
			{
				day="twelfth";		  
			}
			System.out.println("On the " + day + " day of christmas");
		    System.out.println("my true love sent me:");
			switch(count2) {			
			case 12:
				System.out.println("12 Drummers drumming");
				
				
			case 11:
				System.out.println("11 pipers piping");
				
			case 10:
				System.out.println("10 Lords a leaping");
				
			case 9:
				System.out.println("9 Ladies Dancing");
				
			case 8:
				System.out.println("8 maids a milking");
				
			case 7:
				System.out.println("7 swans a swimming");
				
			case 6:
				System.out.println("6 gaese a laying");
				
			case 5:
				System.out.println("5 golden rings");
				
			case 4:
				System.out.println("4 calling birds");
				
			case 3:
				System.out.println("3 fresnch hens");
				
			case 2:
				System.out.println("2 turtle doves");
				
			case 1:
				System.out.println("a Partridge in a pear tree");
				System.out.println();
			default:
				
			
			}    
		}   

	}

}