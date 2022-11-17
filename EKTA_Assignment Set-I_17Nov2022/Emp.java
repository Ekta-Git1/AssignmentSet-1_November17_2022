package Java_Assignment;

public class Emp 
{
	

	private int salary;
	
	public Emp(int salary) {
		super();
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Emp [salary=" + salary + "]";
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}
	
}

