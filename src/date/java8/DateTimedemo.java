package date.java8;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;

public class DateTimedemo {

	public static void main(String[] args) {
		
		LocalDate date = LocalDate.now();
		System.out.println(date);
		
		LocalTime time1= LocalTime.now();
		System.out.println(time1);
		
		
		//DateFormater
		DateTimeFormatter formatter  = DateTimeFormatter.ofPattern("yyyy-MMMM-dd");
		
		LocalDateTime time = LocalDateTime.now();
		System.out.println(time);
		
		String dt =time.format(formatter);
		System.out.println(dt);
		
		//month enum
		Month month =time.getMonth();
		System.out.println(month);
		int day = time.getDayOfMonth();
		System.out.println(day);
		int year = time.getYear();
		System.out.println(year);
		
		int seconds = time.getSecond();
		System.out.println(seconds);
		System.out.println(time.getMonthValue());
		//DateTime -->
		time.toLocalTime();
		
		//udf -->
		LocalDate birthDate = LocalDate.of(1995, 02, 14);
		System.out.println(birthDate);
		System.out.println(birthDate.getMonthValue());
	}
}
