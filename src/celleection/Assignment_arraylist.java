package celleection;

import java.util.ArrayList;

public class Assignment_arraylist {

    public void createList() {

        ArrayList arrayList = new ArrayList();
        arrayList.add("Rohit kumar ");//index 0
        arrayList.add("Ravi kushwah ");// index 1
        arrayList.add(33);// INDEX 2
        arrayList.add(22);// index 3
        arrayList.add(444.66);// index 4


        for(int i=0;  i<arrayList.size(); i++){

            System.out.println( "Printing arraylist "+arrayList.get(i));
        }

        // we are using advance for loop

       for (Object var : arrayList){
           System.out.println(" Printing advance for loop " +var);
       }

       System.out.println(arrayList.get(0));
       System.out.println(arrayList.get(1));
       System.out.println(arrayList.get(2));
       System.out.println(arrayList.get(3));
       System.out.println(arrayList.get(4));

        // if you want to remove any element in this arraylist using ( arraylist.remove(value ))

        arrayList.remove(4);
        System.out.println("After remove element");
        System.out.println(arrayList.get(0));
        System.out.println(arrayList.get(1));
        System.out.println(arrayList.get(2));
        System.out.println(arrayList.get(3));

        arrayList.remove(1);
        System.out.println( "After remove element 3 ");
        System.out.println(arrayList.get(0));
        System.out.println(arrayList.get(2));
        System.out.println(arrayList.get(3));

    }

    public static void main(String[] args) {
      Assignment_arraylist obj= new Assignment_arraylist();
      obj.createList();
    }




}
