// // 1) Write a program in JAVA to show records of student table of MYSQL .
// // Assume table as : Student(Roll no, StudentName , DOB , courseName)
// import java.sql.*;

// public class Student{
//     public static void main(String[] args) {
//         Connection con = ConnectionUtil.connectDB();
//         if (con != null) {
//             try {
//                 String sql = "SELECT * FROM Student LIMIT 0,4";
//                 PreparedStatement pstmt = con.prepareStatement(sql);
//                 ResultSet rs = pstmt.executeQuery();

//                 while (rs.next()) {
//                     int rollNo = rs.getInt("RollNo");
//                     String studentName = rs.getString("StudentName");
//                     String dob = rs.getString("DOB");
//                     String courseName = rs.getString("CourseName");

//                     System.out.println("Roll No: " + rollNo +
//                         ", Name: " + studentName +
//                         ", DOB: " + dob +
//                         ", Course: " + courseName);
//                 }

//                 con.close();
//             } catch (SQLException e) {
//                 e.printStackTrace();
//             }
//         }
//     }
// }
class Student {
    public static void main(String[] args) {
        
    }
}
