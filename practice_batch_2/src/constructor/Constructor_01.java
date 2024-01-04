package constructor;

public class Constructor_01 {
	
	//user define constructor

	public Constructor_01() {
		System.out.println("user define constructor");
		
		for(int i=0;i<=5;i++) {
			System.out.print(i);
		}
	}
	public static void main(String[] args) {
		Constructor_01 c2= new Constructor_01();
		
	}

}
