import java.util.Scanner;

public class SearchingArray {
    public static void main(String [] args){
        Scanner scanner = new Scanner(System.in);

        int[] numbers = {1 ,9,2,8,3,5,4};
        String[] fruits ={"apple", "orange", "banana"};
        String target;
        boolean isFound = false;

        System.out.println("Enter a fruit: ");
        target = scanner.nextLine();

        for(int i = 0; i < fruits.length; i++){
            if(fruits[i].equals(target)){
                System.out.println("Element found at index " + i);
                isFound = true;
                break;
            }
        }
        if(!isFound){
            System.out.println("Element not found");
        }
        scanner.close();

    }
}
