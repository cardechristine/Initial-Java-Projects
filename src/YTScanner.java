
import java.util.Scanner;

public class YTScanner {
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);

        String name;
        int age;

        System.out.print("What is your name: ");
        name = scanner.nextLine();

        System.out.print("What is your age: ");
        age = scanner.nextInt();

        if(name.isEmpty()){
            System.out.println("You didn't enter your name!");
        }
        else{
            System.out.println("Hello " + name + "!");
        }

        if(age == 0){
            System.out.println("You are a baby.🔥");
        }
        if((age > 0) && (age < 13)){
            System.out.println("You are a child");
        }
        if((age > 12) && (age < 20)){
            System.out.println("You are a teenager");
        }
        if(age > 19){
            System.out.println("You are an adult");
        }








        scanner.close();
    }
}

