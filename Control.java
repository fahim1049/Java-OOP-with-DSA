import java.util.Scanner;

class Decision{
    int num1;
    int num2;

    void  condition(){

        if(num1>num2){
            System.out.println("Number 1 is greater than number 2");
        }
        if(num1<num2){
            System.out.println("Number 2 is less than number 1");
        }
        else {
            System.out.println("Try Again");
        }
    }
}


public class Control {
    public static void main(String[] args) {
        Scanner input  =  new Scanner(System.in);
        System.out.println("Enter the number 1: ");
        int num1 = input.nextInt();
        System.out.println("Enter the number 2: ");
        int num2 = input.nextInt();
        Decision d1 = new Decision();
        d1.num1 = num1;
        d1.num2= num2;
        d1.condition();

    }
}
