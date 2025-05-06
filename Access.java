
class People{
    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
class Men extends People{

    void show(){
        System.out.println("Name: "+getName());
        System.out.println("Age: "+getAge());
    }
}

public class Access{
    public static void main(String[] args){
        Men m1 = new Men();
        m1.setName("Fahim");
        m1.setAge(24);
        m1.show();
    }
}
