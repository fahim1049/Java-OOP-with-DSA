import java.util.Scanner;

public class Array3 {
    public static void main(String[]args){

        double sum = 0;
        double[]  number = new double[5];
        Scanner input = new Scanner(System.in);
        System.out.println("Enter 5 numbers: ");

        for(int i=0; i<number.length; i++){

            number[i] = input.nextDouble();
        }

        for(int i=0; i<number.length; i++){
            sum  = sum + number[i];
        }
        System.out.println("The sum is: " + sum);
    }
}
