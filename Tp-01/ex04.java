import java.util.Scanner;
public class ex04 {
    public static void main(String[] args) {
        /* secret number */
        Scanner sc = new Scanner(System.in);
        int snum =(int)((10-2)*Math.random()+2);
        int score=100;
        int ntry;
        System.out.println("guess a num!");
        ntry = sc.nextInt();
        if(ntry == snum){
            System.out.println("BOOM! you find the secret number : "+ntry+" \n your score is : "+score);
            ntry = sc.nextInt();
            }
        do{
            /*ntry = sc.nextInt();*/
            if(ntry < snum){
                System.out.println("try a bigger number !");
                score-=5;
                ntry = sc.nextInt();
                }else if(ntry > snum){
                	System.out.println("try a smaller number !");
                }
        }while( ntry != snum);
/*         System.out.println(snum);*/

    }
}
