
public class Blanket {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=5,j=20,k; //variables declared
		try {
			k=i*j;    //task done
			if(k>200) {  //check conditions
				throw new ArithmeticException();
			}
			System.out.println("Less than 200:");
			System.out.println(+k);
		}
		catch(ArithmeticException e) {
			System.out.println("Invalid credentials");
		}
		//System.out.println("Condition met");

	}

}
