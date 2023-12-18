package mehtods;

public class Methodinputparam {

    // ToDo SYNTAX : access_specifier return_type method_name (input parameter ) {code}

    public void massage(String name) {
        System.out.println(" Wecome to java Programming .. " + name);
    }

    public void eligibility(int age, String city) {
        if (age > 18 & city == "Agra") {
            System.out.println(" Eligible for voting in ");
        }else{
            System.out.println("num is odd ");

        }

    }

    public void makesquare(int number) {
        int square = number * number;
        System.out.println("Square of given Number " + square);

    }

    public void evenodd(int num) {
        if (num % 2 == 0) {
            System.out.println(" num is even ");
        } else {
            System.out.println(" num is odd ");

        }
    }





    public static void main(String [] args ){
         Methodinputparam obj= new Methodinputparam();
         obj.massage("Rohit kumar");
         obj.eligibility(21 , "AGRA");
         obj.makesquare(7 );
         obj.evenodd(7);


    }







}
