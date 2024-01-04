package method_argument;

// in argument we have to put datatype in parameter. 
//and have to assign same variables then in main methode we have to create class object then put the value 

public class Class_1 {
	
	int q;
	
	//instance method
	public void argument(int we){
		q = we;
		
		System.out.println(q);
	}
	//signature is int

	public static void main(String[] args) {

		
		Class_1 q1 = new Class_1();
		
		//1
		q1.argument(12);
		
		//2
		System.out.println(q1.q);
	}

}
