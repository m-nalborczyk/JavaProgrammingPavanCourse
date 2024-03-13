package day8;

public class Student {

    int studentId;
    String studentName;
    char grade;

    public Student() {

    }

    Student(int id, String name, char g){
        studentId=id;
        studentName=name;
        grade=g;
    }

    void show(){
        System.out.println(studentId + "  " + "  " + studentName + "  " + grade);
    }

    void setData(int id, String name, char g){
        studentId=id;
        studentName=name;
        grade=g;
    }

}
