import java.util.Scanner;
public class Average {

	public static void main(String[] args) {
		System.out.print("Enter the first number");
		Scanner input =new Scanner( System.in);
		double num1= input.nextDouble();
		System.out.print("Enter the second number");
		double num2= input.nextDouble();
		System.out.print("Enter the third number");
		double num3= input.nextDouble();
		double average=(num1+num2+num3)/3;
		double stanDev=Math.sqrt(((num1-average)*(num1-average)+
				(num2-average)*(num2-average)+(num3-average)*
				(num3-average))/3);
		System.out.println("The average of the given three numbers is "
				+ average);
		System.out.print("The Standard Deviation of the given"
				+ " three numbers is " + stanDev );
		

	}

}
