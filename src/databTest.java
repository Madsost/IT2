import java.sql.*;

public class databTest {
	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.jdbc.Driver").newInstance();
			String url = "jdbc:mysql://server3.eduhost.dk/suit218";
			String username = "suit218";
			String password = "dtu165263F17";
			Connection conn = DriverManager.getConnection(url, username, password);

			Statement stmt = conn.createStatement();
			stmt.executeUpdate("CREATE TABLE ntest (name VARCHAR(70), age INT)");
			PreparedStatement stmt2 = conn.prepareStatement("INSERT INTO ntest VALUES(?,?)");
			stmt2.setString(1, "Jan Henriksen");
			stmt2.setInt(2, 20);
			stmt2.executeUpdate();
			stmt2.setString(1,"Lars Koch");
			stmt2.setInt(2, 84);
			stmt2.executeUpdate();

			ResultSet rset = stmt.executeQuery("SELECT * FROM ntest ORDER BY age");
			while (rset.next()) {
				System.out.println(rset.getString(1) + " er " + rset.getInt(2)+" år gammel.");
			}
			stmt.executeUpdate("DROP TABLE ntest");
		} catch (Exception e) {
			System.err.println("Der skete en fejl: " + e.getMessage());
			e.printStackTrace();
		}
		System.exit(0);
	}
}
