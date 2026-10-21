import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Main {
    	public static void main(String[] args) {
        	String url = "jdbc:oracle:thin:@localhost:1521:xe";
        	String user = "system";
        	String password = "password";

        	String sql = "DELETE FROM employees WHERE id = ?";

        	try (Connection conn = DriverManager.getConnection(url, user, password);
             	PreparedStatement pstmt = conn.prepareStatement(sql)) {

            		pstmt.setInt(1, 101);

            		int rowsAffected = pstmt.executeUpdate();
            		System.out.println(rowsAffected + " row(s) deleted successfully.");

        	} catch (SQLException e) {
            		e.printStackTrace();
        	}
    	}
}