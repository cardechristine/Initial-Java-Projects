import java.util.Scanner;

public class ternary {
    public static void main(String [] args){
        Scanner scanner = new Scanner(System.in);

        //ternary operator
        /*int score;

        System.out.print("What score did you get? ");
        score = scanner.nextInt();

        String passOrFail = (score >= 60) ? "PASS" : "FAIL";
        System.out.println(passOrFail);
         */

        /*int number;

        System.out.println("Enter a number: ");
        number = scanner.nextInt();

        String evenOrOdd = (number %2 == 0) ? "EVEN" : "ODD";
        System.out.println(evenOrOdd);
        */

        /*int hours;

        System.out.println("What hour is it? ");
        hours = scanner.nextInt();

        String timeOfDay = (hours < 12) ? "AM" : "PM";
        System.out.println(timeOfDay);
         */

        double temp;
        double newTemp;
        String unit;

        System.out.print("Enter the temperature: ");
        temp = scanner.nextDouble();

        System.out.print("Convert to Celsius or Fahrenheit? (C or F)");
        unit = scanner.next().toUpperCase(); //only  need 'next' since expecting a single char for input

        //ternary (condition) ? true : false

        newTemp = (unit.equals("C")) ? (temp - 32) * 5/9 : (temp * 9/5) + 32;
        System.out.printf("%.2f degrees %s", newTemp, unit);


        scanner.close();
    }

}
