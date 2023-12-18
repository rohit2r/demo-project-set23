package scanner;

import java.util.Scanner;

public class DemoScanner {

    public static void main(String[] args) {

      // create object of scanner class
        Scanner scanner=new Scanner(System.in);

      //Reading String Data
      System.out.println("Please enter you name : " );

      String name= scanner.nextLine();// reads string input

      System.out.println("Enter named is  :" +name);

      // Reading integer input
        System.out.println("Please enter your age : ");
        int age=scanner.nextInt();// Reads integer input
        System.out.println("Enter age is :  " +age);

        // reading double input
        System.out.println("Please enter your salary");
        double salary= scanner.nextDouble();
        System.out.println(" Salary is :"+salary);






    }
}