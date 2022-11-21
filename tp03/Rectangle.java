package tp03;

import java.util.Enumeration;
import java.util.Vector;

public class Rectangle extends Figure {
	private double lo,la;
	public Rectangle(Figure f,double lo,double la) {
		super(f);
		this.lo=lo;
		this.la=la;
	}
	
	public static Vector getInstance() {
		Vector instancesRectangle = new Vector();
		Vector instance = Figure.getInstance();
		Enumeration e = instance.elements();
		Figure uneFigure;
		while(e.hasMoreElements()) {
			uneFigure=(Figure)e.nextElement();
			if(uneFigure instanceof Carre)
				instancesRectangle.add(uneFigure);
		}
		return instancesRectangle;
	}
}
