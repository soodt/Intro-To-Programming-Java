
public class TEST {

	public static void main(String[] args) {
		
		CIRCLE myCirc = new CIRCLE(100);
		System.out.println(myCirc.getArea());
		System.out.println(myCirc.getPerimeter());
		
		ResizableCircle myCirc2 = new ResizableCircle(100);
		myCirc2.resize(10);
		System.out.println(myCirc2.getArea());
		System.out.println(myCirc2.getPerimeter());
	}

}
