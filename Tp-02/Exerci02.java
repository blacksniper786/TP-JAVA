//liee a Point & Rectangle
public class Exerci02 {
	public static void main(String args[]) {
		
		// teste class Point
		
		/*System.out.println("enter les coordonne de votre point :");*/
		Point p1 = new Point(15.8,2.8);
		Point p2 = new Point(0.0,0.0);
		/*double z = p1.Dist(p2.x,p2.y);
		p1.toString();
		System.out.println("les coordonne de votre point :\n"+ 
				p1.x+"\n"+p1.y+"\ndist = "+z);*/
		
		// teste class Rect
		
		Rectangle r1 = new Rectangle(p2,5.0,8.0);
		System.out.println(r1.Aire()); //teste Aire()
		
		//teste translation de rect
		
		Point tr = new Point(5.0,4.0);
		r1.Translate(tr);
		System.out.println(r1.getRectOrig());
		
		// teste si point est l'interieur de rectangle
		
		System.out.println(r1.Contient(p1,r1));
		
		
	
	}
}



//test the Point & Rectangle class