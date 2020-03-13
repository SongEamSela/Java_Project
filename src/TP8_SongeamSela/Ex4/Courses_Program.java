package TP8_SongeamSela.Ex4;

import java.util.ArrayList;
import java.util.Scanner;

public class Courses_Program {
    public static void main(String[] args) {
        ArrayList<Courses> course = new ArrayList<>(5);
        course.add(new Courses("Software Engineering","Tongsreng"));
        course.add(new Courses("Network","Reatrey"));
        course.add(new Courses("Internet Programming","Movsun"));
        course.add(new Courses("Compilation","Theany"));
        course.add(new Courses("Telecommunication","Reatrey"));

        int choice ;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("\nCourses Program Menu\n" +
                    "1. List all courses\n" +
                    "2. Find courses by name\n" +
                    "3. Add new courses\n" +
                    "4. Quit\n");
            System.out.print("Enter your Choice: ");
            choice = sc.nextInt();
            sc.nextLine();

            switch (choice){
                case 1: {
                    System.out.println("\tList all Courses");
                    System.out.println("Course_Name \t\t\t Course_Teacher");
                    for (Courses courses : course){
                        System.out.println(courses.getCourse_name()+" \t\t\t "+courses.getCourse_teacher());
                    }
                }break;
                case 2:{
                    System.out.println("\n\tFind Courses ");
                    System.out.print("Enter a course name: ");
                    String Cname = sc.nextLine();
                    boolean found = false;
                    for (Courses courses : course){
                        if (courses.getCourse_name().equals(Cname)){
                            found = true;
                            System.out.println("Course_Name \t\t\t Course_Teacher");
                            System.out.println(courses.getCourse_name()+" \t\t\t "+courses.getCourse_teacher());
                        }
                    }
                    if (!found){
                        System.out.println("Course not found!!!");
                    }
                }break;
                case 3: {
                    System.out.println("\n\t Add new course");
                    Courses c = new Courses();
                    System.out.print("Name of the course : ");
                    c.setCourse_name(sc.nextLine());
                    System.out.print("Teacher of the course : ");
                    c.setCourse_teacher(sc.nextLine());

                    course.add(c);
                    System.out.println("Successfully added new course ");
                }break;
                default:
                    System.out.println("Pleases Enter valid number on the menu !!");
            }
        }while (choice !=4);


    }
}
