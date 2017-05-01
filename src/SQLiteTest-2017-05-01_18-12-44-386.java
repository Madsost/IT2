import java.sql.*;

public class SQLiteTest {
	public static void main(String args[]) {
		Connection c = null;
		try {
			Class.forName("org.sqlite.JDBC");
			c = DriverManager.getConnection("jdbc:sqlite:test.db");
			Statement stmt = c.createStatement();
			stmt.executeUpdate("CREATE TABLE transtest (name VARCHAR(70), age INT)");
			c.setAutoCommit(false);
			
			
			stmt.executeUpdate("INSERT INTO transtest VALUE('Anders',82)");
			
			c.commit();
		} catch (Exception e) {
			System.err.println(e.getClass().getName() + ": " + e.getMessage());
			System.exit(0);
		}
		System.out.println("Opened database successfully");
		
		
	}
}