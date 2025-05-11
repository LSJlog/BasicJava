package chapter02;

public class Exercise22 {
	public static void main(String[] args) {
		double distance = 40e12;
		double lightSpeed = 300000;
		
		double sec = distance/lightSpeed;
		double year = sec/60/60/24/365;
		
		System.out.printf("빛의 속도로 프록시마 센타우리 별까지 가는데 걸리는 시간은 %-16.15f광년이다.",year);
	}

}
