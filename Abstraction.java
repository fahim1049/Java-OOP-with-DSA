abstract class Book{
    abstract void read();
}

class Fahim extends Book{
    void read(){
        System.out.println("Fahim Read Book 14 Days Every Month");
    }
}

class Jarid extends Book{
    void read(){
        System.out.println("Jarid Read Book 1 Days Every Month");
    }
}

public class Abstraction {
    public static void main(String[] args) {
        Fahim fahim = new Fahim();
        Jarid jarid = new Jarid();
        fahim.read();
        jarid.read();

        //another method
        
        Book b;
        b = new Fahim();
        b.read();

        b = new Jarid();
        b.read();

    }
}
