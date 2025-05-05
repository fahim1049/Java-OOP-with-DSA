
class ReturnValue{

    int square (int a){
        return a*a;
    }
}




public class Return {
    public static void main(String[] args) {

        ReturnValue r = new ReturnValue();
        int result  = r.square(4);
        System.out.println(result);


    }
}
