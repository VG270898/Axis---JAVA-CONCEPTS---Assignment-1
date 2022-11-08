public class MyClass {
    static int a = 20;
    static int b = 30;
    static int c = 40;
    MyClass()
    {
        a = 200;
    }
    static void m1() {
        b = 300;
    }
    static {
        c = 400;
    }
    public static void main(String[] args) {
        System.out.println(a);      //It will print 20
        System.out.println(b);      //It will print 30
        System.out.println(c);      //It will print 400
    }
}
