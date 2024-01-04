package operators;

public class Comparision_Operator {
	
	/*in comparision operator we use graeter than(>), greater than equal to (>=),
	less than(<), less than  equal to (<=), equal to (=), not  equal to (!=)*/

	public static void main(String[] args) {
		
		int a = 25;
		int b = 14;
		//1way
		System.out.println(a>b);
		//2way
		boolean c = a>b;
		System.out.println(c);
		
		byte d =10;
		int e = 12;
		System.out.println(d>e);
		
		double f = 20.259;
		double g = 10.987;
		System.out.println(g>f);
		
		int z = 10;
		double y = 20.2345;
		System.out.println(z<y);
	}

}
