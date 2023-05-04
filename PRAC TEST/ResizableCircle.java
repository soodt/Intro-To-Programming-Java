public class ResizableCircle extends CIRCLE implements Resizable {

	ResizableCircle(double radius) {
		super(radius);
	}
	public void resize(int percentage) {
		
		radius = radius-(radius * percentage)/100;
		
	}
	
}
