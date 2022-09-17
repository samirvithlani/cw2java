package date.java8;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class DateTimeZoneDemo {

	public static void main(String[] args) {
		
		
		LocalDateTime date = LocalDateTime.now();
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-YYYY HH:mm:ss");
		String formattedCurrentDate = date.format(formatter);
		System.out.println(formattedCurrentDate);
		
		//timezones..
		ZonedDateTime currentZone = ZonedDateTime.now();
		System.out.println(currentZone.getZone());
		
		ZoneId tokyo = ZoneId.of("Europe/Amsterdam");
		ZonedDateTime tokyozone = currentZone.withZoneSameInstant(tokyo);
		System.out.println(tokyozone.getHour());
		System.out.println(tokyozone.getMinute());
		
		
		
	}
}
