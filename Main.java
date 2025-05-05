class People{
    String name;
    int age,height;

    People(){

        System.out.println("People Constructor");
    }

    People(String n, int a ){
        name = n;
        age = a;
    }

    People(String nam,int boyos,int heigh){
        name = nam;
        age = boyos;
        height = heigh;

    }

    void display(){
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Height: " +height);
    }
}





public class Main {
    public static void main(String[] args) {

        People people1 = new People("Fahim",24);
        people1.display();

        People people2 = new People("Rahim",21,7);
        people2.display();

        People people3 = new People();
        people3.display();
    }
}