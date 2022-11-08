public class One {

        protected void getData()
        {
            System.out.println("Inside GFG");
        }
}
class Two extends One {
    protected void getData()
    {
        System.out.println("Inside GeeksforGeeks");
    }
}

class Test
{
    public static void main(String[] args)
    {
        One obj = new Two();
        obj.getData();  //it will call getData method to print "Inside GeeksforGeeks"
    }
}


