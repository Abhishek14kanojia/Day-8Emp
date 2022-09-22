package basics;

public class Employeewage {
		int wageperhours = 20;
		int fulldayhours = 8;
		int wage = 0;
		int time = 1;
		int part_time_hours = 8;
		int workingday = 20;
		int wageforamonth = 0;
		
	public void dailywage() {
		for (int i = 0; i <= workingday; i++) {
		int empadd = (int) (Math.floor (Math.random()*5)%2);
		
		switch (empadd) {
		case 1: 
			System.out.println(" is present ");
			wage = fulldayhours*wageperhours;
			break;
		case 2:
			System.out.println(" is present in part time ");
			wage = part_time_hours*wageperhours;
			break;
		default:
			System.out.println(" is absent ");
		}
		wageforamonth = wage*workingday;
		
		}
		System.out.println(" Employee monthly wage is : " + wageforamonth);
		System.out.println(" employee daily wage : " + wage );
	}
}
