public class Rectangle {

    //declaring variables
    int length, breadth;

    //declaring and initializing the Parameterized constructor
    Rectangle(int length,int breadth){
        this.length = length;
        this.breadth = breadth;
    }

    //Creating method to calculate and print Area of Rectangle
    void area(){
        System.out.println("Area with sides " + length + " and " + breadth + " is : " + length*breadth + " units sq" );

    }

    //Creating method to calculate and print Perimeter of Rectangle
    void perimeter(){
        System.out.println("Perimeter with sides " + length + " and " + breadth + " is : " + 2*(length+breadth) + " units");

    }
}

// creating child class of parent class "Rectangle"
class Square extends Rectangle{
    float side;
    Square(int side){
        super(side,side);
    }

    //creating main method to create object of class
    public static void main(String[] args){

        //creating object for class "Rectangle"
        Rectangle rectangle = new Rectangle(12,15);
        rectangle.area();
        rectangle.perimeter();

        System.out.println();

        //creating object for class "Square"
        Square square = new Square(15);
        square.area();
        square.perimeter();
    }

}
