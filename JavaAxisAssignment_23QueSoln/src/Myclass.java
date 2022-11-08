public class Myclass {
    static int a = 20;
    Myclass() {
        a = 200;
    }
    public static void main(String[] args) {
        new Myclass();
        System.out.println(a);  //It will print 200
    }

}
