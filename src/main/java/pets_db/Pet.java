package pets_db;

public class Pet {
	private int id;
	private String breed;
	private String name;
	private String colour;
	private int age;

	public Pet(int id, String name, String breed, String colour, int age) {
		super();
		this.id = id;
		this.name = name;
		this.breed = breed;
		this.colour = colour;
		this.age = age;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getBreed() {
		return breed;
	}

	public void setBreed(String breed) {
		this.breed = breed;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getColour() {
		return colour;
	}

	public void setColour(String colour) {
		this.colour = colour;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Pet [id=" + id + ", breed=" + breed + ", name=" + name + ", colour=" + colour + ", age=" + age + "]";
	}

}
