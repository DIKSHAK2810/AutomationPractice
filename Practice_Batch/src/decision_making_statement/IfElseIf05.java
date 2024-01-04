package decision_making_statement;

public class IfElseIf05 {
	
	//instance method
	public void nm() {
		int h = 800;
		if(h==700) {
			System.out.println("condition1 is true");
		}
		else if(h>1000) {
			System.out.println("condition2 is true");
		}
		else if (h==100) {
			System.out.println("condition3 is true");
		}
		else {
			System.out.println("all conndition are false");
		}
	}

	public static void main(String[] args) {
		IfElseIf05 j1 = new IfElseIf05();
		j1.nm();

		
	}

}
