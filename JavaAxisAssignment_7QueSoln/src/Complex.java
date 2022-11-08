public class Complex {

    //declaring variables
    int real1, real2;
    int complex1, complex2;
    int real,img;

    //creating method to add two complex numbers
    void sumComplex(int real1, int complex1, int real2, int complex2){
        real = real1+real2;
        img = complex1+complex2;

        System.out.println("Sum of " + real1 + " + " + complex1 + "i and "+ real2 + " + " + complex2 + "i is : " + real +" + "+img + "i");
    }

    //creating method to find difference of two complex numbers

    void differenceComplex(int real1, int complex1, int real2, int complex2){
        real = real1-real2;
        img = complex1-complex2;

        System.out.println("Difference of " + real1 + " + " + complex1 + "i and "+ real2 + " + " + complex2 + "i is : "+ real +" + "+img + "i" );
    }

    //creating method to find product of two complex numbers
    void productComplex(int real1, int complex1, int real2, int complex2){
        real = (real1*real2) - (complex1*complex2);
        img = (real1*complex2)+ (real2*complex1);

        System.out.println("Product of " + real1 + " + " + complex1 + "i and "+ real2 + " + " + complex2 + "i is : "+ real +" + "+img + "i");
    }

    //creating main method to create object of class
    public static void main(String[] args){

        Complex obj = new Complex();

        obj.sumComplex(3,2,1,4);
        obj.differenceComplex(3,2,1,4);
        obj.productComplex(3,2,1,4);
    }

}
