package TP8_SongeamSela.Ex2;

import java.util.ArrayList;
import java.util.Scanner;

public class Student_program {
    public static void main(String[] args) {
        ArrayList<Student_DICE> student = new ArrayList<>();
        boolean ch= true;
        do {
            System.out.println("1. Add new student ");
            System.out.println("2. List students ");
            System.out.println("3. Remove student by name");
            System.out.println("4.Quit");
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter Your Choice : ");
            int choice = sc.nextInt();
            sc.nextLine();


            switch (choice){
                case 1: {
                    System.out.println("\n 1. Add New Student");

                    System.out.print("Input Student Name : ");
                    String name= sc.nextLine();
                    System.out.print("Input Student ID : ");
                    String id = sc.nextLine();
                    System.out.print("Input Student Gender : ");
                    String gender = sc.nextLine();
                    System.out.print("Input Student Age : ");
                    int age = sc.nextInt();
                    System.out.print("Input Group of student : ");
                    sc.nextLine();
                    String group = sc.nextLine();


                    Student_DICE st = new Student_DICE(name,age,id,gender,group);

                    student.add(st);

                }break;
                case 2: {
                    if (student.isEmpty()){
                        System.out.println("No student in the list, Pleases Input Student!!!");
                    }
                    else {
                        for (int i=0 ; i<student.size(); i++){
                            System.out.println((i+1)+". "+ student.get(i).getSt_name());
                            System.out.println("ID: "+ student.get(i).getSt_id());
                            System.out.println("Gender: "+student.get(i).getSt_gender());
                            System.out.println("Age: "+student.get(i).getSt_age());
                            System.out.println("Group: "+student.get(i).getSt_group());
                            System.out.println("****************************");
                        }
                    }
                }break;
                case 3:{
                    String name;
                    System.out.print("Input name for deleting: ");
                    name = sc.nextLine();
                    boolean found = false;
                    for(int i=0;i<student.size();i++){
                        if(student.get(i).getSt_name().equalsIgnoreCase(name)){
                            boolean response;
                            System.out.println("Are you sure remove "+student.get(i).getSt_name()+"?");
                            response = sc.nextLine().equalsIgnoreCase("yes");
                            if(response) student.remove(i);
                            found = true;
                            System.out.println("Successfully delete a student from the list");
                            break;
                        }
                    }
                    if(!found)
                        System.out.println("Student not found!");
                }break;
                default:
                    System.out.println("Please Enter valid number in the Menu ");
            }
            if (choice==4){
                ch= false;
            }
        }while (ch);
    }
}
