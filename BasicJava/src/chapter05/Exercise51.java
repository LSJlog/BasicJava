package chapter05;
//다음 배열에서 최댓값과 최솟값을 구하시오.
//{38, 94, 16, 3, 76, 94, 82, 47, 59, 8}

public class Exercise51 {
	public static void main(String[] args) {
		int[] arr1 = {38, 94, 16, 3, 76, 94, 82, 47, 59, 8};
//		int max = Integer.MAX_VALUE;
//		int min = Integer.MIN_VALUE;
		
		int max = 0;
		int min = arr1[0];
		
		for (int i = 0; i < arr1.length; i++) {
			if (arr1[i] > max) {
				max = arr1[i];
			}
			if (arr1[i] < min) {
				min = arr1[i]; 
			}
		}
		System.out.println("최댓값: " + max);
		System.out.println("최솟값: " + min);	
	}
}
