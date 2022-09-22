package basics;

public class Employeewage {
		int wageperhours = 20;
		int fulldayhours = 8;
		int time = 1;
		int part_time_hours = 8;
		int workingday = 20;
		int wageforamonth = 0;
		int hours = 100;
		int wageforhours = 0;
		int wage = 0;
		
	public void dailywage() {
		while ( workingday < 20 && hours < 100) {
		int empadd = (int) (Math.floor (Math.random()*5)%2);
		
		switch (empadd) {
		case 1: 
			System.out.println(" is present ");
			wage = fulldayhours*wageperhours;
		case 2:
			System.out.println(" is present in part time ");
			wage = part_time_hours*wageperhours;
		default:
			System.out.println(" is absent ");
		}
			System.out.println(" employee wage is :" + wage);
			
			
		if (workingday == 20) {
			wageforamonth = wage*workingday;
		} else if (hours <= 100){
			wageforhours = wage*hours;
		}
		}
		System.out.println(" Employee monthly wage is : " + wageforamonth);
		System.out.println(" employee wage in hours : " + wageforhours );
	}
}
