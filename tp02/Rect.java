package tp02;

public class Rect {
	Point o;
	double la;
	double lo;
	
	Rect(){
		o = new Point();
		this.la = 0.0;
		this.lo = 0.0;
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
	
	public boolean Cont(Point o) {
		if (    this.o.x < o.x
			  && o.x < this.o.x+this.la 
			  && o.y > this.o.y 
			  && o.y < this.o.y+this.lo )
			{
			return true;
		}else {
			return false;
			}
	}
	
	// teste si rect1 contient rect2
	
	public boolean ContientRect(Rect rc){
		Point o2 = new Point((rc.o.x+rc.la),(rc.o.y+rc.lo));
		System.out.println("rect test infgauche "+ rc.o.x+" "+rc.o.y);
		System.out.println("rect teste supdroite " + (rc.o.x+rc.la)+ " " +(rc.lo+rc.o.y));
		System.out.println("rect reference originr" + o.x+" "+o.y);
		
		if( Cont(rc.o) && Cont(o2)) 
				{
			return true;
		}else {
			return false;
		}
		
	}
	//teste deux rect sont egaux
	public boolean Egaux(Rect rc){
		if( rc.o == this.o && rc.la == this.la && this.lo == rc.lo) {
			return true;
		}else {
			return false;
		}
	}
}
