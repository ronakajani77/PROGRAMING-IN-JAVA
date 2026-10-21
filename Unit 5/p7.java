import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Main {
    	public static void main(String[] args) {
        	String url = "jdbc:oracle:thin:@localhost:1521:xe";
        	String user = "system";
        	String password = "password";

        	String updateSql = "UPDATE employees SET salary = ? WHERE id = ?";
        	String deleteSql = "DELETE FROM employees WHERE id = ?";

        	try (Connection conn = DriverManager.getConnection(url, user, password)) {
            
            		try (PreparedStatement updateStmt = conn.prepareStatement(updateSql)) {
                		updateStmt.setDouble(1, 70000.0);
                		updateStmt.setInt(2, 102);
                		int updateRows = updateStmt.executeUpdate();
                		System.out.println(updateRows + " record(s) updated successfully.");
            		}

            		try (PreparedStatement deleteStmt = conn.prepareStatement(deleteSql)) {
                		deleteStmt.setInt(1, 101);
                		int deleteRows = deleteStmt.executeUpdate();
                		System.out.println(deleteRows + " record(s) deleted successfully.");
            		}

        	} catch (SQLException e) {
            		e.printStackTrace();
        	}
    	}
}