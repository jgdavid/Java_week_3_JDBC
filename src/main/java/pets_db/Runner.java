package pets_db;

public class Runner {
	public static void main(String args[]) {
		PetsDAO dao = new PetsDAO();

		dao.read();

	}
//		try (PetsDAO dao = new PetsDao("jdbc:mysql://localhost:3306/global_logic", "root", "pass");) {
//			System.out.println(dao.create("", "", ""));
//			System.out.println(dao.read());
//		} catch (Exception e) {
//			e.printStackTrace();
//
//		}
//	}
}
