package mehtods;

public class Methodoutput {

    public int makesquare(int number){
         int result=number*number;
         return result;
    }
    public String welcome (String name ) {

        String message = " Welcome to java " + name;
        return message;
    }






    public static void main(String []args ){

        Methodoutput obj=new Methodoutput();
        String message= obj.welcome("Rohit");
        System.out.println(message);
        int number=obj.makesquare(3 );
        System.out.println( " Square of given number " );
    }

}
