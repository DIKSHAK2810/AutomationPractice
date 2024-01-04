package september;

public class Class_02 {
	
	//instance variable
	int a = 10;
	byte b = 20;
	long c = 30;
	short d = 40;
	float e = 50.22f;
	double f = 50.2234;
	
	//instance method
	public void monday() {
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		System.out.println(e);
		System.out.println(f);
	}
	
	//static method
	public static void tuesday() {
		//access instance variable in static method
		
		Class_02 g = new Class_02();
		System.out.println(g.a);
		System.out.println(g.b);
		System.out.println(g.c);
		System.out.println(g.d);
		System.out.println(g.e);
		System.out.println(g.f);
	}

	public static void main(String[] args) {
		// create class object for the instance method
		Class_02 g = new Class_02();
		g.monday();
		
		//static method
		
		tuesday(); // access directly with the help of method name
		Class_02.tuesday(); // access with Class name . method name

	}

}
