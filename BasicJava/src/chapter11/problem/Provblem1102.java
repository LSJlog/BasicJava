package chapter11.problem;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Provblem1102 {
	public static void main(String[] args) {
		Date date = new Date();
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-mm-dd E hh:mm:ss.SSS");
		String format = dateFormat.format(date);
		System.out.println(format);
	}
}
