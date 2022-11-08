public class TestException3{
    public static void main(String[] args) {
        try{
            bar();             //this will not print anything because method contain nothing to print neither throw any exception
        }catch(NullPointerException e){
            e.printStackTrace();
        }catch(Exception e){
            e.printStackTrace();
        }
        foo();                //this will not print anything because method contain nothing to print neither throw any exception

    }

    public static void bar(){

    }

    public static void foo() throws NullPointerException{

    }

}
