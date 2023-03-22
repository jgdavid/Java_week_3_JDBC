package pets_db;

public class Runner {
	public static void main(String args[]) {
		PetsDAO dao = new PetsDAO();

		dao.read();
		System.out.println(dao.read());
//		System.out.println(dao.create("mouse", "tom", "brown", 9));
		System.out.println(dao.read());
		System.out.println(dao.Update("elephant", "jim", "brown", 23, 2));

	}

}
