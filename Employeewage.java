package basics;

public class Employeewage {
	public static void attendance () {
		
		int empadd = (int) (Math.random()*5)%2;
		
		if (empadd == 1) {
			System.out.println(" is present");
		} else {
			System.out.println(" is Absent");
		}	
	}
}
