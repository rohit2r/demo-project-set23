package mehtods;

public class Calculinputparam {


    // ToDo Access_Specifier return_type Method_name (Parameter){code}

    public void add(int a, int b) {

        int result = a + b;
        System.out.println("Add of a+b :" + result);

    }

    public void sub(int a, int b) {

        int result = a - b;
        System.out.println("divide of a-b :" + result);

    }

    public void multi(int a, int b) {

        int result = a * b;
        System.out.println("multi of a*b :" + result);

    }

    public void Divide(int a, int b) {

        double result = (double) a / b;   // type casting
        System.out.println("Divide of a/b :" + result);

    }

    public static void main(String[] args) {
        Calculinputparam obj = new Calculinputparam();
        obj.add(3, 4);
        obj.sub(98, 74);
        obj.multi(7, 9);
        obj.Divide(76, 8);

    }


}
