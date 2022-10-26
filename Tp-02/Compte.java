public class Compte{
	private int numero;
	private char typeCompte;
	double solde;
	private int codeSecret;
	Compte(){
		numero=999999;
		typeCompte = '\0';//pour dire rien on utilise \0
		solde=0.0;
		codeSecret=0;
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
	Compte(int num,char c,double s){
		numero = num;
		if( c=='D' || c=='E') {
			typeCompte=c;
		}
		AutoSecret();
		solde=s;
	}
	
	//setteurs numero & typeCompte
	public void setNumero(int num) {
		numero=num;
	}
	public void setTypeCompte(char type) {
		typeCompte=type;
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
		return "num : " + numero +" \nsolde : "+ solde +"\ntype : "+ typeCompte +"\ncodeS "+ codeSecret;
	}
}





