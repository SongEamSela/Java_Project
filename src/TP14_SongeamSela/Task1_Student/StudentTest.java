package TP14_SongeamSela.Task1_Student;

public class StudentTest {
    public static void main(String[] args) {
        //1. Declare and initialize object of class Student
        Student st = new Student("e20160648","SongEam Sela",Sex.Female);
        //2. Declare and initialize object of class Student
        System.out.println("Student ID: "+st.getId());
        System.out.println("Student Name: "+ st.getName());
        System.out.println("Student Sex: "+st.getSex());
        //3. Change the sex of the student to an opposite one
        st.setSex(Sex.Male);
        System.out.println("\nResult after some changes.");
        System.out.println("Student ID: "+st.getId());
        System.out.println("Student Name: "+ st.getName());
        System.out.println("Student Sex: "+st.getSex());

    }
}
