package method_argument;

public class Class_3 {
	 
	//hm ek paranthesis me kitne bhi arguments likh skte hai bt uske sath utni hi value pass krni hongi
	
	//instance variable
	int v;
	static int w;
	
	public void monday(int a) {
		v = a;
		System.out.println("the value of instance variable is-" + v);
		
	}
	//signature is int
	public static void tuesday(int b) {
		w = b;
		System.out.println("the value of static variable is=" + w);
		
	}

	public static void main(String[] args) {
		Class_3 c = new Class_3();
		
		//instance
		c.monday(22);
		System.out.println(c.v);
		
		//static
		tuesday(11);
		Class_3.tuesday(11);	}

}
