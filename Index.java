// Pen class represents a Pen with attributes color and type
class Pen {
    String color;  // Attribute to store pen color
    String type;   // Attribute to store pen type (gel, ballpoint, etc.)

    // Method to print the color and type of the pen using 'this'
    public void printpencolor() {
        System.out.println("Pen Color: " + this.color);
        System.out.println("Pen Type: " + this.type);
    }

    // Method to print the color and type by passing parameters instead of using 'this'
    // public void printPenDetails(String color, String type) {
    //     System.out.println("Pen Color: " + color);
    //     System.out.println("Pen Type: " + type);
    // }
}

// Student class represents a Student with attributes name and age
class Student {
    String name; // Attribute to store student's name
    String age;  // Attribute to store student's age

    // Method to print student information with name and age using 'this'
    public void printInfo() {
        System.out.println("Name of the student is: " + this.name + ", Age: " + this.age);
    }

    // Method to print student information by passing parameters instead of using 'this'
    // public void printStudentDetails(String name, String age) {
    //     System.out.println("Name: " + name + ", Age: " + age);
    // }

    // Method to print student name and age separately using 'this'
    public void printInf() {
        System.out.println("Name: " + this.name);
        System.out.println("Age: " + this.age);
    }

    // Method to print student name and age separately by passing parameters
    // public void printStudentInfo(String name, String age) {
    //     System.out.println("Name: " + name);
    //     System.out.println("Age: " + age);
    // }
}

// Index class contains the main method (entry point of the program)
public class Index {

    public static void main(String[] args) {
        // Creating Pen objects
        Pen pen1 = new Pen();
        pen1.color = "blue";     // Setting color of pen1
        pen1.type = "gel";       // Setting type of pen1

        Pen pen2 = new Pen();
        pen2.color = "red";      // Setting color of pen2
        pen2.type = "ballpoint"; // Setting type of pen2

        // Calling method to print details of pen1 and pen2 using 'this'
        pen1.printpencolor();
        pen2.printpencolor();

        // Uncomment below to use the version without 'this'
        // pen1.printPenDetails(pen1.color, pen1.type);
        // pen2.printPenDetails(pen2.color, pen2.type);

        // Creating Student objects
        Student student1 = new Student();
        student1.name = "Abdullah";  // Setting name of student1
        student1.age = "18";         // Setting age of student1

        Student student2 = new Student();
        student2.name = "Wajih";     // Setting name of student2
        student2.age = "18";         // Setting age of student2

        // Calling methods to print details of student1 and student2 using 'this'
        student1.printInfo();   // Prints name and age together
        student2.printInf();    // Prints name and age separately

        // Uncomment below to use the version without 'this'
        // student1.printStudentDetails(student1.name, student1.age);
        // student2.printStudentDetails(student2.name, student2.age);
        // student1.printStudentInfo(student1.name, student1.age);
        // student2.printStudentInfo(student2.name, student2.age);
    }
}
