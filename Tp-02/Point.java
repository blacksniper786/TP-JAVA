public class Point{
	double x;
	double y;
	//first construecteur
	Point(double X,double Y){
		x=X;
		y=Y;
	}
	//Methode DIst calcule distance entre le point courant 
	//et le point en parametre
	public double Dist(double x2 , double y2) {
		double distX = Math.pow(x2-x,2),distY=Math.pow(y2-y,2);
		return Math.sqrt(distX+distY);
	}
	

}