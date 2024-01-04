package decision_making_statement;

public class SwitchStatement04 {

	public static void main(String[] args) {

		int day_no = 3;
		String day;
		switch(day) {
		
		
		case 1 :
			day= "monday";
			break;
		case 2:
			day= "tuesday";
			break;
		case 3:
			day= "wednesday";
			break;
		case 4:
			day= "thursday";
			break;
		case 5:
			day= "friday";
			break;
		case 6:
			day= "saturday";
			break;
		case 7:
			day= "sunday";
			break;
			
			default:
				day="invalid";
				break;
				}
		System.out.println("your day"+ day);
		
	}

}
