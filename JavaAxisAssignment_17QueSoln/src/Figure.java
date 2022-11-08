class Figure {
    final int length = 5;
    final int bredth = 4;
    final void area() {
        int a = length * bredth;
        System.out.println("Area:"+a);
    }
}
class Rectangle extends Figure {
    final void rect()
    {
        System.out.println("This is rectangle");
    }
}
final class Final_Use extends Rectangle {
    public static void main(String[] args)
    {
        Final_Use obj = new Final_Use();
        obj.rect();     //this will access rect() method of class Rectangle and print "This is rectangle"
        obj.area();     //this will access area() method of class Figure and print "Area:20"
    }

}
