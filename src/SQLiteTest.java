import java.sql.*;

public class SQLiteTest {
	public static void main(String args[]) {
		Connection c = null;
		try {
			Class.forName("org.sqlite.JDBC");
			c = DriverManager.getConnection("jdbc:sqlite:test.db");
			System.out.println("Opened database successfully");
			
			String url = (
					"INSERT INTO ET ELLER ANDET "+
					"AGE 10 INT "+
					"NOGET ANDET "+
					"SLUT");
			
		} catch (Exception e) {
			System.err.println(e.getClass().getName() + ": " + e.getMessage());
			System.exit(0);
		}
		System.out.println("Operation done sucessfully");
		
		
	}
}