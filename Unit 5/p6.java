import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Main {
    	public static void main(String[] args) {
        	String url = "jdbc:oracle:thin:@localhost:1521:xe";
        	String user = "system";
        	String password = "password";

        	String sql = "SELECT id, name, salary FROM employees WHERE salary > ?";

        	try (Connection conn = DriverManager.getConnection(url, user, password);
             	PreparedStatement pstmt = conn.prepareStatement(sql)) {

            		pstmt.setDouble(1, 50000.0);

            		try (ResultSet rs = pstmt.executeQuery()) {
                		System.out.println("ID\tName\t\tSalary");
                		System.out.println("---------------------------------");

                		while (rs.next()) {
                    			int id = rs.getInt("id");
                    			String name = rs.getString("name");
                    			double salary = rs.getDouble("salary");

                    			System.out.println(id + "\t" + name + "\t" + salary);
                		}
            		}

        	} catch (SQLException e) {
            		e.printStackTrace();
        	}
    	}
}