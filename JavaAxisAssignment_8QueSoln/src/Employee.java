public class Employee {

    //declaring variables
    String employeeName;
    String yearOfJoining;
    String employeeSalary;
    String employeeAddress;

    //creating method to get employee details

    void getEmployeeDetails(String employeeName,String yearOfJoining,String employeeSalary,String employeeAddress){
        this.employeeName = employeeName;
        this.yearOfJoining = yearOfJoining;
        this.employeeSalary = employeeSalary;
        this.employeeAddress = employeeAddress;
    }

    //creating method to display employee details
    void displayEmployeeDetails(){
        System.out.println(employeeName+"\t\t\t"+yearOfJoining+"\t\t\t"+employeeSalary+"\t\t"+employeeAddress);
    }

    //creating main method to create object of class
    public static void main(String[] args){

        Employee emp1 = new Employee(); //creating object for employee 1
        Employee emp2 = new Employee(); //creating object for employee 2
        Employee emp3 = new Employee(); //creating object for employee 3

        System.out.println("Name\t\tYear of joining\t\tSalary\t\t\tAddress\n");

        emp1.getEmployeeDetails("Robert","1994","60000","64C- WallsStreat");
        emp1.displayEmployeeDetails();

        emp2.getEmployeeDetails("Sam  ","2000","75000","68D- WallsStreat");
        emp2.displayEmployeeDetails();

        emp3.getEmployeeDetails("John","1999","55000","26B- WallsStreat");
        emp3.displayEmployeeDetails();
    }
}
