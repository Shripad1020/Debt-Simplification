import java.util.logging.Level;
import java.util.logging.Logger;

public class CheckMysqlConnector {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String forName = "com.mysql.cj.jdbc.Driver";
        try {
            Class.forName(forName);
            System.out.println("Driver Loaded Successfully");
        } catch (ClassNotFoundException ex) {
            System.out.println("Driver Failed To Load Successfully");
            System.out.println(ex.getMessage());
        }
    }

}