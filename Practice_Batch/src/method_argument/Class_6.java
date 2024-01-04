package method_argument;

public class Class_6 {

	boolean b;
	
	public void vc(boolean x) {
		b = x;
		System.out.println(x);
	}
	//signature is boolean
	public static void main(String[] args) {

		Class_6 x1 = new Class_6();
		x1.vc(true);
	}

}
