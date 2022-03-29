package deskprac;

public class Customer {

private String name, email;
	
	public Customer(String name, String email){
		this.name = name;
		this.email = email;
	}
	
	public String toString() {
		return "Name = " + name + ", Email = " + email;
	}
	
}
