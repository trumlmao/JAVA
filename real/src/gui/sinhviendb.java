package gui;

public class sinhviendb {
	private String id;
	private String name;
	private int age;
	private String create_at ;
	private String update_at ;
	
	@Override
	public String toString() {
		return "sinhviendb [id=" + id + ", name=" + name + ", age=" + age + ", create_at=" + create_at + ", update_at="
				+ update_at + "]";
	}
	public sinhviendb() {
		super();
	}
	public sinhviendb(String id, String name, int age, String create_at, String update_at) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.create_at = create_at;
		this.update_at = update_at;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
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
	public String getCreate_at() {
		return create_at;
	}
	public void setCreate_at(String create_at) {
		this.create_at = create_at;
	}
	public String getUpdate_at() {
		return update_at;
	}
	public void setUpdate_at(String update_at) {
		this.update_at = update_at;
	}
	

}
