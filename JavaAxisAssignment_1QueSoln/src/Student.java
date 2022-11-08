public class Student {

    //declaring variables
    String name;
    int roll_no;

    //creating main method to create obj of class Student
    public static void main(String[] args){
        Student obj = new Student(); //creating object of class Student

        //assigning values to class variables using object of class
        obj.name = "John";
        obj.roll_no = 2;

        //printing values
        System.out.println("Name is : "+ obj.name);
        System.out.println("Roll No is : " + obj.roll_no);
    }
}
