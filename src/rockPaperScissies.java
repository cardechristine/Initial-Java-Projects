import java.util.Random;
import java.util.Scanner;

public class rockPaperScissies {
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);
        //Rock Paper Scissors game

        //Declare variables
        Random random = new Random();

        String[] choices = {"rock", "paper", "scissors"};
        String playerChoice;
        String computerChoice;
        String playAgain = "yes"; //while play again is yes, continue the game
        do{
        //Get choice from the user\
        System.out.print("Enter your move: (rock, paper, scissors)");
        playerChoice = scanner.nextLine().toLowerCase();


            //determine validity of user choice
            if (!playerChoice.equals("rock") && !playerChoice.equals("paper") && !playerChoice.equals("scissors")) {
                System.out.println("Invalid Choice");
                continue;
            }

            //Get random choice for pc
            computerChoice = choices[random.nextInt(3)];
            System.out.println("Computer Choice: " + computerChoice);

            //Check who won
            if (playerChoice.equals(computerChoice)) { //cannot use ==
                System.out.println("Its a tie!");
            } else if (playerChoice.equals("rock") && computerChoice.equals("scissors")) {
                System.out.println("You win!");
            } else if (playerChoice.equals("paper") && computerChoice.equals("rock")) {
                System.out.println("You win!");
            } else if (playerChoice.equals("scissors") && computerChoice.equals("paper")) {
                System.out.println("You win!");              //CAN CONDENSE ALL 3 ELSE IF STATEMENTS INTO ONE USING || IN BETWEEN EACH
            } else {
                System.out.println("You Lose!");
            }
            //Ask to play again

            System.out.print("Play Again? (yes/no)");
            playAgain = scanner.nextLine().toLowerCase();
        }
        while(playAgain.equals("yes"));
        //Goodbye message
        System.out.println("Thanks for playing. BYE!");

        scanner.close();
    }
}
