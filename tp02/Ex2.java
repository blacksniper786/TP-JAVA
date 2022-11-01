package tp02;

public class Ex2 {

	public static void main(String[] args) {
		// teste class Point
		
		/*System.out.println("enter les coordonne de votre point :");*/
		Point p1 = new Point(1.1,1.1);
		Point p2 = new Point(0.0,0.0);
		/*double z = p1.Dist(p2.x,p2.y);
		p1.toString();
		System.out.println("les coordonne de votre point :\n"+ 
				p1.x+"\n"+p1.y+"\ndist = "+z);*/
		
		// teste class Rect
		
		Rect r1 = new Rect(p2,4.0,8.0);
		System.out.println(r1.Aire()); //teste Aire()
		
		//teste translation de rect
		
		/*Point tr = new Point(5.0,4.0);
		r1.Translate(tr);*/
		System.out.println(r1.getRectOrig());
		
		// teste si point est l'interieur de rectangle
		
		System.out.println(r1.Cont(p1));
		
		// teste si r2 est is inside r1
		
		Rect r2 = new Rect(p1,5.0,10.0);
		System.out.println(r1.ContientRect(r2));
		
		// teste si r1 == r2 ? 
		
		System.out.println(r1.Egaux(r2));
	}

}
