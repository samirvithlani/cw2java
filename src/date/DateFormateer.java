package date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

//util -->static date --> formateed date...
//dd/mm/yyyy, mm/yy/dddd, yyyy/mm/dd
public class DateFormateer {

	public static void main(String[] args) {
		//simpleDateFormatter
		//SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
		SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy: HH:mm");
		String s = format.format(new Date());
		try {
			Date d = format.parse(s);
			System.out.println(d);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(s);
	}
}
