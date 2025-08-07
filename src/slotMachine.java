import java.util.Random;
import java.util.Scanner;

public class slotMachine {
    public static void main(String[] args){
        Scanner scanner = new Scanner   (System.in);

        //JAVA SLOT MACHINE

        //DECLARE VARIABLES
        int balance = 100;
        int bet;
        int payout;
        String[] row; //contain emojis
        String playAgain;

        //DISPLAY WELCOME MESSAGE
        System.out.println("***************************");
        System.out.println("  WELCOME TO JAVA SLOTS  ");
        System.out.println("      🍒 🍋 ⭐️ 🍉 🌸");
        System.out.println("***************************");

        //PLAY IF BALANCE IS GREATER THAN ZERO
        while(balance > 0){
            try{
                Thread.sleep(1000);
            }
            catch(InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("\nCurrent Balance: $" + balance);
            System.out.print("Place your bet amount: $");
            bet = scanner.nextInt();
            scanner.nextLine();

            if(bet > balance){
                System.out.println("\nINSUFFICIENT FUNDS");
                continue;
            }
            else if(bet <= 0){
                System.out.println("\nBet must be greater than zero");
            }
            else{
                balance -= bet;
            }
            System.out.println("\nSpinning...");
            row = spinRow();
            printRow(row);
            payout = getPayout(row, bet);

            if(payout > 0){
                try{
                    Thread.sleep(1000);
                }
                catch(InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("\nYou won $" + payout);
                balance += payout;
            }
            else{
                try{
                    Thread.sleep(1000);
                }
                catch(InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("Sorry you lost this round");
            }
            try{
                Thread.sleep(1000);
            }
            catch(InterruptedException e) {
                e.printStackTrace();
            }
            System.out.print("\nDo you want to play again? (Y/N): ");
            playAgain = scanner.nextLine().toUpperCase();

            if(!playAgain.equals("Y")){
                break;
            }
        }
        System.out.println("GAME OVER! Your final balance is $" + balance);

        //EXIT MESSAGE
        scanner.close();
    }

    static String[] spinRow() {

        String[] symbols = {"🍒","🍋","⭐️","🍉","🌸"};
        String[] row = new String[3];
        Random random = new Random();



        for(int i = 0; i < 3; i++){
            row[i] = (symbols[random.nextInt(symbols.length)]);
        }

        return row;

    }
    static void printRow(String[] row){

        try{
            Thread.sleep(1000);
        }
        catch(InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("**************");
        System.out.println(" " + String.join(" | ", row));
        System.out.println("**************");
    }
    static int getPayout(String[] row, int bet){

        if((row[0].equals(row[1])) && (row[1].equals(row[2]))){
            return switch(row[0]){
                case "🍒" -> bet * 2;
                case "🍋" -> bet * 2;
                case "🍉" -> bet * 2;
                case "🌸" -> bet * 2;
                case "⭐️" -> bet * 3;
                default -> 0;
            };
        }
        else if(row[0].equals(row[1])){
            return switch(row[0]){
                case "🍒" -> bet * 2;
                case "🍋" -> bet * 2;
                case "🍉" -> bet * 2;
                case "🌸" -> bet * 2;
                case "⭐️" -> bet * 3;
                default -> 0;
            };
        }
        else if(row[1].equals(row[2])){
            return switch(row[1]){
                case "🍒" -> bet * 2;
                case "🍋" -> bet * 2;
                case "🍉" -> bet * 2;
                case "🌸" -> bet * 2;
                case "⭐️" -> bet * 3;
                default -> 0;
            };
        }
         else if(row[0].equals(row[2])){
            return switch(row[1]){
                case "🍒" -> bet * 2;
                case "🍋" -> bet * 2;
                case "🍉" -> bet * 2;
                case "🌸" -> bet * 2;
                case "⭐️" -> bet * 3;
                default -> 0;
            };
        }

        return 0;
    }
}
