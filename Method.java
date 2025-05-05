class Overloading{

    void equation(int a, int b){
        System.out.println(a+b);
    }
    void equation(int a, int b, int c){
        System.out.println(a+b+c);
    }
    void equation(int a, int b, int c, int d){
        System.out.println(a+b+c+d);
    }
    void equation(){
        System.out.println("hello");
    }
}



public class Method {
    public static void main(String[] args){
        Overloading add = new Overloading();
        add.equation(1, 2, 3);
        add.equation(1, 2, 3, 4);
        add.equation();
    }
}
