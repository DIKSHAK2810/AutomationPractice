package method_argument;

public class SameArgument {
	int a;
	int b;
	
	public void same(int c, int d) {
		a = c; 
		b = c;
		System.out.println(a);
		System.out.println(b);
	}

	public static void main(String[] args) {

		SameArgument a1 = new SameArgument();
		a1.same(123, 234);
	}

}
