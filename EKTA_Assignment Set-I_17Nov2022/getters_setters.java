package Java_Assignment;

/*Write a class with main method to demonstrate instance creation using method
reference. (Hint: Create any simple class with attributes and getters and setters)
 * */

public class getters_setters {

	private int id;

	private String name;
	
	@Override
	public String toString() {
		return "getters_setters [id=" + id + ", name=" + name + "]";
	}


	public getters_setters(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}


	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	

	public static void main(String[] args) 
	{
		getters_setters gs = new getters_setters(101,"Ekta");
		getters_setters gs1 = new getters_setters(102,"Valhe");
		System.out.println(gs +" : "+gs1);
	}

}

