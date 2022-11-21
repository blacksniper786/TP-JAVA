package tp03;
import java.util.Enumeration;
import java.util.Vector;

public class Carre extends Figure {
	private double cote;
	public Carre(Figure f,double cote) {
		super(f);
		this.cote=cote;
		
	}
	
	static Vector getInstances() {
		//return this.vector;
		Vector instancesCarre = new Vector();
		Vector instance = Figure.getInstance();
		Enumeration e = instance.elements();
		Figure uneFigure;
		while(e.hasMoreElements()) {
			uneFigure=(Figure)e.nextElement();
			if(uneFigure instanceof Carre)
				instancesCarre.add(uneFigure);
		}
		return instancesCarre;
}
	public String toString() {
		return super.toString() + " cote : "+this.cote+"\n";
	}
	
}
