class Variety{
	private int id;
	private String name;
	
	Variety(int id,String name){
		this.id=id;
		this.name=name;
		
	}
	public void setId(int id) {
		this.id=id;
			
	}
	public int  getId() {
		return id;
		
	}
	public void setName(String name) {
		this.name=name;
	}
	public String getName() {
		return name;
	}
	public void print() {
		System.out.println("Hello Variety admin!!");
	}
}
public class DeskJob {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Variety vbj=new Variety(23,"Rahul");
		vbj.print();
		System.out.println(vbj.getId());
		System.out.println(vbj.getName());
   }

}
