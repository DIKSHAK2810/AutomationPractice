package string;

public class InstanceVariable {

	
	//we can declare every string method in instance variable also
	
	//instance
	String x = "    method  ";
	public static void main(String[] args) {

		InstanceVariable x1 = new InstanceVariable();
		System.out.println(x1.x);
		
		//eg.
		//1
		System.out.println(x1.x.isEmpty());
		//2
		System.out.println(x1.x.length());
		//3
		System.out.println(x1.x.charAt(3));
		//4
		System.out.println(x1.x.concat(" one"));
		//5
		System.out.println(x1.x.replace("e", "tt"));
		//6
		System.out.println(x1.x.trim());
		
	}

}
 