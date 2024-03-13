package day8;

public class StudentMain {

    public static void main(String[] args) {


        //Assigning data to object
        //------------------------

        //approach 1: using reference variable
        Student student1=new Student();
        student1.studentId=143;
        student1.studentName="Tom Figgs";
        student1.grade='B';
        student1.show();

        //approach 2: using method
        Student student2=new Student();
        student2.setData(144, "Amy Donlle",'A');
        student2.show();

        //approach 3: using constructor PREFERABLE APPROACH
        Student student3 = new Student(145, "Robert Fergson", 'C');
        student3.show();




    }
}
