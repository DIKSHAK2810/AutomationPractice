package decision_making_statement;

//nested me jitni values true hongi vo sare execute hongi pr agr first condition true hongi tbhi baki ke condition ka output show
//honga aur agr 1st condition false nikli to andr ki sb condition true bhi rhengi to bhji kisi kamm ki nii rhengi
//nested me age first main condition false aagyi to block of code andr jake bakike condition check nii krenga direct else me jake else value execute krenga
class NestedIf01 {

	public static void main(String[] args) {

		int a = 100;
		if(a==100) {
			System.out.println("condition1 is true");
			if(a>100) {
				System.out.println("condition2 is true");
				if(a==200) {
					System.out.println("condition3 is true");
				}
			}
		}
		else {
			System.out.println("all condition are false");
		}
	}

}
