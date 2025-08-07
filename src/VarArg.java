public class VarArg {
    public static void main(String[] args) {


        //Variable Arguments = allows a method to accept a varying number of arguments.
        //Makes methods more flexible, no need for overloaded methods
        // java packs the arguments into an array
        //... (ellipsis)

       // System.out.println(average(1, 2, 3, 4,5,6,7));

    }
    /*static double average(double...numbers){    //method to find average
        double sum = 0;

        for(double number: numbers){
            sum += number;
        }
        return sum / numbers.length;
    }*/
}



    /*static int add(int ...numbers){     //method for adding unknow amount of numbers in an array
        int sum = 0;

        for(int number : numbers){
            sum += number;
        }
        return sum;
    }*/


