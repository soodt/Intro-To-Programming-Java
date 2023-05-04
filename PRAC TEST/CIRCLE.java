import java.lang.Math.*;
public class CIRCLE implements GeometricObject1 {
	
	double radius=1.0;
	CIRCLE(double radius){
		
		this.radius=radius;
	}
	
	public double getPerimeter() {
		
		double perimeter;
		
		perimeter = 2 * Math.PI * radius;
		
		return perimeter;
	}
	public double getArea() {
		
		double area;
		
		area = Math.PI * (radius*radius);
		return area;
	}

}



