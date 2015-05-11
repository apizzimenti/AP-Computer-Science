// Anthony Pizzimenti
//
// Baseball player parent class with name/GP
/* for AP, my best friend. */
/* ----------------------- */

public abstract class BaseballPlayer {
	
	private String name;
	private int played;
	
	public BaseballPlayer(String a, int b) {
		name = a;
		played = b;
	}
	
	public String toString() {
		return "Name: " + name + "\nGames: " + played;
	}
	
	public abstract void setStat();
}
