

class Introduction{

    void introduce(){
        int [] number = new int[5];
        number[0] = 1;
        number[1] = 2;
        number[2] = 3;
        number[3] = 4;
        number[4] = 5;

        int sum = number[0] + number[1] + number[2] + number[3] + number[4];
        System.out.println("Sum of Array: "+sum);

        int len = number.length;
        System.out.println("length of Array :" +len);
    }
}

public class IntroArray {
    public static void main(String[] args) {
        Introduction introduction = new Introduction();
        introduction.introduce();
    }
}
