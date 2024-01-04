package method_argument;

public class Class_7 {
	
	static boolean l;
	
	public static void kj(boolean h) {
		l = h;
		System.out.println(l);
	}
	//signTURE IS BOOLEAN

	public static void main(String[] args) {

		Class_7 L1 = new Class_7();
		//1
		kj(true);
		//2
		Class_7.kj(false);
	}

}
