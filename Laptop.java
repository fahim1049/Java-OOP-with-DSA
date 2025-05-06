class Dcl {
    private String laptop_name;
    private int laptop_price;
    private String laptop_model;
    private String laptop_color;
    private double laptop_weight;

    public void setName(String laptop_name) {
        this.laptop_name = laptop_name;
    }

    public String getName() {
        return laptop_name;
    }

    public void setPrice(int laptop_price) {
        this.laptop_price = laptop_price;
    }

    public int getPrice() {
        return laptop_price;
    }

    public void setModel(String laptop_model) {
        this.laptop_model = laptop_model;
    }

    public String getModel() {
        return laptop_model;
    }

    public void setColor(String laptop_color) {
        this.laptop_color = laptop_color;
    }

    public String getColor() {

        return laptop_color;
    }

    public void setWeight(double laptop_weight) {
        this.laptop_weight = laptop_weight;
    }

    public double getWeight() {
        return laptop_weight;
    }
}

public class Laptop{
    public static void main(String[]args){
        Dcl d1 = new Dcl();
        d1.setName("DCL 102DC");
        d1.setPrice(56000);
        d1.setModel("DCL 102DC");
        d1.setColor("Black");
        d1.setWeight(2.5);
        System.out.println(d1.getName());
        System.out.println(d1.getPrice());
        System.out.println(d1.getModel());
        System.out.println(d1.getColor());
        System.out.println(d1.getWeight());
    }
        }

