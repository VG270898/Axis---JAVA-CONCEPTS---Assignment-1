public class Triangle {

    //declaring variables
    float sideA;
    float sideB;
    float sideC;

    double area;

    double perimeter;

    //creating default constructor to initialize the values of side of Triangle
    Triangle(){
        sideA=3;
        sideB=4;
        sideC=5;
    }

    //creating method to calculate and display area of triangle of given sides
    void areaOfTriangle(){
        area = (sideA*sideB)/2;

        System.out.println("Area of Triangle having sides 3, 4 and 5 is : " + area);
    }

    //creating method to calculate and display perimeter of triangle of given sides
    void perimeterOfTriangle(){
        perimeter = sideA + sideB + sideC;
        System.out.println("Perimeter of Triangle having sides 3, 4 and 5 is : " + perimeter);
    }

    //creating main method to create object of class
    public static void main(String[] args){
        Triangle obj = new Triangle(); //creating object of class "Triangle"

        obj.areaOfTriangle();
        System.out.println();
        obj.perimeterOfTriangle();
    }
}
