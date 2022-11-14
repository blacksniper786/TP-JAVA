package tp03;

public class exercice01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("bnjr");
		System.out.println("test class vehicule:");
		Vehicule v1 = new Vehicule(true,210);
		System.out.println(v1);
		v1.VitasseMax();
		
		System.out.println("test class voiture composee:");
		Vehicule v2 = new Vehicule(false,15896);
		Voiture_Composee vc1 = new Voiture_Composee(false,1869,4);
		System.out.println(vc1);
		vc1.VitasseMax();
		
		System.out.println("test class voiture derivee:");
		Voiture_Derivee vd1 = new Voiture_Derivee(false,12345,48);
		System.out.println(vd1);
		vd1.VitasseMax();
		
	}

}
