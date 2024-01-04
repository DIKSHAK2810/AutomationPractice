 package operators;

public class LogicalOperator {

	public static void main(String[] args) {
		
		// logical not
		//reverse the result. syntax-!(conditions)
		
		int a = 20;
		int b = 10;
		
		System.out.println(!(a>b));
		
		boolean c = !(a<b);
		System.out.println(c);
		

		//logical or
		//it return true when one condition is true. syntax-(conditon1 ||condition2)
		
		int d = 30;
		int e = 40;
		System.out.println(d>e || d>e);
		
		boolean f = (e>d || d>e);
		System.out.println(f);
		
		
		// logical and
		//it return true when both condition is true. syntax-(condition1 &&condition2)
		
		int g = 5;
		int h = 10;
		
		System.out.println(g>h &&g<h);
		
		boolean i = (g<=h && h==g);
		System.out.println(i);
	}

}
