import java.util.ArrayList;

// ======================
// Interface
// ======================
interface Animal {

    void sound();
}

// ======================
// Parent Class
// ======================
class Person {

    String name;

    // Constructor
    Person(String name) {
        this.name = name;
    }

    void display() {
        System.out.println("Name: " + name);
    }
}

// ======================
// Child Class (Inheritance)
// ======================
class Student extends Person implements Animal {

    // Encapsulation
    private int age;

    // Constructor
    Student(String name, int age) {

        // calling parent constructor
        super(name);

        this.age = age;
    }

    // Getter
    int getAge() {
        return age;
    }

    // Setter
    void setAge(int age) {
        this.age = age;
    }

    // Method Overriding
    @Override
    void display() {

        System.out.println("Student Name: " + name);
        System.out.println("Student Age: " + age);
    }

    // Interface Method
    public void sound() {
        System.out.println("Student is speaking");
    }

    // Method Overloading
    int add(int a, int b) {
        return a + b;
    }

    int add(int a, int b, int c) {
        return a + b + c;
    }
}

// ======================
// Main Class
// ======================
public class Q1 {

    public static void main(String[] args) {

        // Object Creation
        Student s1 = new Student("Soumya", 21);

        // Calling Overridden Method
        s1.display();

        // Interface Method
        s1.sound();

        // Method Overloading
        System.out.println("Addition of 2 numbers: "
                + s1.add(10, 20));

        System.out.println("Addition of 3 numbers: "
                + s1.add(10, 20, 30));

        // Encapsulation
        s1.setAge(22);

        System.out.println("Updated Age: "
                + s1.getAge());

        // ArrayList
        ArrayList<String> subjects = new ArrayList<>();

        subjects.add("Java");
        subjects.add("Python");
        subjects.add("DBMS");

        System.out.println("Subjects:");

        for (String sub : subjects) {

            System.out.println(sub);
        }

        // Exception Handling
        try {

            int result = 10 / 0;

            System.out.println(result);

        } catch (Exception e) {

            System.out.println("Exception Handled");
        }

        System.out.println("Program Finished");
    }
}