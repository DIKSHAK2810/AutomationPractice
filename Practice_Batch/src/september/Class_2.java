  package september;

public class Class_2 {
	
	 //Static variable
	
	static int a = 10;
	static byte b = 20;
	static long c = 30;
	static short d = 40;
	static float e = 50.22f;
	static double f = 50.2234;
	
	//instance method
	public void wednesday() {
		
		// first type is (directly)
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		System.out.println(e);
		System.out.println(f);
		
		//second type is (Class name . variable)
		/*System.out.println(Class_2.a);
		System.out.println(Class_2.b);
		System.out.println(Class_2.c);
		System.out.println(Class_2.d);
		System.out.println(Class_2.e);
		System.out.println(Class_2.f);*/
		
	}
	
	//static method
	public static void thursday() {
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		System.out.println(e);
		System.out.println(f);
		
		//second type is (Class name . variable)
		/*System.out.println(Class_2.a);
		System.out.println(Class_2.b);
		System.out.println(Class_2.c);
		System.out.println(Class_2.d);
		System.out.println(Class_2.e);
		System.out.println(Class_2.f);*/
		
	}

	public static void main(String[] args) {
		  
		//Create class object 
		Class_2 z = new Class_2();
		
		// for instance method
		z.wednesday();// 
		
		// System.out.println(a);  
		 //System.out.println(Class_2.a);  //(for access in main method)

		 thursday();//for static method// access directly by method name
		 //Class_2.thursday(); // for static method // access class name.method name
	
	
	}

}
