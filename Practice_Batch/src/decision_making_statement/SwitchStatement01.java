package decision_making_statement;

public class SwitchStatement01 {

	public static void main(String[] args) {

		int p = 200;
		switch(p) {
		case 1 :
			System.out.println("case-10");
			break;
		case 20:
			System.out.println("case-20");
			break;
		case 50:
			System.out.println("case-50");
			break;
		case 200:
			System.out.println("case-200");
			break;
			
			default:
				System.out.println("all are false");
				break;
		}
	}

}
