package chapter04;

import java.util.Scanner;

public class Exercise43 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("점수를 입력하세요.");
		
		System.out.print("프로그래밍 기초:");
		int programingScore = scanner.nextInt();
		System.out.print("데이터베이스:");
		int databaseScore = scanner.nextInt();
		System.out.print("화면 구현:");
		int screenScore = scanner.nextInt();
		System.out.print("에플리케이션 구현:");
		int appScore = scanner.nextInt();
		System.out.print("머신러닝:");
		int machineScore = scanner.nextInt();
		
		int total = programingScore + databaseScore + screenScore + appScore + machineScore;
		double avg = (double) total / 5;
//		double avg = total / 5.0;
		System.out.println("총점: " + total);
		System.out.println("평균: " + avg);
		
		if (avg >= 90) {
			System.out.println("학점: " + "A");
		} else if (avg >= 80) {
			System.out.println("학점: " + "B");
		} else if (avg >= 70) {
			System.out.println("학점: " + "C");
		} else if (avg >= 60) {
			System.out.println("학점: " + "D");
		} else {
			System.out.println("학점: " + "F");
		}
		scanner.close();
	}
}
