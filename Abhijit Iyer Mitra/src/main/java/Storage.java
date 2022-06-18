class Storage{
	static int a=234;
	static int b=0;
	int div;
	public static void main(String args[]) {
		System.out.println("Hello user");
		try {
			int div=a/b;
		} catch (ArithmeticException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("Hey thats an exception");
		}
		
		finally {
			System.out.println("Hey the program ends here");
		}
	}
}