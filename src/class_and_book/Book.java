package class_and_book;

public class Book {

    //  properties of data member

    String name=" Java";
    int pages= 500;
    String writerName=" Games gosling";

    public static void main(String[]args){

        //  Creating Object
        //ToDo  className objName= new className();


        Book obj1= new Book();//  object created
        Book obj2= new Book();
        Book obj3= new Book();


        //access object properties
        //ToDo objName.propertyName

        System.out.println("Printing BookName "+obj1.name);
        System.out.println("Printing  Book pages " +obj2.pages);
        System.out.println("Printing WriterName "+ obj3.writerName);














    }






}
