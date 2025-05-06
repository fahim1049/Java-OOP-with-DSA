
class Car{
    private String car_name;
    private int car_price;
    private String car_color;
    private String car_owner;

    public void setName(String car_name){
        this.car_name = car_name;
    }
    public String getName(){
        return car_name;
    }
    public void setPrice(int car_price){
        this.car_price = car_price;
    }
    public int getPrice(){
        return car_price;
    }
    public void setColor(String car_color){
        this.car_color = car_color;
    }
    public String getColor(){
        return car_color;
    }
    public void setOwner(String car_owner){
        this.car_owner = car_owner;
    }
    public String getOwner(){
        return car_owner;
    }
}
public class Encapsulation{
    public static void main(String[]args){
        Car c1 = new Car();
        c1.setName("BMW");
        c1.setPrice(100);
        c1.setColor("red");
        c1.setOwner("Fahim Nur");
        System.out.println(c1.getName());
        System.out.println(c1.getPrice());
        System.out.println(c1.getColor());
        System.out.println(c1.getOwner());
    }
}