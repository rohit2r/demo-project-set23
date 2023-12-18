package mehtods;

public class calculOutputMethod {

    public int add(int a, int b) {
        int result = a + b;
        return result;

    }

    public int sub(int a, int b) {
        int result = a - b;
        return result;
    }

    public int multi(int a, int b) {
        int result = a * b;
        return result;
    }

   public double divide(double a, double b){
     double result =a/b;
      return result;
}
    public static void main(String[] args) {

        calculOutputMethod obj = new calculOutputMethod();
        int result = obj.add(2, 6);
        System.out.println(" Add is value " + result);
        int resultsub = obj.sub(3, 1);
        System.out.println("sub is value" + resultsub);
        int resultmulti = obj.multi(8, 9);
        System.out.println("multi is value " + resultmulti);
        double resultdivide = (double) obj.divide(7, 4);
        System.out.println("Divide is value" + resultdivide);


    }
}