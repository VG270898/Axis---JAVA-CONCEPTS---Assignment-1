public class Area {
    //declaring variables
    float length;
    float breadth;

    //declaring parameterized constructor and initializing value of sides of rectangle
    Area(float length, float breadth){
        this.length=length;
        this.breadth=breadth;
    }

    //creating method to calculate the area of rectangle and return the value of area
    double returnArea(){
        return length*breadth;
    }

    //creating main method to create the object of class
    public static void main(String[] args){
        Area obj1 = new Area(20,15);    //creating object of class "Area" with arguments

        System.out.println("Area of Rectangle of side " + obj1.length + " and " + obj1.breadth + " is " + obj1.returnArea());
    }
}
