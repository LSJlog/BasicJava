package chapter11;

import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
//import java.util.Calendar;
import java.util.Date;

public class DateExample {
	public static void main(String[] args) {
		Date date = new Date();
//		String dateString = date.toString();
//		System.out.println(dateString);
		// 날짜 포맷팅 SimpleDateFormat
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-mm-dd E hh:mm:ss.SSS");
		String format = dateFormat.format(date);
		System.out.println(format);
		
		LocalDateTime now = LocalDateTime.now();
		System.out.println(now);
		
//		Calendar calendar = Calendar.getInstance();
//		int year = calendar.get(Calendar.YEAR);
//		int monte = calendar.get(Calendar.MONTH);
//		int day = calendar.get(Calendar.DAY_OF_MONTH);
		
		
	}
}
