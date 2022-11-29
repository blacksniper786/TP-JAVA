package Ex01;
import java.util.*;
public class Factorielle {
	int donne;
	Factorielle(){
	this.donne=0;
	}
	public void setDonne(int donne) {
		this.donne=donne;
	}
	
	public int calcFact(int donne) {
		if(donne == 0) {
			return 1;
		}else {
			return (donne)*calcFact(donne-1);
		}
			
	}

	public void afficheFact() {
		System.out.println("fact de "+this.donne+" is "+ calcFact(this.donne));
	}	
	
}
