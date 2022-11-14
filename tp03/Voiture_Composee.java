package tp03;

public class Voiture_Composee {
	private Vehicule ve;
	private int nbrDePorts;
	
	Voiture_Composee(){
		this.ve = new Vehicule();
		nbrDePorts=0;
	}
	
	Voiture_Composee(boolean moteur,int vitasseMax,int nbrDePorts){
		this.ve = new Vehicule(moteur,vitasseMax);
		this.nbrDePorts=nbrDePorts;
	}
	public void VitasseMax() {
		System.out.println("vitasse maximale est : "+this.ve.getVitasseMax());
	}
	
	/*public void setNbrDePorts(int nbrDePorts) {
		this.nbrDePorts=nbrDePorts;
	}
	
	public int getNbrDePorts(int nbrDePorts) {
		return nbrDePorts;
	}	*/
	
	
	public String toString() {
		return  "moteur : " + ve.getMoteur() 
		+ "\nvitasseMax : " + ve.getVitasseMax()
		+"\nnombre de ports : " + nbrDePorts ;
	}
	
}
