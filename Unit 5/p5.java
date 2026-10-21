import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Main {
    	public static void main(String[] args) {
        	String url = "jdbc:oracle:thin:@localhost:1521:xe";
        	String user = "system";
        	String password = "password";

        	String sql = "INSERT INTO employees (id, name, salary) VALUES (?, ?, ?)";

        	try (Connection conn = DriverManager.getConnection(url, user, password);
             	PreparedStatement pstmt = conn.prepareStatement(sql)) {

            		pstmt.setInt(1, 102);
            		pstmt.setString(2, "Priya Patel");
            		pstmt.setDouble(3, 65000.0);

            		int rowsAffected = pstmt.executeUpdate();
            		System.out.println(rowsAffected + " record(s) inserted successfully.");

        	} catch (SQLException e) {
            		e.printStackTrace();
        	}
    	}
}