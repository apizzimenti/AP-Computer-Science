
public abstract class vehicle {
	
	private int initX;
	private int initY;
	
	public vehicle(int a, int b) {
		initX = a;
		initY = b;
	}
	
	public int getX() {
		return initX;
	}

	public int getY() {
		return initY;
	}
	
	public void draw(){}
}
