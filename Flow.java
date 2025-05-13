import java.util.Scanner;

class ControlFlow{

    void flow(int phone_no){
        switch (phone_no){

            case 670:
                System.out.println("not my digit");
                break;
                case 671:
                    System.out.println(" not my digit");
                    break;
                    case 672:
                        System.out.println("not  digit");
                        break;
                        case 680:
                            System.out.println("It is my digit");
                            break;
            default:
                System.out.println("It is not my digit/error");

        }
    }
}
public class Flow {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter phone no : ");
        int phone_no = sc.nextInt();
        ControlFlow flow = new ControlFlow();
        flow.flow(phone_no);

    }

}
