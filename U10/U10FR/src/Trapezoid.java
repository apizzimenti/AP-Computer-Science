public class Trapezoid extends Quadrilateral {
	
	private Point topLeft;
	private Point botLeft;
	private Point botRight;
	private Point topRight;

	public Trapezoid(String lbl, Point tL, Point bL, Point bR, Point tR) {
		super(lbl);
		topLeft = tL;
		botLeft = bL;
		botRight = bR;
		topRight = tR;
	}
	
	public double perimeter() {
		double top = super.distance(topLeft, topRight);
		double left = super.distance(topLeft, botLeft);
		double bot = super.distance(botLeft, botRight);
		double right = super.distance(botRight, topRight);
		return top + left + bot + right;
	}
	
	public double area() {
		double b1 = super.distance(botLeft, botRight);
		double b2 = super.distance(topLeft, topRight);
		int height = topLeft.getY() - botLeft.getY();
		return ((b1 + b2) / 2) * height;
	}
}
