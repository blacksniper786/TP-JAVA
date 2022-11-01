package tp02;

public class Compte {
	private int numero;
	private char typeCompte;
	double solde;
	private int codeSecret;
	public Compte(){
		this.numero = 999999;
		this.typeCompte = '\0';//pour dire rien on utilise \0
		this.solde = 0.0;
		this.codeSecret = 0;
	}
	//
	public void AutoSecret() {
		codeSecret = (int)((9999-101)*Math.random()+101);
	}
	//get the value of codeSecret
	/*public int getCodeSecret() {
		return codeSecret;
	}*/
	
//	construecteur surcharge
	//
	public Compte(int numero,char typeCompte,double solde){
		this.numero = numero;
		if( typeCompte=='D' || typeCompte=='E') {
			this.typeCompte=typeCompte;
		}
		AutoSecret();
		this.solde=solde;
	}
	
	//setteurs numero & typeCompte
	public void setNumero(int numero) {
		this.numero=numero;
	}
	public void setTypeCompte(char typeCompte) {
		this.typeCompte=typeCompte;
	}
	
	//getteurs numero & codeSecret
	public int getNumero() {
		return numero;
	}
	public int getCodeSecret() {
		return codeSecret;
	}
	
	//methode retrait --
	public void Retrait(int montant) {
		solde-=montant;
	}
	//Methode Depot ++
	public void Depot(int montant) {
		solde+=montant;
	}
	//redefinition de methode toString
	public String toString() {
		return "num : " + numero +" \nsolde : "+
	solde +"\ntype : "+ typeCompte +"\ncodeS "+ codeSecret;
	}

}
