package TP8_SongeamSela.Ex5;

import java.util.ArrayList;
import java.util.Scanner;

public class Test_Product {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Product> products = new ArrayList<>();
        products.add(new Product("P001","Watch",22.30,30));
        products.add(new Product("P002","Ring",50.30,50));
        products.add(new Product("P003","Bag",15.50,40));

        int choice;
        do {
            System.out.println("\nProducts Management");
            System.out.println("1. List all Product in the shop\n" +
                    "2. Add new product\n" +
                    "3. Remove product from the list by index\n" +
                    "4. Update product in the list\n" +
                    "5. Exit program\n");
            System.out.print("Enter your choice : ");
            choice = sc.nextInt();
            sc.nextLine();

            switch (choice){
                case 1:{
                    System.out.println("\nAll products in the list");
                    for (int i=0; i<products.size();i++){
                        System.out.println((i+1)+". "+products.get(i).pro_ID+"   "+products.get(i).pro_name
                                +"   "+products.get(i).pro_price+"   "+products.get(i).pro_amount);
                    }
                }break;
                case 2:{
                    System.out.println("\n\tAdd New Product");

                    System.out.print("Enter Product ID : ");
                    String id = sc.nextLine();
                    System.out.print("Enter Product Name : ");
                    String name = sc.nextLine();
                    System.out.print("Enter Product Price : ");
                    double price = sc.nextDouble();
                    System.out.print("Enter amount of the product : ");
                    int amount = sc.nextInt();

                    Product product = new Product(id,name,price,amount);
                    products.add(product);
                }break;
                case 3:{
                    System.out.print("\nEnter the index of the product in the list that you wish to remove : ");
                    int index = Integer.parseInt(sc.nextLine());
                    System.out.print("Are you Sure you want to delete this product ? ");
                    boolean response = sc.nextLine().equalsIgnoreCase("yes");//equalsIgnoreCase = case insensitive
                    if (response){
                        products.remove(index-1);
                        System.out.println("Delete successfully");
                    }

                    else System.out.println("\t Not Successfully delete");
                }break;
                case 4:{
                    System.out.println("\n\tUpdate the product");
                    System.out.print("Enter the ID of the product in the list that you want to update : ");
                    String  id = sc.nextLine();
                    boolean found = false;
                    for (Product pro : products){
                        if (pro.getPro_ID().equals(id)){
                            found = true;
                            System.out.print("Enter Product ID : "); pro.setPro_ID(sc.nextLine());
                            System.out.print("Enter Product Name : "); pro.setPro_name(sc.nextLine());
                            System.out.print("Enter Product Price : "); pro.setPro_price(sc.nextDouble());
                            System.out.print("Enter amount of the product : "); pro.setPro_amount(sc.nextInt());
                        }
                    }
                    if (!found)
                        System.out.println("Product not found!!!");
                }break;
                default:
                    System.out.println("Please Enter valid number in the menu !!");
            }

        }while (choice!=5);

    }
}
