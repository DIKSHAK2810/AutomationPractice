 package constructor;

public class Constructor_03 {
	public Constructor_03(int a, float b,  long d,String e,char f) {
		System.out.println("the value of a="+a);
		System.out.println("the value of b="+b);
		
		System.out.println("the value of d="+d);
		System.out.println("the value of e="+e);
		System.out.println("the value of f="+f);
	}

	public static void main(String[] args) {

		Constructor_03 w1=new Constructor_03 (22,30f,4345,"monday",'k');
		
		
		
	}

}
