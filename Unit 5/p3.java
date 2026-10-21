import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Main {
    	public static void main(String[] args) {
        	String url = "jdbc:oracle:thin:@localhost:1521:xe";
        	String user = "system";
        	String password = "password";

        	String sql = "UPDATE employees SET salary = ? WHERE id = ?";

        	try (Connection conn = DriverManager.getConnection(url, user, password);
             	PreparedStatement pstmt = conn.prepareStatement(sql)) {

            		pstmt.setDouble(1, 60000.0);
            		pstmt.setInt(2, 101);

            		int rowsAffected = pstmt.executeUpdate();
            		System.out.println(rowsAffected + " row(s) updated successfully.");

        	} catch (SQLException e) {
            		e.printStackTrace();
        	}
   	}
}