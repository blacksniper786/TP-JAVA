package tp02;

public class Rect {
	Point o;
	double la;
	double lo;
	
	Rect(){
		o = new Point();
		this.la = 0;
		this.lo = 0;
	}
	Rect(Point o,double la,double lo){
		this.o=o;
		this.la = la;
		this.lo = lo;
	}
	
	//calcule aire
	
	public double Aire() {
		return this.la*this.lo;
	}
	
	//translation de rectangle vres un point
	
	public void Translate(Point o) {
		this.o = o;
	}
	
	// get Rectangle Origine
	
	public String getRectOrig() {
		return (o.x +" "+o.y);
	}
	
	// teste si un point est a interieur de rectangle
	
	public boolean Contient(Point o) {
		if (	(sqrt(pow(this.o.x-o.x,2)) < this.la ) 
				&& (this.o.x-o.x > this.la) ) {
			return true;
		}else {
			return false;
			}
	}
	
	// teste si rect1 contient rect2
	
	/*public boolean ContientRect(Rectangle rc){
		if( Contient(rect.origine,rc) 
					&& (rect.largueur < rc.largueur) 
					&& (rect.longeur < rc.longeur) ) {
			return true;
		}else {
			return false;
		}
		
	}*/
	//
	/*public boolean Egaux(Rectangle rect1,Rectangle rect2) {
		if( Contient(rect2.origine,rect1) 
				&& rect2.largueur < rect1.largueur 
				&& rect2.longeur < rect1.longeur ) {
			return true;
		}else {
			return false;
		}
	}*/
}
