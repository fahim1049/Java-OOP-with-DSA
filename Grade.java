import java.util.Scanner;

class Mark{

    float exam_score;

    void calculate_exam_score(){
        if(exam_score == 0){
            System.out.println("Not Set Yet");
        }
        else if(exam_score>=33 && exam_score<=50 ){
            System.out.println("C Grade Passed");
        }
        else if(exam_score>=50 && exam_score<=75 ){
            System.out.println("B Grade");
        }
        else if(exam_score>=75 && exam_score<90 ){
            System.out.println("A Grade");
        }
        else if(exam_score>=90 && exam_score<=100 ){
            System.out.println("A+ Grade");
        }
        else{
            System.out.println("Fail");
        }

    }
}
public class Grade {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the marks of exam : " );
        float exam_score = sc.nextFloat();
        Mark mark = new Mark();
        mark.exam_score = exam_score;
        mark.calculate_exam_score();
    }
}
