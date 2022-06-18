class James{
	
	private int roll;
	
	public void setRoll(int roll) {
		this.roll=roll;
		}
	public int getRoll() {
		return roll;
	}
		
}

public class EncapsHello {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		James jb=new James();
		jb.setRoll(345);
		System.out.println("Hello there: "+jb.getRoll());

	}

}
