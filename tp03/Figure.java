package tp03;
import java.util.Vector;

public class Figure {
	private double x,y;
	private int couleur;
	private static  Vector instances = new Vector();
	
	public Figure(double x,double y,int couleur) {
		this.x=x;
		this.y=y;
		this.couleur=couleur;
		instances.add(this);
	}
	public Figure(Figure f) {
		this.x=f.x;
		this.y=f.y;
		this.couleur=f.couleur;
		instances.add(this);
	}
	
	
	public static Vector getInstance() {
		return instances;
	}
	
	/*public String toString() {
		return "x : "+this.x+"\ny : "+this.y+"\ncouleur : "+this.couleur;
	}*/
}
