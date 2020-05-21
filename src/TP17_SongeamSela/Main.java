package TP17_SongeamSela;
import java.sql.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        Scanner sc = new Scanner(System.in);
        Class.forName("com.mysql.cj.jdbc.Driver");

        Connection con =  DriverManager.getConnection("jdbc:mysql://localhost:8889/JavaDB?" +
                "user=root&password=root");

        Statement stmt = con.createStatement();
        stmt.executeUpdate("CREATE TABLE IF NOT EXISTS student (ID INT PRIMARY KEY AUTO_INCREMENT ,Name varchar(100))");

        int choice;

        do {
            System.out.println("Menu\n" +
                    "1. Add Student\n" +
                    "2. Remove Student\n" +
                    "3. Show all student\n" +
                    "4. Update student\n" +
                    "5. Student attendances\n" +
                    "6. close");
            System.out.println("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice){
                case 1:{
                    System.out.print("Add student\n");
                    System.out.print("Enter student name: ");
                    sc.nextLine();
                    String name = sc.nextLine();

                    String SQL = "INSERT INTO student(Name) VALUES (?)";
                    PreparedStatement p = con.prepareStatement(SQL);
                    p.setString(1, name);

                    p.executeUpdate();

                }break;
                case 2: {
                    System.out.print("Remove student\n");
                    System.out.print("Enter student id that you want to remove: ");
                    int id = sc.nextInt();
                    sc.nextLine();
                    try {
                        PreparedStatement st = con.prepareStatement("DELETE FROM student WHERE ID ="+id );
                        st.executeUpdate();
                        System.out.println("Delete successfully ");
                    } catch(Exception e) {
                        System.out.println(e);
                    }


                }break;
                case 3: {
                    System.out.print("Show all Students\n");
                    try {
                        Statement st = con.createStatement();
                        ResultSet rs = st.executeQuery("SELECT * FROM student");
                        while (rs.next()) {

                            int id = rs.getInt("ID");
                            String name = rs.getString("Name");
                            System.out.println(id+"    "+name + "\n");
                        }
                    } catch(Exception e) {
                        System.out.println(e);
                    }


                }break;
                case 4: {
                    System.out.print("Update Student\n");
                    System.out.print("Enter student is that you want to update");
                    int id = sc.nextInt();
                    sc.nextLine();
                    boolean found = false;
                    try {

                        Statement st = con.createStatement();
                        ResultSet rs = st.executeQuery("SELECT * FROM student");
                        while (rs.next()) {

                            int ID = rs.getInt("ID");
                            if(ID == id){
                                found = true;
                                System.out.print("Enter new student name: ");
                                String new_name = sc.nextLine();

                                try {
                                    PreparedStatement sta = con.prepareStatement("UPDATE student SET Name = ? where ID = ?");
                                    sta.setString(1,new_name);
                                    sta.setInt(2,id);
                                    sta.executeUpdate();
                                    System.out.println("Update successfully ");
                                } catch(Exception e) {
                                    System.out.println(e);
                                }
                            }
                        }
                    } catch(Exception e) {
                        System.out.println(e);
                    }

                    if (found){
                        System.out.print("Invalid ID student");
                    }


                }break;
                case 5:{
                    int op;
                    System.out.print("1. Mark attendant\n" +
                            "2. List attendance\n" +
                            "3. exit\n");
                    System.out.print("Please choose an option: ");
                    op = sc.nextInt();
                    switch (op){
                        case 1: {
                            System.out.print("Please input date in format (dd/mm/yy): ");
                            String date = sc.nextLine();
                            sc.nextLine();

                            String SQL = "CREATE TABLE IF NOT EXISTS attendance (ID INT ,date varchar(10),attendance varchar(10), FOREIGN KEY (ID) REFERENCES student)";
                            PreparedStatement p = con.prepareStatement(SQL);
                            p.executeUpdate();
                            System.out.print("Please complete attendance ");
                            try {
                                Statement st = con.createStatement();
                                ResultSet rs = st.executeQuery("SELECT * FROM student");
                                while (rs.next()) {

                                    int id = rs.getInt("ID");
                                    String name = rs.getString("Name");
                                    System.out.println(id+"    "+name + ": "+"\n");
                                    String atten = sc.nextLine();
                                    sc.nextLine();

                                    SQL = "INSERT INTO attendance VALUES (?, ?, ?)";
                                    p = con.prepareStatement(SQL);
                                    p.setInt(1,id);
                                    p.setString(2,date);
                                    p.setString(3, atten);
                                    p.executeUpdate();
                                }

                            }catch (Exception e){
                                System.out.print(e);
                            }



//                            stmt = con.createStatement();
//                            ResultSet r = stmt.executeQuery("SELECT date ");
//                            while (r.next()){
//                                String tname = r.getString(1);
//                                if (tname.equals(date)){
//                                    System.out.print("attendance already took that day.");
//                                }
//                                else {
//                                    String SQL = "CREATE TABLE IF NOT EXISTS attendance (ID INT FOREIGN KEY REFERENCES student(ID) ,date varchar(10),attendance varchar(10))";
//                                    PreparedStatement p = con.prepareStatement(SQL);
//                                    p.executeUpdate();
//                                    System.out.print("Please complete attendance ");
//                                    try {
//                                        Statement st = con.createStatement();
//                                        ResultSet rs = st.executeQuery("SELECT * FROM student");
//                                        while (rs.next()) {
//
//                                            int id = rs.getInt("ID");
//                                            String name = rs.getString("Name");
//                                            System.out.println(id+"    "+name + ": "+"\n");
//                                            String atten = sc.nextLine();
//                                            sc.nextLine();
//
//                                            SQL = "INSERT INTO attendance VALUES (?, ?, ?)";
//                                            p = con.prepareStatement(SQL);
//                                            p.setInt(1,id);
//                                            p.setString(2,date);
//                                            p.setString(3, atten);
//                                            p.executeUpdate();
//                                        }
//
//                                    }catch (Exception e){
//                                        System.out.print(e);
//                                    }
//
//                                }
//                            }
                        }break;
                        case 2:{
                            System.out.print("List attendance\n");
                            System.out.print("Choose a date in format (dd/mm/yy): ");
                            String date = sc.nextLine();
                            sc.nextLine();

//                            stmt = con.createStatement();
//                            ResultSet r = stmt.executeQuery("Show tables");
//                            while (r.next()) {
//                                String tname = r.getString(1);
//                                if (tname.equals(date)) {

                            try {
                                String SQL = "SELECT ID,Name,attendance FROM attendance INNER JOIN student where date = ?";
                                PreparedStatement p = con.prepareStatement(SQL);
                                p.setString(1,date);
                                ResultSet rs = p.executeQuery();
                                while (rs.next()) {

                                    int id = rs.getInt("ID");
                                    String name = rs.getString("Name");
                                    String att = rs.getString("attendance");
                                    System.out.println(id+"    "+name + "    "+att+"\n");
                                }
                            } catch(Exception e) {
                                System.out.println(e);
                            }

                        }break;
                        case 3: break;
                    }

                }break;

            }

        }while (choice>0 && choice<6);


        con.close();
    }

}
