package tp03;

public class Vehicule {
	private boolean moteur;
	private int vitasseMax;
	public Vehicule(){
		moteur=false;
		vitasseMax = 0;
	}
	public Vehicule(boolean moteur,int vitasseMax){
		this.moteur=moteur;
		this.vitasseMax=vitasseMax;
	}
	
	//
	
	public String toString() {
		return "moteur : " + moteur + "\nvitasseMax : " + vitasseMax;
	}
	
	//methode affiche la vitesse max de vehicule
	
	public void VitasseMax() {
		System.out.println("vitasse maximale est : "+vitasseMax);
	}
	
	public boolean getMoteur() {
		return this.moteur;
	}
	
	public int getVitasseMax() {
		return this.vitasseMax;
	}
	
	public void setMoteur(boolean moteur) {
		this.moteur=moteur;
	}
	
	public void setVitasseMax(int vitasseMax) {
		this.vitasseMax=vitasseMax;
	}	
}

