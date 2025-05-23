
class  Loops {

    void nam(){
        String [] names = {"Fahim", "Mary", "James", "Bob"};
        for(String name : names){
            System.out.println(name);
        }
    }
}



public class ForEach2 {
    public static void main(String[] args) {
        Loops loop = new Loops();
        loop.nam();
    }
}
