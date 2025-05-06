
class Person{

    void display(){
        System.out.println("I am person");
    }
}

class Student extends Person{
    @Override
    void display(){
        System.out.println("I am student");
    }
}

class Teacher extends Student{
    @Override
    void display(){
        System.out.println("I am teacher");
    }
}

public class Polymorphism {
    public static void main(String[] args) {
        Person p = new Person();
        p.display();
        p = new Teacher();
        p.display();
        p = new Student();
        p.display();
    }

}
