package return_statement;

public class Byte {

	public byte as(byte b) {
		
		return b;
	}
	public static void main(String[] args) {

		Byte b1 = new Byte();
		System.out.println(b1.as((byte) 12));
	}

}
