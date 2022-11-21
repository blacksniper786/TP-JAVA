package tp03;
import java.util.*;
public class exerc02 {

	public static void main(String[] args) {
		//test Figure methode getInstance()
		Figure fig1 = new Figure(1.1,2.2,255);
		Figure fig2 = new Figure(1.2,2.3,256);
		Figure fig3 = new Figure(1.3,2.4,257);
		Figure fig4 = new Figure(1.4,2.5,258);
		Figure fig5 = new Figure(1.5,2.6,259);
		System.out.println(Figure.getInstance());
		
		//test Carre methode getInstance() 
		
		Carre c1 = new Carre(fig1,15.2);
		Carre c2 = new Carre(fig2,15.3);
		Carre c3 = new Carre(fig3,15.4);
		Carre c4 = new Carre(fig4,15.5);
		Carre c5 = new Carre(fig5,15.6);
		System.out.println(Carre.getInstance());
		
		//test Rectangle methode getInstance()
		
		Rectangle r1 = new Rectangle(fig1,15.2,10.2);
		Rectangle r2 = new Rectangle(fig2,15.3,10.2);
		Rectangle r3 = new Rectangle(fig3,15.4,10.2);
		Rectangle r4 = new Rectangle(fig4,15.5,10.2);
		Rectangle r5 = new Rectangle(fig5,15.6,10.2);
		System.out.println(Rectangle.getInstance());
		
                  
		
	}

}
