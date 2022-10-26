import java.util.Scanner;

public class Ex02 {
	public static void main (String arg[]) {
		Scanner sc = new Scanner(System.in);
		float[] tab = new float[5];/* creat a scanner object to get input */
		
		for(int i=0;i<tab.length;i++) {
			System.out.println("enter tab elem["+i+"] :");
			/*float elem */tab[i]= sc.nextFloat(); /* creat an element every time to hold data from user */
			/*tab[i]=elem;*/ /* give the data hold to the array element */
		}
		for(int x=0;x<(tab.length);x++) {
			System.out.println("tab [" + x + "] =" + tab[x]);
		}
		int i=0;
		float somme=0,min=tab[0],max=0;
		while(i < tab.length){
			if(tab[i] > max){
				max=tab[i];
			}else if(tab[i] < min) {
				min = tab[i];
			}
			somme+=tab[i];
			i++;
			/*System.out.println(somme +"-"+max +"-" +min);*/
		}
		float moy = somme /tab.length;
		System.out.println("Moyenne of table is : " + moy);	
		System.out.println("major of table is : " + max);	
		System.out.println("minim of table is : "+ min);	
	}

}
