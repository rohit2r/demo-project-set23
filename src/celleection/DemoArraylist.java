package celleection;

import java.util.ArrayList;

public class DemoArraylist {

    public void createList(){
        //  syntax : ArrayList objName= new ArrayList ():

        ArrayList arrayList= new ArrayList();
        arrayList.add("Java"); //  0 index    // it stores element in list
        arrayList.add( "Spring ");// 1 index
        arrayList.add(" Spring boot "); // 2 index
        arrayList.add(" 99"); //3 index
        arrayList.add(" 6565"); // 4 index

        System.out.println( arrayList.get(0)); // if you want read variable use (arrayList.get());
        System.out.println(arrayList.get(1));
        System.out.println(arrayList.get(2));
        System.out.println(arrayList.get(3));
        System.out.println(arrayList.get(4));



        // print all data method
          for(int i=0;  i<arrayList.size(); i++){

             System.out.println( "Printing arraylist "+arrayList.get(i));
          }
        // using advance for loop

        for (Object var : arrayList){

            System.out.println("Printing Advance for loop "+ var);
        }



        arrayList.remove(4); // if you want  any variable use this method

        System.out.println( arrayList.get(0)); // if you want read variable use (arrayList.get());
        System.out.println(arrayList.get(1));
        System.out.println(arrayList.get(2));
        System.out.println(arrayList.get(3));

        arrayList.remove(3);
        System.out.println( arrayList.get(0)); // java
        System.out.println(arrayList.get(1)); // spring
        System.out.println(arrayList.get(2)); // spring boot

       arrayList.remove(1) ;// if want remove 1 index in list
        System.out.println( "After remove  index 1"); // before remove index 1 = Spring
        System.out.println( arrayList.get(0)); //  (java )if you want read variable use (arrayList.get());
        System.out.println(arrayList.get(1));// after remove index 1 = Spring boot





    }

    public static void main(String []args){

        DemoArraylist obj = new DemoArraylist();
        obj.createList();
    }



}
