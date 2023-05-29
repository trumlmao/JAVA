package xmlxml;

public class xml_MODEL {
	public String id ;
	public String username;
	public String pass;
	public String name;
	public int age ;
	public xml_MODEL() {
		
	}
	public xml_MODEL(String id, String username, String pass, String name, int age) {
		super();
		this.id = id;
		this.username = username;
		this.pass = pass;
		this.name = name;
		this.age = age;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPass() {
		return pass;
	}
	public void setPass(String pass) {
		this.pass = pass;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "xml_MODEL [id=" + id + ", username=" + username + ", pass=" + pass + ", name=" + name + ", age=" + age
				+ "]";
	}
	
	
	
	
}
