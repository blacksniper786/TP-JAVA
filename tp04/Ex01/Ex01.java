package Ex01;
import java.util.*;
public class Ex01 {
	public static void main(String args[]) {
		Factorielle f1 = new Factorielle();
	try{
		int val =Integer.parseInt(args[0]);
		if(val<0)
			throw new ErrNbrNgtf("ErrNbrNgtf.le fact de "+ val +" n'est pas definies");
		f1.calcFact(val);
		f1.setDonne(val);
		f1.afficheFact();
	}
	catch(ArrayIndexOutOfBoundsException e){
		System.out.println("Indiquer le nombre d'entiere sur la linge de commande");
		}
	catch(NumberFormatException e){
		System.out.println("l'argument doit etre Entiere");
		}
	catch(ErrNbrNgtf e) {
		System.out.println(e.getMessage());
	}
	}
	
}
	