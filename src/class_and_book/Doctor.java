package class_and_book;

public class Doctor {

    String name = " Ankit Sharma ";

    int age = 56;

    String dept = "class_and_book.Doctor";

    double income = 20000.43;


    //Parameterized  constructor


    public Doctor(String name, int age, String dept, double income) {
        this.name = name;
        this.age = age;
        this.dept = dept;
        this.income = income;
    }

    public static void main(String[] args) {

        // ToDo  className objName = new className ( prop[1..value, prop2.value ...)

        Doctor Doctor1 = new Doctor("Ankit Sharma ", 56, "doctor", 20000.45);
        System.out.println("Printing Name " + Doctor1.name + " Age " + Doctor1.age + "dept " + Doctor1.dept + "income" + Doctor1.income);
        Doctor Doctor2 = new Doctor(" Rohit kumar ", 22, " Student ",  24000.45);

        System.out.println("Printing name" + Doctor2.name + "Age " + Doctor2.age + "  Dept  " + Doctor2.dept + "income" + Doctor2.income);


    }


}
