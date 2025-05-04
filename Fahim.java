class Men{
    String name;
    int age;
    String gender;
    String religion;

    public void display(){
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Gender: " + gender);
        System.out.println("Religion: " + religion);
    }
}
public class Fahim {

    public static void main(String[]args){
        Men men1 = new Men();
        men1.name = "Fahim";
        men1.age = 25;
        men1.gender = "Male";
        men1.religion = "Islam";
        men1.display();
    }
}
