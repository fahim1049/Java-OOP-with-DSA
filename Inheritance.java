
class Person{
    String name;
    int age;
    String gender;
    String address;

    void show(){
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Gender: " + gender);
        System.out.println("Address: " + address);
    }
}

class Student extends Person{

//    void show1(){
//        System.out.println("Name: " + name);
//        System.out.println("Age: " + age);
//        System.out.println("Gender: " + gender);
//        System.out.println("Address: " + address);
//    }
}

class Teacher extends Person{
    void show2(){
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Gender: " + gender);
        System.out.println("Address: " + address);
    }
}
public class Inheritance {
    public static void main(String[]args){
        Student s1 = new Student();
        s1.name ="Fahim Nur";
        s1.age =30;
        s1.gender = "Male";
        s1.address = "123 Main Street";
        s1.show();
        Teacher t1 = new Teacher();
        t1.name ="Nur";
        t1.age =35;
        t1.gender = "Male";
        t1.address = "123  Street";
        t1.show2();

    }

}
