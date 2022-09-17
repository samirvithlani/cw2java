package date;

import java.util.Date;

//java.util.Date
public class DateDemo1 {

	public static void main(String[] args) {
		
		//Date d = new Date(95, 02, 14,12,25);
		Date d = new Date();
		d.setYear(95);
		//d.UTC(year, month, date, hrs, min, sec)
		System.out.println(d);
		System.out.println("GetDate.."+d.getDate());
		System.out.println(d.getDay());
		System.out.println(d.getHours());
		System.out.println(d.getMinutes());
		System.out.println(d.getYear()+1900);
		System.out.println(d.getMonth()+1);
		System.out.println(d.getSeconds());
		
		
		
		
		
	}
}
