public class Triangle {

    //declaring variables
    float sideA;
    float sideB;
    float sideC;

    double area;
    double perimeter;

    //declaring and initializing parameterized constructor with parameter sideA, sideB, sideC
    Triangle(float sideA, float sideB, float sideC){
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
    }

    //creating method to calculate Area of Triangle
    void areaOfTriangle(){
        area = (sideA*sideB)/2;

        System.out.println("Area of Triangle having sides 3, 4 and 5 is : " + area);
    }

    //creating method to find Perimeter of Triangle
    void perimeterOfTriangle(){
        perimeter = sideA + sideB + sideC;
        System.out.println("Perimeter of Triangle having sides 3, 4 and 5 is : " + perimeter);
    }

    //creating main method to create object of class Triangle
    public static void main(String[] args){
        Triangle obj = new Triangle(3,4,5);     //passing arguments (3,4,5) to parameterized constructor

        obj.areaOfTriangle();
        System.out.println();
        obj.perimeterOfTriangle();
    }
}

