import java.util.*;

public class LeapYear {
	public static void main(String khj []) {
		System.out.print( "Enter a year = ");
		Scanner num = new Scanner(System.in);
		
		int year = num.nextInt();

//String Status;

//		Status = (year%4 == 0||year%100==0)? year+"is a leap": year+"not a leap year";
		
		if(year%4==0||year%100==0) {
			System.out.println(year+ " is a leap year");
			
		}
		else {
			System.out.println( year+"is not a leap year");
		}
	}

}
