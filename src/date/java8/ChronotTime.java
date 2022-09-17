package date.java8;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class ChronotTime {

	public static void main(String[] args) {
		LocalDate date = LocalDate.now();
		System.out.println("date -"+date);
		
		//
		LocalDate year = date.plus(2,ChronoUnit.YEARS);
		System.out.println(year);
		
		LocalDate date2 = date.plus(2,ChronoUnit.CENTURIES);
		System.out.println(date2);
		
		
	}
}
