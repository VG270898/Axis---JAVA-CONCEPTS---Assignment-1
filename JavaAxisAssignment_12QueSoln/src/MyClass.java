public class MyClass {
    private int x = 10;
    static int m1()
    {
        MyClass obj = new MyClass();        //by creating object of class, non-static variable can be assigned
        int y = obj.x;
        return y;
    }
    public static void main(String[] args) {
        System.out.println(m1());       //It will print 10
    }
}
