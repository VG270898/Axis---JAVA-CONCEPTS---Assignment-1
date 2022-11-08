public class A {
    void m1(A a){
        System.out.println("m1 method in class A");
    }
}
class B extends A {
    public void m1(A a){
        System.out.println("m1 method in class B");
    }
}
class Test{
    public static void main(String[] args){
        A a = new A();
        a.m1(a);            //this will print "m1 method in class A"
        a.m1(new B());      //this will print "m1 method in class A"

        B b = new B();
        b.m1(null);     //this will print "m1 method in class B"

        a = b;
        a.m1(null);     //this will print "m1 method in class B"
        a.m1(new A());     //this will print "m1 method in class B"
    }

}
