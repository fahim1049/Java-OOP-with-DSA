 interface Animal {

    public abstract void eat();
}
class Dog implements Animal {
    public void eat() {
        System.out.println("Dog eat");
    }
}
class Cat implements Animal {
    public void eat() {
        System.out.println("Cat eat");
    }
}

 public class Main{
    public static void main(String[] args) {
        Animal dog = new Dog();
        Animal cat = new Cat();
        dog.eat();
        cat.eat();
    }
 }