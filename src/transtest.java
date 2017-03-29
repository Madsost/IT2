import java.sql.*;
public class transtest {
	public static void main(String[] args) {
		try{
			Class.forName("com.mysql.jdbc.Driver").newInstance();
			String url = "jdbc:mysql://server3.eduhost.dk/suit218";
			String username = "suit218";
			String password = "dtu165263F17";
			Connection conn = DriverManager.getConnection(url, username, password);
			
			Statement stmt = conn.createStatement();
			stmt.executeUpdate("CREATE TABLE transtest (name VARCHAR(70), age INT)");
			conn.setAutoCommit(false);
			
			
			stmt.executeUpdate("INSERT INTO transtest VALUE('Anders',82)");
			
			conn.commit();
			
			ResultSet rset2 = stmt.executeQuery("SELECT * FROM transtest ORDER BY age");
			
			while (rset2.next()) {
				System.out.println(rset2.getString(1) + " er " + rset2.getInt(2)+" år gammel.");
			}
			
			stmt.executeUpdate("DROP TABLE transtest");	// Tabellen slettes i alle fald. 
			//conn.commit(); 
		}catch(Exception e){
			e.printStackTrace();
		}
		System.exit(0);
	}
}
