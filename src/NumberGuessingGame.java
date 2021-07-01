import java.util.Scanner;

public class NumberGuessingGame {


    public static void main(String[] args) {

        int secretNumber;
        secretNumber = (int) (Math.random() * 999 + 1);
        System.out.println("Your secret number is  " + secretNumber );

        Scanner sc = new Scanner(System.in);
        int guess;
        do{
            System.out.println("I need you to guess a number between 1-1000");
            guess = sc.nextInt();
            if(guess == secretNumber){
                System.out.println("Your number is correct! Congrats you bitch!");
            }else if(guess > secretNumber){
                System.out.println("Number is bigger than the secret number");
            }else if(guess < secretNumber){
                System.out.println("Number is smaller than secret number");
            }
        } while(guess != secretNumber);


    }
}
