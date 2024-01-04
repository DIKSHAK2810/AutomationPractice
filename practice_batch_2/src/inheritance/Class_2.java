package inheritance;

public class Class_2 extends Class_1 {
	//instance variable
	long m = 98273;
	String n = "monday";
	
	//instance method
	public void city() {
		System.out.println("pune city");
	}

	public static void main(String[] args) {

		Class_2 a1 = new Class_2();
		a1.nagpur();//parents class
		a1.college();//parent class
	System.out.println(a1.i);//parent class
	System.out.println(a1.j);//parent class 

	System.out.println("__________________");
	
	
	a1.city();//child class
	System.out.println(a1.m);//child class
	System.out.println(a1.n);//child class
	
	}

}
