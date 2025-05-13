import java.util.Scanner;

class Equation{

    int num1,num2;

    void display(){
        int sum = num1+num2;
        System.out.println(sum);
    }
}

public class UserInput {
    public static void main(String [] args){

        Scanner input = new Scanner(System.in);
        System.out.print("Enter the first number : ");
        int num1 = input.nextInt();
        System.out.print("Enter the second number : ");
        int num2 = input.nextInt();
        Equation equation = new Equation();
        equation.num1 = num1;
        equation.num2 = num2;
        System.out.print("The equation is : ");
        equation.display();
    }
}
