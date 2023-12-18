package mehtods;

public class cube {

    // making cube using method

    //access_specifier return_type method_name (parameter) {code}

  // write a code cube using by method
    public void cube1(){

        int num= 3;
        int cube= num*num*num;
        System.out.println("CUBE OF 3 IS : " +cube);

    }
    // write a code check out even and odd

    public void EvenOdd(){
        int number = 8;
        if(number%2==0){
            System.out.println("This is even number ");
        }else{
            System.out.println("This is odd number ");

        }
    }

 public static void main(String [] args){
        // cube obj=new cube
        cube obj= new cube();
        obj.cube1();
        obj.EvenOdd();
 }



}
