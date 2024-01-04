package string;

public class Contains {

	public static void main(String[] args) {
		
		//to check character which is present in given string - contains();

		String f = "this is automation class.";
		
		//method 1
		System.out.println(f.contains("is"));
		
		System.out.println(f.contains("A"));
		System.out.println(f.contains("a"));
		
		//method2
		boolean b = f.contains("class");
		System.out.println(b);
	}

}
