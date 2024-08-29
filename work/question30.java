// Write a program in JAVA  to show records of employee table as of MYSQL . Assume table as : Employee(EmpID, EmpName , Salary and DOJ) 
import java.sql.*;

public class StudentRecords {
    public static void main(String[] args) {
        Connection con = ConnectionUtil.connectDB();
        if (con != null) {
            try {
                String sql = "SELECT * FROM Student LIMIT 0,4";
                PreparedStatement pstmt = con.prepareStatement(sql);
                ResultSet rs = pstmt.executeQuery();

                while (rs.next()) {
                    int rollNo = rs.getInt("RollNo");
                    String studentName = rs.getString("StudentName");
                    String dob = rs.getString("DOB");
                    String courseName = rs.getString("CourseName");

                    System.out.println("Roll No: " + rollNo +
                        ", Name: " + studentName +
                        ", DOB: " + dob +
                        ", Course: " + courseName);
                }

                con.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}
