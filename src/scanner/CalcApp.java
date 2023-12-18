package scanner;

import java.util.Scanner;

public class CalcApp {

    public int add(int a, int b) {

        return a + b;
    }

    public int sub(int a, int b) {
        return a - b;
    }

    public int multi(int a, int b) {

        return a * b;
    }

    public double divide(double a, double b) {
        return a / b;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        CalcApp obj = new CalcApp();
        String flag = "Y";

        while (flag=="Y"|| flag.equals("Y")) {
            System.out.println("Please enter value of a :");
            int a = scanner.nextInt();

            System.out.println("Please enter value of b :");
            int b = scanner.nextInt();
            System.out.println("Please enter choice :  1: addition , 2: subtraction,  3: for  multi,  4: for divide ");
            int choice = scanner.nextInt();


            if (choice == 1) {
                System.out.println("sum is " + obj.add(a, b));// if you want write short code use the
            }
            if (choice == 2) {
                int result = obj.sub(a, b);
                System.out.println("sub is :" + result);// this is long way of code write
            } else if (choice == 3) {
                int result = obj.multi(a, b);
                System.out.println(" Multi is : " + result);
            } else if (choice == 4) {
                double result = obj.divide(a, b);
                System.out.println("Divide is : " + result);
            }

            System.out.println("Please Y  to countinue or press any key tp exit from calculator ");
            Scanner scanner1= new Scanner(System.in);
            flag= scanner.nextLine();
        }

    }

}
