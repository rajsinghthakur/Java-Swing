import java.sql.*;

public class D_DatabaseConnection {
    private static String url = "jdbc:mysql://localhost:3306/rsb";
    private static String username = "root";
    private static String password = "Raj@882714";
    public Connection con = null;
    public Statement s = null;

    public D_DatabaseConnection() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection(url, username, password);
            s = con.createStatement();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
