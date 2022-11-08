public class A {
    void sum(int x, int y) {
        System.out.println("Sum of two numbers: " + (x + y));
    }

    void sum(int y, int x) {
        System.out.println("Sum of three numbers: " + (x + y));
    }

    public static void main(String[] args) {
        A a = new A();
        a.sum(20, 30);
    }

}

//OutPut :- since sum method is already defined in Class A, cannot define another method with same name and parameters
//This will so error