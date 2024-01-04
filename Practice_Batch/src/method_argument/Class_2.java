package method_argument;

public class Class_2 {
	int x;
	public void ab(int i) {
		x = i;
		System.out.println(x);
	}

	public static void main(String[] args) {
		Class_2 y = new  Class_2();
		System.out.println(y.x);
	}

}
// isme hm ne value nii diye h to output hme 0 mila, agr hme value deni hai to class create 
//krne ke next line me hme refrence variable.method name aur value assign krni pdegi
// eg in class_5
