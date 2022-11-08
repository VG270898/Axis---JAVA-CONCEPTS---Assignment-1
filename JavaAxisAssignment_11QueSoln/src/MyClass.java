public class MyClass {
    private int x = 10;
    static int m1() {
        int y = x;      //Non-static field 'x' cannot be referenced from a static context, can not be compiled
        return y;
    }
    public static void main(String[] args) {
        System.out.println(m1());
    }


}
