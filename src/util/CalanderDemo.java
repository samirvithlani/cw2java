package util;

import java.util.Calendar;
import java.util.Date;
import java.util.Set;

public class CalanderDemo {

	public static void main(String[] args) {

		Calendar c = Calendar.getInstance();
		System.out.println(c.getTime());
		System.out.println(c.getTimeInMillis());
		Date d = new Date(c.getTimeInMillis());
		System.out.println(d);
		Set<String> set=Calendar.getAvailableCalendarTypes();
		for(String s:set) {
			System.out.println(s);
		}
		
		System.out.println(c.getFirstDayOfWeek());
		System.out.println(c.getTimeZone().getID());
		System.out.println(c.getTimeZone().getDisplayName());

	}
}
