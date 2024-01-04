package string;

public class Ignorecase {

	public static void main(String[] args) {

		// to just ignore the case and focus on other details
		String actual = "tuesday";
		String expected = "TUESDAY";
		System.out.println(actual.equalsIgnoreCase(expected));
	}

}
