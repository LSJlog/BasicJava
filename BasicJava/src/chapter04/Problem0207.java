package chapter04;

import java.util.Scanner;

public class Problem0207 {
	public static void main(String[] args) {
		boolean run = true;
		int balance = 0;
		Scanner scanner = new Scanner(System.in);
		
		while(run) {
			System.out.println("---------------------------------");
			System.out.println("1.예금 | 2.출금 | 3.잔고 | 4.종료");
			System.out.println("---------------------------------");
			System.out.print("선택> ");
			
			int num = Integer.parseInt(scanner.nextLine());
			
			switch(num) {
				case 1:
					System.out.print("예금액> ");
					int deposit = Integer.parseInt(scanner.nextLine());
					balance += deposit;
					break;
				case 2:
					System.out.print("출금액> ");
					int withdrawal = Integer.parseInt(scanner.nextLine());
					balance -= withdrawal;
					break;
				case 3:
					System.out.print("잔고> ");
					System.out.println(balance);
					break;
				case 4:
					run = false;
					break;
			}
			System.out.println();
		}
		System.out.println("프로그램 종료");
		scanner.close();
	}
}
