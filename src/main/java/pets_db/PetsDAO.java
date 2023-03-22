package pets_db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class PetsDAO {
	public int create(String name, String breed, String colour, int age) {
//		String sql = "";
		try (Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/pets_db", "root", "pass");
				PreparedStatement stmnt = conn
						.prepareStatement("INSERT INTO pets (name,breed,colour,age) VALUES (?,?,?,?)");) {

			stmnt.setString(1, name);
			stmnt.setString(2, breed);
			stmnt.setString(3, colour);
			stmnt.setInt(4, age);
			return stmnt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return 0;
	}

	public List<Pet> read() {
		List<Pet> pets = new ArrayList<>();
		try (Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/pets_db", "root", "pass");
				Statement stmnt = conn.createStatement();
				ResultSet results = stmnt.executeQuery("Select * FROM pets");) {
			while (results.next()) {
				int id = results.getInt(1);
				String name = results.getString("name");
				String breed = results.getString("breed");
				String colour = results.getString("colour");
				int age = results.getInt("age");

				pets.add(new Pet(id, name, breed, colour, age));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return pets;
	}

	public int Update(String name, String breed, String colour, int age, int id) {
//		List<Pet> pets = new ArrayList<>();
		try (Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/pets_db", "root", "pass");
				PreparedStatement stmnt = conn
						.prepareStatement("UPDATE pets SET (name,breed,colour,age)  WHERE id   VALUES (?,?,?,?)");) {

			stmnt.setString(1, name);
			stmnt.setString(2, breed);
			stmnt.setString(3, colour);
			stmnt.setInt(4, age);
			return stmnt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return 0;

	}

}