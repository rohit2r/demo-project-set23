package mehtods;

public class Calculator {

    //1 add 2 sub  3 divide 4 multi

    // access_specifier return_type method_name (parameter) {code}()

    public void  addition() {

        int a = 3;
        int b = 3;

        int result = a + b;
        System.out.println(" sum of a and b is  :" +result);
    }

    public void subtraction(){

        int a =5;
         int b=3;

         int result= a-b;
         System.out.println(" sub of a and b  is : "+ result);
    }
    public void divide(){

        int a=6;
        int b=4;
        int result= a*b;
        System.out.println("divide of  a and b is :" + result);
    }
    public void multi(){
        int a=8;
        int b=3;
        double result = (double)a/b;
      System.out.println("multi of a and b is  :" +result );
    }

    public static void main(String []args ){

        // classname obj= new classname();

        Calculator obj= new Calculator();
         obj.addition(); //Step 2 obj.method name
         obj.subtraction();
         obj.divide();
         obj.multi();


    }

}
