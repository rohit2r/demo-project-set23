package mehtods;

public class Dog {

    // data members

    String breeds;
    int height;
    int weight;

    // methods or function or capabilities

    // bark ,eat, Play,
    /* ToDo member function or method-- capabilities
    Syntax : assess_specifier return_type method_name (Parameter) {code}
    ..
    access_specifier -> public , private, protected , default   Theory Part
    return_type  -> output of function or method : no return  type
    method_name ->  can be anything : it should be meaningful
    parameter -> input parameter  :n optional */

// Syntax  : access_specifier return_type method_name ( parameter ) {code}

    public void barkMethod() {

        System.out.println(" This is bark of dog class ...");

    }

    public void eatMethod() {
        System.out.println(" This is eat method of Dog class ...");

    }

    public void playMethod() {

        System.out.println(" This is play method of Dog class ....");


    }



    public static void main(String [] args ){
        // step 1 CREATE OBJECT  CLASSNAME OBJ_NAME= NEW CLASSNAME();
        Dog obj= new Dog();

        //Step 2 OBJ_NAME.METHOD_NAME():
        obj.barkMethod();// CALLING BARK METHOD
        obj.eatMethod(); // CALLING EAT METHOD
        obj.playMethod();// CALLING PLAY METHOD


    }


}






