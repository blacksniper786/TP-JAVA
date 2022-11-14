package tp03;

public class Voiture_Derivee extends Vehicule {
	
	private int nombreDePorts;
	
	Voiture_Derivee(){
		super();
		this.nombreDePorts=0;
	}
	
	Voiture_Derivee(boolean moteur ,int vitaseeMax,int nombreDePorts){
		super(moteur,vitaseeMax);
		this.nombreDePorts=nombreDePorts;
	}
		
	
	public String toString() {
		System.out.println(super.toString());
		return "nombre De Ports "+nombreDePorts;
	}

}
