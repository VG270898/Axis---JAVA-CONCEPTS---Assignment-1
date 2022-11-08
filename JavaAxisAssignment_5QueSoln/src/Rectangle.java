public class Rectangle {
    //declaring variables
    float length;
    float breadth;
    double area;

    //declaring parameterized constructor and initializing variables
    Rectangle(float length,float breadth){
        this.length=length;
        this.breadth=breadth;
    }

    //creating method to calculate and return area of rectangle
    double Area(){
        area = length*breadth;

        return area;
    }

    //creating main method to create object of class
    public static void main(String[] args){

        Rectangle obj1 = new Rectangle(4,5);//creating object 1 of class "Rectangle"
        System.out.println("Area of Rectangle of side " + (int)obj1.length + " and " + (int)obj1.breadth + " is : " + obj1.Area() + " units Sqr");

        Rectangle obj2 = new Rectangle(5,8);//creating object 2 of class "Rectangle"
        System.out.println("Area of Rectangle of side " + (int)obj2.length + " and " + (int)obj2.breadth + " is : " + obj2.Area() + " units Sqr");


    }

}
