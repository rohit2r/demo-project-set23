package celleection;

import java.util.ArrayList;

public class ArrayListGenerics {

    // Create a String ArrayList
    public  ArrayList<String> createStringList(){

        // SYNTAX : ArrayList<DataType> objName= new ArrayList<>();
        ArrayList <String> stringArrayList=new ArrayList<>();
        stringArrayList.add("Java ");
        stringArrayList.add("Spring ");
        stringArrayList.add("Spring boot ");
        stringArrayList.add("microservices");
        stringArrayList.add("Cloud");
        return stringArrayList;
    }

    public static void main(String [] args ){
        ArrayListGenerics obj = new ArrayListGenerics();
        ArrayList<String> stringArrayList =obj.createStringList();

        for( int i=0; i<stringArrayList.size(); i++){
            System.out.println(" Printing list in for loop " +stringArrayList.get(i));
        }
      // using Advance for loop

        for( String var : stringArrayList){
            System.out.println(" Printing in Advance for loop " + var);
        }

    }



}
