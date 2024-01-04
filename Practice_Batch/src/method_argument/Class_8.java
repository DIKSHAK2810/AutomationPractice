package method_argument;

public class Class_8 {
	 static String g;
	
	public void fd(String s) {
		//g = s;
		//System.out.println(g);
	}
	
	public static void as(String p) {
		g = p;
		System.out.println(g);
	}
	//SIGNATURE STRING
	public static void main(String[] args) {
		Class_8 g1 = new Class_8();
		// instance
		g1.fd("hey, string");
		//static
		Class_8.as("hey, its saturday!!");
	}

}
