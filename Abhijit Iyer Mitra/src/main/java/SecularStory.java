class SecularStory{
	static void print() throws ArithmeticException{
		System.out.println("inside print()");
		int i=45,j=9,sub;
		sub=i/j;
		System.out.println(sub);
		//System.out.println(sub);
		
	}
	public static void main(String args[]) {
		try {
			print();
		}
		catch(ArithmeticException e) {
			System.out.println("Here comes the exception");
		}
		
	}
}