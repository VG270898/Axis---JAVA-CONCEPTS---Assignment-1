public class Student {

    //declaring variables
    String studentName;

    //creating default constructor without parameters
    Student(){
        studentName = "Unknown";
    }

    //creating parameterized constructor
    Student(String name){
        studentName=name;
    }

    //creating method to display name of student
    void displayName(){
        System.out.println("Student Name is : " + studentName);
    }

    //creating a main method to create object of class
    public static void main(String[] args){
        Student stu1 = new Student();      //creating object of class "Student" without arguments
        stu1.displayName();

        Student stu2 = new Student("Vishal Gupta");     //creating object of class "Student" with argument.
        stu2.displayName();
    }
}

