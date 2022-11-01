package tp02;

public class Point {
	double x;
	double y;
	//first construecteur
	Point(){
		x=0;
		y=0;
	}
	Point(double x,double y){
		this.x=x;
		this.y=y;
	}
	//Methode DIst calcule distance entre le point courant 
	//et le point en parametre
	public double Dist(double x2 , double y2) {
		double distX = Math.pow(x2-x,2),distY=Math.pow(y2-y,2);
		return Math.sqrt(distX+distY);
	}
	/*
	public String toString() {
		return (x + " " + y);
	}
	*/
}
