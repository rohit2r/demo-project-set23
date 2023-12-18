package mehtods;

public class MethodDay2 {

    // create a method will make square of number
    // SYNTAX : access_specifier return_type method_name (parameter){code}

    public void makesquare() {
        int number = 3;
        int square = number * number;

        System.out.println(" Square of given number is  " + square);
    }

    // create a method to check eligibility of voting
    public void vote() {
        int age = 19;
        if (age > 18) {
            System.out.println("Eligible for voting  ");
        } else {
            System.out.println("if age is less than 18 not eligible for voting ");
        }
    }

    public static void main(String [] args ){

        //Step 1 create a classname object  obj_name= new classname();

          MethodDay2 obj= new MethodDay2();//Step 1
           obj.makesquare();//

           obj.vote();// step2


    }
}
