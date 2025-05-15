import java.util.Scanner;

class MyArray{

    int[] number = new int[5];

    void sumArray(){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter 5 numbers : ");

        for(int i=0; i<5; i++){
            number[i] = sc.nextInt();
        }
    }

    void printArray(){
        double sum  = 0;

        for(int i=0; i<5; i++){

            sum  = sum + number[i];
        }

        System.out.println("Sum of Number: "+sum);
    }
}
public class Array2 {
    public static void main(String[] args) {
        MyArray myArray = new MyArray();
        myArray.sumArray();
        myArray.printArray();
    }
}
