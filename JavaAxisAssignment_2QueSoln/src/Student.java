public class Student {

    //declaring variables
    int rollNo;
    String phoneNo;
    String address;

    //creating method to get details
    void getDetails(int rollNo, String phoneNo, String address){
        this.address=address;
        this.phoneNo=phoneNo;
        this.rollNo=rollNo;
    }

    //creating method to display details
    void displayDetails(){
        System.out.println("Roll No. is : " + rollNo);
        System.out.println("Phone No. is : " + phoneNo);
        System.out.println("Address is : " + address);
    }

    //creating main method to create object of class
    public static void main(String[] args){

        Student obj1 = new Student();  //creating object 1 of class "Student"

        obj1.getDetails(101,"6756789876","Delhi");
        obj1.displayDetails();

        System.out.println();

        Student obj2 = new Student();  //creating object 2 of class "Student"

        obj2.getDetails(102,"9987698427","Kolkata");
        obj2.displayDetails();


    }
}
