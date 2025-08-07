import java.util.Random;
import java.util.Scanner;

public class randomNumberguessinggame {
    public static void main(String [] args){
        Scanner scanner = new Scanner(System.in);

        //Number Guessing Game

        Random random = new Random();

        int guess;
        int attempts = 0;
        int min = 1;
        int max = 100;
        int randomNumber = random.nextInt(min,max + 1); //setting boundaries

        System.out.println("Number Guessing Game");
        System.out.printf("Guess a number between %d-%d\n", min, max);

        do{
            System.out.print("Enter a guess: ");
            guess = scanner.nextInt();
            attempts++; //increments attempts

            if(guess < randomNumber){
                System.out.println("Too low, try again!");
            }
            else if(guess > randomNumber){
                System.out.println("Too high, try again!");
            }
            else{
                System.out.println("CONGRATS you won!");
                System.out.println("# of attempts: " + attempts);
            }
            System.out.println();

        }while(guess != randomNumber);








        scanner.close();



    }
}
