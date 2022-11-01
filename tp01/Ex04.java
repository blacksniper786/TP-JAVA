package tp01;
import java.util.Scanner;

public class Ex04 {
	 public static void main(String[] args) {
	        /* secret number */
	        Scanner sc = new Scanner(System.in);
	        int snum =(int)((10-2)*Math.random()+2);
	        int ntry;
	        /*System.out.println("guess a num!");
	        ntry = sc.nextInt();*/
	        do{
	        	System.out.println("guess a num!");
	            ntry = sc.nextInt();
	        	if(ntry == snum){
	                System.out.println("BOOM! you find the secret number : "+ntry);
	            }else if(ntry < snum){
	                	System.out.println("try a bigger number !");
	                	/*ntry = sc.nextInt();*/
	                    }else if(ntry > snum){
	                    	System.out.println("try a smaller number !");
	                    /*	ntry = sc.nextInt();*/
	           }
	        }while( ntry != snum);
	/*         System.out.println(snum);*/

	    }

}
