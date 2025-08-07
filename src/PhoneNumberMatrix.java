public class PhoneNumberMatrix {
    public static void main(String[] args){

        //2D Array

        char[][] telephone = {{'1', '2','3'},    //matrix of characters
                              {'4', '5','6'},
                              {'7', '8', '9'},
                              {'*', '0', '#'}};

        for(char[] row : telephone){
            for(char number : row){
                System.out.print(number + " ");
            }
            System.out.println();
        }
    }
}
