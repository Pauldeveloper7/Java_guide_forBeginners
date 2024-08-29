import java.sql.*;

public class ConnectionUtil {
    public static Connection connectDB() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/student_db", "your_username", "your_password");
            return con;
        } catch (SQLException | ClassNotFoundException e) {
            System.out.println(e);
            return null;
        }
    }
}
