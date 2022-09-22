package basics;

public class Employeewage {
		int wageperhours = 20;
		int fulldayhours = 8;
		int wage = 0;
		int time = 1;
		int part_time_hours = 8;

	public void dailywage() {
		
		int empadd = (int) (Math.floor (Math.random()*5)%2);
		
		if (empadd == time ) {
			System.out.println(" is present");
			wage = fulldayhours*wageperhours;
		} else if (empadd == part_time_hours) {
			System.out.println(" is present in part time ");
			wage = part_time_hours*wageperhours;
		}else {
			System.out.println(" is Absent");
			wage = 0;
		}
		
		
		System.out.println(" employee daily wage : " + wage );
	}
}
