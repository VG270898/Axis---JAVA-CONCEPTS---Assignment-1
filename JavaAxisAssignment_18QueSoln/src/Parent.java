public class Parent {
    void parentMethod(){
        System.out.println("This is parent class");
    }
}

//creating child class of Parent
class Child extends Parent{

    void childMethod(){
        System.out.println("This is child class");
    }

    //creating main method to create object of class "Parent" and "Child".
    public static void main(String[] args){
        Parent parent = new Parent();
        Child child = new Child();

        parent.parentMethod();  //calling method of parent class by object of parent class
        child.childMethod();    //calling method of child class by object of child class
        child.parentMethod();   //calling method of parent class by object of child class
    }
}
