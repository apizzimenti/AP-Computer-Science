import java.util.ArrayList;

public class U10FR {
	
	private ArrayList<Quadrilateral> list = new ArrayList<Quadrilateral>();
	
	public static void main(String[] args) {
		U10FR app = new U10FR();
	}
	
	public U10FR() {
		list.add(new Parallelogram("ABCD", new Point(3,4), new Point(0,0), new Point(8,0)));
		list.add(new Parallelogram("EFGH", new Point(-3,4), new Point(1,1), new Point(10,1)));
		list.add(new Trapezoid("IJKL", new Point(1,3), new Point(0,0), new Point(5,0), new Point(3,3)));
		list.add(new Parallelogram("MNOP", new Point(4,9), new Point(3,2), new Point(6,2)));
		list.add(new Trapezoid("QRST", new Point(3,5), new Point(2,2), new Point(9,2), new Point(6,5)));   
		System.out.println("Label\tPerimeter\tArea\n");
		
		for(Quadrilateral x : list) {
			String per = String.format("%.1f", x.perimeter());
			String ar = String.format("%.1f", x.area());
			System.out.println(x.getLabel() + "\t" + per + "\t\t" + ar);
		}
	}
}  
