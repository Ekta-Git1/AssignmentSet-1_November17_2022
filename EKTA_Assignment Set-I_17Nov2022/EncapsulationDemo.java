package Java_Assignment;

/* Java Program to Show Encapsulation in Class */
	
	class Encapsulate {
	 
	    private String empName;
	    private int empId;
	    private int empAge;
	 
	    public int getAge() { return empAge; }
	 
	    public String getName() { return empName; }
	 
	    public int getId() { return empId; }
	 
	    public void setAge(int newAge) { empAge = newAge; }
	 
	    public void setName(String newName)
	    {
	    	empName = newName;
	    }
	 
	    public void setId(int newId) { empId = newId; }
	}
	 
	public class EncapsulationDemo {

	   public static void main(String[] args)
	  {
	        Encapsulate obj = new Encapsulate();
	 
	        
	        obj.setName("Ekta");
	        obj.setAge(19);
	        obj.setId(51);
	 
	        
	        System.out.println("Employee name: " + obj.getName());
	        System.out.println("Employee age: " + obj.getAge());
	        System.out.println("Employee Id: " + obj.getId());
	 
	        
     }
}
