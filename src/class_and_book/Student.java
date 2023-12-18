package class_and_book;

public class Student {


    String name;
    int age;
    String dept;

    // parameterized constructor


    public Student(String name, int age, String dept) {
        this.name = name;
        this.age = age;
        this.dept = dept;
    }

    public static void main(String[] args) {
        // ToDo className objName= new className( prop1...value, prop2...value)

        Student Student1 = new Student("Rohit ", 22, "CS");

        System.out.println("Printing Name  " + Student1.name + " Age " + Student1.age + " dept " + Student1.dept);

        Student Student2 = new Student(" Ravi ", 22, "cs");

        System.out.println("Printing Name " + Student2.name + "  Age " + Student2.age + " dept " + Student2.dept);

        Student Student3 = new Student(" Ankit " , 21, " cs" );
        System.out.println("Printing Name " + Student3.name + "  Age " + Student3.age + " dept " + Student3.dept);

    }
}
