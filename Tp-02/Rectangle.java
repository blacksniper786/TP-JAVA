public class Rectangle {
	Point origine;
	double largueur;
	double longeur;
	Rectangle(Point p,double la,double lo){
		origine=p;
		largueur = la;
		longeur = lo;
	}
	
	//calcule aire
	
	public double Aire() {
		return longeur*largueur;
	}
	
	//translation de rectangle vres un point
	
	public void Translate(Point pt) {
		origine = pt;
	}
	
	// get Rectangle Origine
	
	public String getRectOrig() {
		return (origine.x +" "+origine.y);
	}
	
	// teste si un point est a interieur de rectangle
	
	public boolean Contient(Point pc, Rectangle rcournt) {
		if (	(pc.x-origine.x < rcournt.largueur ) 
				&& (pc.y-origine.y) < rcournt.longeur	) {
			return true;
		}else {
			return false;
			}
	}
	
	// teste si rect1 contient rect2
	
	public boolean ContientRect(Rectangle rect,Rectangle rc){
		if( Contient(rect.origine,rc) 
					&& (rect.largueur < rc.largueur) 
					&& (rect.longeur < rc.longeur) ) {
			return true;
		}else {
			return false;
		}
		
	}
	//
	public boolean Egaux(Rectangle rect1,Rectangle rect2) {
		if( Contient(rect2.origine,rect1) 
				&& rect2.largueur < rect1.largueur 
				&& rect2.longeur < rect1.longeur ) {
			return true;
		}else {
			return false;
		}
	}
}