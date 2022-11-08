public class MyClass {
    static int a = 20;
    MyClass() {
        a = 200;
    }

    public static void main(String[] args){
        new MyClass();
        System.out.println(a);      //It will Print 200
    }

}
