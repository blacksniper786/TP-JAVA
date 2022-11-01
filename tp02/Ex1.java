package tp02;
import java.util.Scanner;
public class Ex1 {

	public static void main(String[] args) {
		Compte c1 = new Compte(15,'D',10.5);
		System.out.println(c1);
		Scanner sc = new Scanner(System.in);
		c1.Update_solde(100.0, 'R');
		

		}
}
