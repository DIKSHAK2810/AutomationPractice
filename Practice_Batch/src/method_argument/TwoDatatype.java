package method_argument;

public class TwoDatatype {
	
	byte q;
	double w;
	
	public void saturday(byte e,double r) {
		q = e;
		w = r;
		System.out.println(q);
		System.out.println(w);
		
	}
	//SIGNATURE BYTE AND DOUBLE

	public static void main(String[] args) {
	TwoDatatype q1 = new TwoDatatype();

	q1.saturday((byte) 11, 20.2213);
	
	}}
