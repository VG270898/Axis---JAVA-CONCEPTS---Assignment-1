public class Myclass {
    static int a = 20;
    Myclass() {
        a++;
    }
    void m1()  {
        a++;
        System.out.println(a);
    }
    public static void main(String[] args)
    {
        Myclass obj = new Myclass();        //It will increment value of a by 1
        Myclass obj2 = new Myclass();       //It will increment value of a by 1
        Myclass obj3 = new Myclass();       //It will increment value of a by 1
        obj3.m1();                          //It will increment value of a by 1 and then print 24
    }

}
