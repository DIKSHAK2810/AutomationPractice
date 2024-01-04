package method_argument;

public class Class_5 {
	int m;
	
	public void monday(int n) {
		m = n;
		System.out.println(m);
	}

	public static void main(String[] args) {
		Class_5 m1 = new Class_5();
		m1.monday(22);
		System.out.println(m1.m);

	}

}
