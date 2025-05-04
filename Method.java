class Men{
    String name;
    int age;
    String gender;
    String religion;

    String nam;
    int boyos;
    String lingo;
    String dhormo;

    public void display1(){
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Gender: " + gender);
        System.out.println("Religion: " + religion);
        System.out.println("\n");
    }

    //Parametrised  Method in class

     void setInformation(String n,int a, String g, String r) {
        nam= n;
        boyos = a;
        lingo = g;
        dhormo = r;
    }

    public void display2(){
        System.out.println("Name: " + nam);
        System.out.println("Age: " + boyos);
        System.out.println("Gender: " + lingo);
        System.out.println("Religion: " + dhormo);
        System.out.println("\n");
    }
}
public class Method {

    public static void main(String[]args){
        Men men1 = new Men();
        men1.name = "Fahim";
        men1.age = 25;
        men1.gender = "Male";
        men1.religion = "Islam";
        men1.display1();

        Men men2 = new Men();
        men2.name = "Tonni";
        men2.age = 23;
        men2.gender = "Female";
        men2.religion = "Islam";
        men2.display1();

        //  Parametrised method in class

        Men men3 = new Men();
        men3.setInformation("Fahim", 25, "Male", "Islam");
        men3.display2();


       Men men4 = new Men();
       men4.setInformation("Tonni", 23, "Male", "Islam");
       men4.display2();
    }
}
