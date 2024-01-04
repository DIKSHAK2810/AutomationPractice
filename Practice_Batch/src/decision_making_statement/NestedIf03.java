package decision_making_statement;

public class NestedIf03 {

	public static void main(String[] args) {

		String k = "Nagpur";
		
		if(k=="Pune") {
			System.out.println("city=pune");
			if(k=="Nagpur") {
				System.out.println("city=nagpur");
				if (k=="Nagpur") {
					System.out.println("city= nagpur2");
				}
			}
		}
		else {
			System.out.println("none of these");
		}
	}

}
