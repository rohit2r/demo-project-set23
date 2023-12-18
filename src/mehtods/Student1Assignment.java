package mehtods;

public class Student1Assignment {
    //  Data member
    String name = " Rohit kumar";
    int age = 22;
    String dept = " Student";


    // methods or function or capabilities

    // read, write, play,run, talk,....
     /* ToDo member function or method-- capabilities
    Syntax : assess_specifier return_type method_name (Parameter) {code}
    ..
    access_specifier -> public , private, protected , default   Theory Part
    return_type  -> output of function or method : no return  type
    method_name ->  can be anything : it should be meaningful
    parameter -> input parameter  :n optional */

    // Syntax  : access_specifier return_type method_name ( parameter ) {code}
    public void readMethod() {
        System.out.println(" this is readMethod of Student class ");
    }

    public void writeMethod() {
        System.out.println("this is writeMethod of Student class");
    }

    public void playMethod() {
        System.out.println("this is playMethod of Student class ");
    }

    public void talkMethod() {
        System.out.println("this is talkMethod of Student class ");
    }

    public static void main(String[] args) {
        // step 1 CREATE OBJECT  CLASSNAME OBJ_NAME= NEW CLASSNAME();

        Student1Assignment obj = new Student1Assignment();

        //Step 2 OBJ_NAME.METHOD_NAME():

        obj.readMethod(); //CALLING READ METHOD
        obj.writeMethod();// calling write method
        obj.playMethod(); // calling play method
        obj.talkMethod();//   ,,     talk ,,,

    }


}
