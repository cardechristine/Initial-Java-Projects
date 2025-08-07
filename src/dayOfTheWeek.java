import java.util.Scanner;

public class dayOfTheWeek {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //Enhanced Switch = replacement to many else if statements

        System.out.print("Enter the day of the week: ");
        String day = scanner.nextLine();

        switch (day) {
            case "Monday", "Tuesday", "Wednesday", "Thursday", "Friday" -> System.out.println("It is a weekday!");
            case "Saturday", "Sunday" -> System.out.println("It is the weekend!!");
            default -> System.out.println(day + " is not a day. Try again");
        }
    }
}