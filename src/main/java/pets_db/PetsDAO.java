package pets_db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class PetsDAO {

//	private String url = "";
//	private String User = "";
//	private String pwd = "";

//	public void PetsDao(String url, String user, String pwd) {
//		super();
//		this.url = url;
//		this.User = user;
//		this.pwd = pwd;

//	private final Connection conn;
//
//	public PetsDAO(String url, String user, String pass) throws SQLException {
//		super();
//		this.conn = DriverManager.getConnection(url, user, pass);
//	}

//	public int create(String breed, String name, String colour, int age) {
//		try (PreparedStatement stmnt = conn
//				.prepareStatement("INSERT INTO pet (breed, name, colour, age) VALUES (?, ?, ?,?)");) {
//			stmnt.setString(1, breed);
//			stmnt.setString(2, name);
//			stmnt.setString(3, colour);
//			stmnt.setInt(4, age);
//			;
//
//			return stmnt.executeUpdate();
//		} catch (SQLException e) {
//			e.printStackTrace();
//		}
//		return 0;
//	}

	/**
	 * 
	 */
	public void read() {
		try {
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/global_logic", "root", "pass");
			Statement stmnt = conn.createStatement();
			ResultSet results = stmnt.executeQuery("Select * FROM pets");
			while (results.next()) {
				results.getInt(0);

				int id = results.getInt(id);
				String name = results.getString("name");
				String breed = results.getString("breed");
				String colour = results.getString("bcolour");
				int age = results.getInt(age);

				System.out.println(id);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

}