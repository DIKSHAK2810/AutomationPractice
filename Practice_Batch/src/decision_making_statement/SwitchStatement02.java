package decision_making_statement;

public class SwitchStatement02 {
	
	//instance method
	public void bn() {
		int h =5;
		switch(h) {
		case 1:
			System.out.println("case-1");
			break;
		case 5:
			System.out.println("case-2");
			break;
			
			default:
				System.out.println("cases are false");
				break;
		}
	}

	public static void main(String[] args) {

		SwitchStatement02 o1 = new SwitchStatement02();
		o1.bn();
		
	}

}
