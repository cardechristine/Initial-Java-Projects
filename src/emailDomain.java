import java.util.Scanner;

public class emailDomain {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        String email;
        String username;
        String domain;

        System.out.print("Enter your email: ");
        email = scanner.nextLine();


        if(email.contains("@")) {
            username = email.substring(0, email.indexOf("@"));
            domain = email.substring(email.indexOf("@"));
            System.out.println(username);
            System.out.println(domain);
        }
        else{
            System.out.println("Enter a valid email: ");
            email = scanner.nextLine();
        }

        scanner.close();
    }
}