package decision_making_statement;

public class NestedIf02 {

	//instance method
	public void hj() {
		double n = 60.453;
		if(n==60.453) {
			System.out.println("condition1 is true");
			if(n>60) {
				System.out.println("condition2 is true ");
				if(n>50) {
					System.out.println("condition3 is true");
					if (n<79) {
						System.out.println("condition4 is true");
					}
				}
			}
		}
		else {
			System.out.println("all conditions are false");
		}
		
	}
	public static void main(String[] args) {

		NestedIf02 m1 = new NestedIf02();
		m1.hj();
		
	}

}
