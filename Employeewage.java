package basics;

public class Employeewage {
		int wageperhours = 20;
		int fulldayhours = 8;
		int wage = 0;
		int time = 1;
	

	public void dailywage() {
		
		int empadd = (int) (Math.floor (Math.random()*5)%2);
		
		if (empadd == time ) {
			System.out.println(" is present");
			wage = fulldayhours*wageperhours;
		} else {
			System.out.println(" is Absent");
			wage = fulldayhours*wageperhours;
		}
		
		
		System.out.println(" employee daily wage : " + wage );
	}
}
