package Ontap_CK;

public class Author {
	private String name;
	private String email;
	private char gender;
	
	public Author() {
		name = "";
		email = "";
		gender = ' ';
	}

	public Author(String name, String email, char gender) {
		this.name = name;
		this.email = email;
		this.gender = gender;
	}
	
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Author [name=" + name + ", email=" + email + ", gender=" + gender + "]";
	}
}
