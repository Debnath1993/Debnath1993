
public class NomadStack {

	public static void main(String[] args) {
		
		try {
			int dividedbyzero=45/0;
			System.out.println(dividedbyzero);		
			}
		catch(ArithmeticException e) {
			System.out.println("its not possible");
		}
		finally {
			System.out.println("This is mandatory execution portion");
		}

	}

}
