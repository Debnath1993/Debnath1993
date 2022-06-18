package babai.practice;

class Hippo{
	private int id;
	private String name;
	private float salary;
	
	public Hippo(int id, String name, float salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
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
	public float getSalary() {
		return salary;
	}
	public void setSalary(float salary) {
		this.salary = salary;
	}
	void details() {
		System.out.println("id:"+id);
		System.out.println("name:"+name);
		System.out.println("salary:"+salary);
	}
	
}
public class Facial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Hippo hippo=new Hippo(34,"Wilson",2300.45f);
		System.out.println(hippo.getId());
		System.out.println(hippo.getName());
		System.out.println(hippo.getSalary());
		

	}

}
