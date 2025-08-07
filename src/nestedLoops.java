import java.util.Scanner;

public class nestedLoops {
    public static void main(String [] args){

        //for loop a CERTAIN amount of times
        // while loop an UN- certain amount of times
        // break to STOP a loop
        //continue SKIPS a step of a loop
        //nested loop = used often with matrices or DS&A

        Scanner scanner = new Scanner(System.in);

        //nested loop to create a matrix

        int rows;
        int columns;
        char symbol;

        System.out.print("Enter the # of rows: ");
        rows = scanner.nextInt();

        System.out.print("Enter the # of columns: ");
        columns = scanner.nextInt();

        System.out.print("Enter a symbol: ");
        symbol = scanner.next().charAt(0);

        //nested for loops

        for(int i = 0; i < rows; i++){
            for(int j = 0; j < columns; j++) {
                System.out.print(symbol);
            }
            System.out.println();
        }





        scanner.close();

    }
}
