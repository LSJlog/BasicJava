package chapter08.sort;

import java.util.Arrays;

public class SortExample {
	public static void main(String[] args) {
		// 정렬 알고리즘 sorting
		// 탐색(검색)
		
//		int[] numbers= {4, 2, 9, 1, 6, 7, 8, 3};
		String[] names = {
				"박승우", "배문기", "박정수", "오미나",
				"이지영", "정은지", "전지혜"
		};
		System.out.println(Arrays.toString(names));
		System.out.println();
		Arrays.sort(names);
		System.out.println(Arrays.toString(names));
		
	}
	
}
