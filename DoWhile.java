class Loop {

    int a;

    void loop() {
        do {
            System.out.println(a + " Hello World");
            a++;
        } while (a <= 10);
    }

}
public class DoWhile {
    public static void main(String[] args) {
        Loop loop = new Loop();
        loop.loop();


    }

}