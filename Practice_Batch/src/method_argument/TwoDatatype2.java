package method_argument;

public class TwoDatatype2 {

	int o;
	float a;
	
	public void sunday(int l, float k) {
		o = l;
		a = k;
		System.out.println(o);
		System.out.println(a);
	}
	//SIGNATURE INT and float
	public static void main(String[] args) {

		TwoDatatype2 o1 = new TwoDatatype2();
		o1.sunday(222243321, 202123245356677543214675.232f);
	}

}
