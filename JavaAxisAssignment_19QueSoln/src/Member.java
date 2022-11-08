public class Member {
    String memberName;
    int memberAge;
    String memberPhoneNo;
    String memberAddress;
    double memberSalary;

    void printSalary(){
        System.out.println("Member Salary is : " + memberSalary);
    }
}

class Employee extends Member{
    String emoloyeeSpecialization;

}

class Manager extends Member{
    String managerDepartment;

}

class Main{
    //creating main method to create object of class "Employee" and "Manager
    public static void main(String[] args){
        Employee emp = new Employee();
        Manager  man = new Manager();

        //assigning values to employee object
        emp.memberName = "Rahul Yadav";
        emp.memberAge = 23;
        emp.memberPhoneNo = "7658876926";
        emp.memberAddress = "Sector-62 Noida";
        emp.memberSalary = 42000;

        System.out.println("Employee Details : " );
        System.out.println("Employee Name : " + emp.memberName);
        System.out.println("Employee Age : " + emp.memberAge);
        System.out.println("Employee Salary : Rs" + emp.memberSalary);
        System.out.println("Employee PhoneNo. : " + emp.memberPhoneNo);
        System.out.println("Employee Address : " + emp.memberAddress);

        System.out.println();

        //assigning values to Manager object
        man.memberName = "Vishal Gupta";
        man.memberAge = 22;
        man.memberPhoneNo = "6398222157";
        man.memberAddress = "AOC Center Hyderabad";
        man.memberSalary = 60000;

        System.out.println("Manager Details : " );
        System.out.println("Manager Name : " + man.memberName);
        System.out.println("Manager Age : " + man.memberAge);
        System.out.println("Manager Salary : Rs" + man.memberSalary);
        System.out.println("Manager PhoneNo. : " + man.memberPhoneNo);
        System.out.println("Manager Address : " + man.memberAddress);


    }
}
