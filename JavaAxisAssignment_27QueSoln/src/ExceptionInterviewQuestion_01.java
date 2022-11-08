import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;

public class ExceptionInterviewQuestion_01 {
    public static void main(String[] args) {
        try {
            test();                     //this will print "Inside test() method"
        } catch (IOException e) {
            e.printStackTrace();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void test() throws IOException, SQLException, FileNotFoundException{

        System.out.println("Inside test() method");
    }

}
