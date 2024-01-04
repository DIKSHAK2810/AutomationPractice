package string;

public class Replace {

	public static void main(String[] args) {

		// we have to replace character to new character with old character
		String z = "adition";

		//method 1
		System.out.println(z.replace("d","dd"));
		
		//method 2
		String x = z.replace("d", "dd");
		System.out.println(x);
	}

}
