
class University{ // class or blueprint for university
    String uni_name;
    String uni_location;
    String uni_motto;
    Double uni_student;
    int uni_faculty;

    void showInfo(){  //method for print all information
        System.out.println("University Name: "+uni_name);
        System.out.println("University Location: "+uni_location);
        System.out.println("University Motto: "+uni_motto);
        System.out.println("University Student: "+uni_student);
        System.out.println("University Faculty: "+uni_faculty);
    }

}
public class Blueprint { // create object for each university into main function
    public static void main(String[] args) {
        University uni1 = new University();
        University uni2 = new University();
        University uni3 = new University();

        uni1.uni_name = "Daffodil International University";
        uni1.uni_location = "Daffodil Smart City";
        uni1.uni_motto = "Leaders Makes Here";
        uni1.uni_student = 30.000;
        uni1.uni_faculty = 7;
        uni1.showInfo();

        System.out.println("--------------------------------------------");

        uni2.uni_name = "Brace University";
        uni2.uni_location = "Badda";
        uni2.uni_motto = "Provide Latter";
        uni2.uni_student  = 40.000;
        uni2.uni_faculty = 7;
        uni2.showInfo();

        System.out.println("--------------------------------------------");

        uni3.uni_name = "City University";
        uni3.uni_location = "Khagan";
        uni3.uni_motto = "Provide Latter";
        uni3.uni_student = 20.000;
        uni3.uni_faculty = 5;
        uni3.showInfo();

        System.out.println("All Rights Reserved @fahim1049");
    }

}
