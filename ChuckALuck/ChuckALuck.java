/* SELF ASSESSMENT 

1. ResolveBet
I have correctly defined ResolveBet which takes the bet type (String) and the Wallet object, and a void return type [Mark out of 7: 7 ].
Comment: Yes, the method ResolveBet accordingly takes the bet type (String) and the Wallet object, and has a void return type.
My program presents the amount of cash in the wallet and asks the user how much he/she would like to bet [Mark out of 8: 8].
Comment: Yes, the program displays the cash remaining in wallet and asks the user how much they would like to bet.
My program ensures the bet amount is not greater than the cash in the wallet [Mark out of 5: 5].
Comment: Yes, in case the bet amount is greater than the cash in wallet the programs throws an error statement informing the user of the same.
My program creates three Dice objects, rolls them and creates a total variable with a summation of the roll values returned [Mark out of 15: 15]..
Comment: Yes, in the program three Dice objects are created namely dice1, dice2, dice3 and rolls each one of them. The program also has a total variable containing the sum of all 3 rolls.
My program determines the winnings by comparing the bet type with the total and comparing the bet type with the dice faces for the triple bet [Mark out of 20: 20].
Comment: Yes, the program utilizes switch statements with all the bet types and its conditions to compare and check the total and dice faces to determine whether the user won or lost.
My program outputs the results (win or loss) and adds the winnings to the wallet if user wins or removes the bet amount from the wallet if the user loses [Mark out of 10:10 ].
Comment: Yes, the program displays whether the user won or loss and appropriately adds the winnings and removes the losses from the wallet

2. Main
I ask the user for the amount of cash he/she has, create a Wallet object and put this cash into it [Mark out of 15: 15]
Comment: Yes, the program asks the user how much cash they would like to put in the wallet.
My program loops continuously until the user either enters quit or the cash in the wallet is 0 [Mark out of 5: 5]
Comment: Yes, Using a while loop, the program loops continuously until the user either enters quit or the cash in the wallet is 0.
I ask the user to enter any of the four bet types or quit [Mark out of 5: 5].
Comment: Yes, the user is asked to enter any of the four bet types or quit.
My program calls resolveBet for each bet type entered [Mark out of 5: 5].
Comment: Yes, the program utilizes the ResolveBet method for each bet.
At the end of the game my program presents a summary message regarding winnings and losses [Mark out of 5: 5]
Comment: Yes, I created a separate method called summary to display the users winnings or losses.

 Total Mark out of 100 (Add all the previous marks): 100
*/

import java.util.Scanner;
public class ChuckALuck {
	
	public static void ResolveBet(String betType, Wallet newWallet) {
		
		Scanner input = new Scanner(System.in);
		System.out.println(newWallet.toString());
		System.out.print("Enter your bet amount. ");
		if (input.hasNextDouble()) {
			double bet = input.nextDouble();
			if (bet>0) {
				boolean enoughFunds = newWallet.get(bet);
				if (!enoughFunds) {
					
					System.out.println("You do not have sufficeint funds in the wallet to make this bet.");
				}
				else {
					
					Dice dice1 = new Dice();
					Dice dice2 = new Dice();
					Dice dice3 = new Dice();
					
					int roll1 = dice1.roll();
					int roll2 = dice2.roll();
					int roll3 = dice3.roll();
					int total = roll1+roll2+roll3;
					double winnings = 0;
					
					switch(betType.toUpperCase())
					{
					case "TRIPLE":
						
						System.out.println("The rolls were : " + roll1 + ", " + roll2 + ", " + roll3);
						
						if (roll1==roll2 && roll2==roll3 && roll1!=1 && roll1!=6) {
							
							winnings = 30 * bet;
							newWallet.put(winnings*2);
							System.out.println("Cnogratulations you have won " + winnings + " Euros");
							System.out.println();
						}
						else {
							System.out.println("Unlucky! You lost");
							System.out.println();
						}
						
						break;
						
					case "FIELD":
						
						System.out.println("The rolls were : " + roll1 + ", " + roll2 + ", " + roll3);
						
						if (total<8 || total>12) {
							
							winnings = bet;
							newWallet.put(winnings*2);
							System.out.println("Cnogratulations you have won " + winnings + " Euros");
							System.out.println();
						}
						else {
							System.out.println("Unlucky! You lost");
							System.out.println();
						}
							
						break;
						
					case "HIGH":
						
						System.out.println("The rolls were : " + roll1 + ", " + roll2 + ", " + roll3);
						
						if (total>10 && (roll1!=roll2 || roll2!=roll3 || roll1!=roll3)) {
							
							winnings = bet;
							newWallet.put(winnings*2);
							System.out.println("Cnogratulations you have won " + winnings + " Euros");
							System.out.println();
						}
						else {
							System.out.println("Unlucky! You lost");
							System.out.println();
						}
							
						break;
							
						
					case "LOW":
					
						System.out.println("The rolls were : " + roll1 + ", " + roll2 + ", " + roll3);
						
						if (total<11 && (roll1!=roll2 || roll2!=roll3 || roll1!=roll3)) {
							
							winnings = bet;
							newWallet.put(winnings*2);
							System.out.println("Cnogratulations you have won " + winnings + " Euros");
							System.out.println();
						}
						else {
							System.out.println("Unlucky! You lost");
							System.out.println();
						}
							
						break;
						
					 default:
						
						System.out.println("Invalid bet type. Please only enter one of the four given bet types");
						System.out.println();
						newWallet.put(bet);
					
					}
					
					}
			}
			else
				System.out.println("Invalid Bet. Please try again and make sure to only enter a cash amount greater than 0, you want to bet. ");
		}
		else
			System.out.println("Invalid Bet. Please try again and make sure to only enter in mumerals the cash amount you want to bet. ");
	}
	
	public static void summary(double initialMoney, double finalMoney) {
		
		if (initialMoney>0) {
		
			if (initialMoney>finalMoney) {
				
				System.out.println("SUMMARY: ");
				System.out.println("Better luck next time! You lost " +(initialMoney-finalMoney)+ " Euros");
				System.out.print("Your initial investment was " + initialMoney + " Euros and your final return was " 
				+ finalMoney + " Euros");
			}
			
			if (initialMoney<=finalMoney) {
				
				System.out.println("SUMMARY: ");
				System.out.println("Congratulations! You have Won " +(initialMoney-finalMoney)+ " Euros");
				System.out.print("Your initial investment was " + initialMoney + " Euros and your final return was " 
				+ finalMoney + " Euros");
				
			}
			
		}
		
	}
	
	public static void main(String[] args) {
		
		Wallet myWallet = new Wallet();
		System.out.print("Enter the amount of cash you want in your wallet. ");
		Scanner input = new Scanner(System.in);
		double cash = 0;
		boolean quit = false;
		if (input.hasNextDouble()) {
			cash = input.nextDouble();
			if (cash<=0) {
				System.out.println("Invalid input. Please try again and make sure to only enter a cash amount greater than 0, you want in your wallet");
				quit = true;
			}
		}
		else {
			System.out.println("Invalid input. Please try again and make sure to only enter in mumerals the cash amount you want in your wallet");
			quit = true;
		}
		String betType="";
		myWallet.put(cash);
		
		while(!quit) {
			
			if (myWallet.check()==0) {
				System.out.println("Unfortunately you have exhausted your wallet. Thanks for playing! Hope to see you again soon.");
				quit=true;
				break;
			}
			System.out.println("Enter the type of bet you would like to play or type quit to stop playing. ");
			System.out.println("1.Triple 2.Field 3.High 4.Low");
			betType = input.next();
			if (betType.equalsIgnoreCase("quit")) {
				
				System.out.println("Thanks for playing! Hope to see you again soon.");
				quit=true;
				break;
			}
			ResolveBet(betType, myWallet);
		}
		System.out.println();
		summary(cash,myWallet.check());
		input.close();		

	}

}
