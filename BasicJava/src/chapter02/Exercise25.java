package chapter02;

import java.util.Scanner;

public class Exercise25 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("500원짜리 동전의 갯수: ");
		int p500 = scanner.nextInt(); 
				
		System.out.print("100원짜리 동전의 갯수: ");
		int p100 = scanner.nextInt();
		
		System.out.print("50원짜리 동전의 갯수: ");
		int p50 = scanner.nextInt();
		
		System.out.print("10원짜리 동전의 갯수: ");
		int p10 = scanner.nextInt();
		
		int total = p500*500 + p100*100 + p50*50 + p10*10;
		System.out.printf("저금통 안의 동전의 총 액수: %d", total);
		scanner.close();
		
	}

}
