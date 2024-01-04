package return_statement;

public class Class_1 { 
	
	// we can enter datatype as well as class also in parameter ,class like number and integer 
	
	public String zx(String s) {
		return s;
	}
	
	public Integer cv(Integer m) {
		return m;
	}

	public Number nm(Number l) {
		return 22;
	}
	
	// level 2
	
	// agr hm return me variable enter nii krenge yaa variable ke alava kuchh 
	//aur enter krenge to ouput me jo value hmne assign kiye hai means main
	// method me jo value insert kiye hai vo nii milengi
	
	public int og(Number k) {
		return 40;
	}
	
	public Number xc(Number j) {
		return 12;
	}
	
	public Integer re(Integer p) {
		return 11;
	}
	
	public int sub(int v) {
		System.out.println("the value of v="+ v);
		return 33;
	}
	public static void main(String[] args) {

		Class_1 s1 = new Class_1();
		System.out.println(s1.zx("hey"));
		System.out.println(s1.cv(11));
		System.out.println(s1.nm(80));
		
		
		//retun ke sath likhi huyi value hi assign huyi hai
		
		System.out.println(s1.og(25));
		System.out.println(s1.xc(23));
		System.out.println(s1.re(123));
		System.out.println(s1.sub(21));
	}

}
