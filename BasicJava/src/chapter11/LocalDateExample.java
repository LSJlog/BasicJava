package chapter11;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class LocalDateExample {
	public static void main(String[] args) {
		LocalDateTime now = LocalDateTime.now();
		System.out.println(now);
		
		String format = LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-mm-dd E hh:mm:ss.SSS"));
		System.out.println(format);
	}
}
