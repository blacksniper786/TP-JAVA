package tests;


import java.util.Scanner;

 

public class guess {

      public static void main(String[] args) {

            int secretNumber;

            secretNumber = (int) (Math.random() * (10-2) + 1);           

            Scanner keyboard = new Scanner(System.in);

            int guess;

            do {

                  System.out.print("Enter a guess (1-1000): ");

                  guess = keyboard.nextInt();

                  if (guess == secretNumber)

                        System.out.println("Your guess is correct. Congratulations!");

                  else if (guess < secretNumber)

                        System.out.println("Your guess is smaller than the secret number.");

                  else if (guess > secretNumber)

                        System.out.println("Your guess is greater than the secret number.");

            } while (guess != secretNumber);

      }

}
