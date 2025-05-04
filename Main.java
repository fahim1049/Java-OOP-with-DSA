class Home {

    String name;
    int age;

    Home( String name,int age){

        this.name = name;
        this.age = age;

    }

    void show(){
        System.out.println("Name: " + name);
        System.out.println(" Home Age: " + age);
    }

}

public class Main {
    public static void main(String[] args) {

        Home home1  = new Home("Fahim House",24);
        home1.show();

        Home home2 = new Home("Tonni Mansion",56);
        home2.show();

    }
}
