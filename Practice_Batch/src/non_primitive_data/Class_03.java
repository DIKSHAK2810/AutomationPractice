package non_primitive_data;

public class Class_03 {
	
	String x ="005  ";
	static String y ="006";
	
	//combine two string
	
	// so we use concat for combine two strings.
	
	String m = x.concat(y);
	String n = m.concat(y);
	String o = m.concat(x);
	

	public static void main(String[] args) {
		Class_03 k = new Class_03();
		//System.out.println(k.m);
		//System.out.println(k.n);
		//System.out.println(k.o);
		//System.out.println(k.m +" "+ k.n);
		System.out.println(k.x +" "+ k.y);
		
		}
	}


