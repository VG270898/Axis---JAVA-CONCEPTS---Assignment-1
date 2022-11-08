public class Test {
    Test(Test t) {
        m1();                                       //2.    This will call M1 method first
        System.out.println("Constructor");          //6.    This will "Constructor" Third
    }
    void m1() {
        m2();                                       //3.    This will call M2 method First
        System.out.println("Instance method");      //5.    This will "Instance method" second
    }
    static void m2() {
        System.out.println("Static method");         //4.   This will print "Static method" First
    }
    public static void main(String[] args)
    {
        new Test(null);                            //1.This will call default constructor
    }

}
