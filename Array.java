import java.util.Scanner;

class MyArray{

    double sum  = 0;

    int[] number = new int[5];

    void sumArray(){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter 5 numbers");

        for(int i=0; i<5; i++){
            number[i] = sc.nextInt();
        }
        for(int i=0; i<5; i++){

            sum  = sum + number[i];
        }

        System.out.println("Sum is: " + sum);
    }
}
public class Array {
    public static void main(String[] args) {
        MyArray myArray = new MyArray();
        myArray.sumArray();
    }
}
