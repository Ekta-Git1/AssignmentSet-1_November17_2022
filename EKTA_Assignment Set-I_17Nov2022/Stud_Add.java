package Java_Assignment;

public class Stud_Add {
	
	private String phonenumber;
	private String name;
	private String address;
	private String roll_no;
	
	public Stud_Add(String name, String phonenumber, String address,String roll_no)
	{
		this.name=name;
		this.phonenumber=phonenumber;
		this.address=address;
		this.roll_no=roll_no;
	}
	
	
	public String getPhonenumber() {
		return phonenumber;
	}
	public void setPhonenumber(String phonenumber) {
		this.phonenumber = phonenumber;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}


	public String getRoll_no() {
		return roll_no;
	}


	public void setRoll_no(String roll_no) {
		this.roll_no = roll_no;
	}
	
	

}


