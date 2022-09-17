package date.java8;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Month;
import java.time.Period;

public class DatePeriodAndDuration {

	public static void main(String[] args) {
		//now
		LocalDate date1 = LocalDate.now();
		//2014
		LocalDate date2 = LocalDate.of(2014, Month.APRIL, 1);
		//find out gap
		Period gap = Period.between(date1, date2);
		System.out.println(gap);
		
		// time....
		
		LocalTime time1 = LocalTime.now();
		System.out.println("Current time = "+time1);
		Duration fourHours =Duration.ofHours(4);
		
		LocalTime time2 = time1.plus(fourHours);
		System.out.println(time2);
		
		Duration gap1 = Duration.between(time1, time2);
		System.out.println(gap1.toHours());
	}
}
