import java.util.Scanner;
public class AreaofTriangle {

	public static void main(String[] args) {
		/*Scanner input =new Scanner( System.in);
		
		
		System.out.print("Enter the x coordinate of the first"
				+ " vertice");		
		double vertice1x= input.nextDouble();
		System.out.print("Enter the y coordinate of the first"
				+ " vertice");
		double vertice1y = input.nextDouble();
		
		
		
		
		
		System.out.print("Enter the x coordinate of the Second"
				+ " vertice");		
		double vertice2x= input.nextDouble();
		System.out.print("Enter the y coordinate of the Second"
				+ " vertice");
		double vertice2y = input.nextDouble();
		
		
		
		
		
		System.out.print("Enter the x coordinate of the Third"
				+ " vertice");		
		double vertice3x= input.nextDouble();
		System.out.print("Enter the y coordinate of the Third"
				+ " vertice");
		double vertice3y = input.nextDouble();
		
		
		input.close();
		
		
		
		double area= Math.abs(((vertice1x*(vertice2y-vertice3y)+
				vertice2x*(vertice3y-vertice1y)+
				vertice3x*(vertice1y-vertice2y)))/2);
		
		System.out.print("The area of the given Triangle is " + area );*/
		
		
		
		
		
		
		
		System.out.print("Enter the coordinates of the triangle separated\nby spaces (x1 y1 x2 y2 x3 y3):");
		Scanner inputScanner = new Scanner( System.in );
		double x1 = inputScanner.nextDouble();
		double y1 = inputScanner.nextDouble();
		double x2 = inputScanner.nextDouble();
		double y2 = inputScanner.nextDouble();
		double x3 = inputScanner.nextDouble();
		double y3 = inputScanner.nextDouble();
		inputScanner.close();
		
		double area = Math.abs( (x1*(y2-y3) + x2*(y3-y1) + x3*(y1-y2)) / 2.0 );
		
		System.out.printf( "The area of triangle ((%.1f, %.1f), "
				+ "(%.1f, %.1f), (%.1f, %.1f)) is %.2f", 
				x1, y1, x2, y2, x3, y3, area);

		

	}

}
