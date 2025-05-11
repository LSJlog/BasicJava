package chapter06.exercise;

public class Time {
	// 필드
	private int hour;
	private int minute;
	private int second;
	
	// 생성자
	public Time() {

	}
	
	public Time(int hour, int minute, int second) {
		if (hour < 0 || hour > 23) {
			this.hour = 0;
		} else {			
			this.hour = hour;			
		}
		
		if (minute < 0 || minute > 59) {
			this.minute = 0;
		} else {			
			this.minute = minute;							
		}
		
		if (second < 0 || second > 59) {
			this.second = 0;
		} else {			
			this.second = second;							
		}
	}
	
	// 메소드 
	public String toString(){
		return String.format("%02d:%02d:%02d", hour, minute, second);
	}
}
