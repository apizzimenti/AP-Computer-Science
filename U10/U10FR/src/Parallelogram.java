public class Parallelogram extends Quadrilateral {
	
	private Point topLeft;
	private Point botLeft;
	private Point botRight;
	
	public Parallelogram(String lbl, Point tL, Point bL, Point bR) {
		super(lbl);
		topLeft = tL;
		botLeft = bL;
		botRight = bR;
	}
	
	public double perimeter() {
		double per1 = super.distance(topLeft, botLeft);
		double per2 = super.distance(botLeft, botRight);
		return 2 * (per1 + per2);
	}
	
	public double area() {
		return (botRight.getX() - botLeft.getX()) * (topLeft.getY() - botLeft.getY());
	}
}
