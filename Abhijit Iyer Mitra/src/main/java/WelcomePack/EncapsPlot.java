package WelcomePack;

public class EncapsPlot {
	private int id;
	private int salary;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public static void main(String args[]) {
		System.out.println("Main method begins here");
		EncapsPlot obj=new EncapsPlot();
		obj.setId(23);
		obj.setSalary(50000);
		System.out.println("the id is: "+obj.getId()+" and salary is "+obj.getSalary());
	}

}

