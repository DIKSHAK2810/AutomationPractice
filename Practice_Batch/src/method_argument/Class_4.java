package method_argument;

public class Class_4 {

	//instance variable
	int a;
	byte b;
	short c;
	long d;
	double e;
	float f;
	
	
	public void wednesday(int g, int m, long j, double k, float l) {
		a = g;
		e = k;
		f = l;
		
		System.out.println(a);
		System.out.println(e);
		System.out.println(f);
	}
	
	public static void main(String[] args) {
		Class_4 a1 = new Class_4();
		a1.wednesday(22, 23, 24, 23.875, 26.8765f);
	}
		// TODO Auto-generated method stub
		
	}
