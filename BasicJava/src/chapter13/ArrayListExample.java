package chapter13;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExample {
	public static void main(String[] args) {
		// 초보 개발자
//		ArrayList<String> list1 = new ArrayList<>();
		
		// 중급 개발자
		List<String> list = new ArrayList<>();
		
		// 고급 개발자
//		List<String> list3 = Arrays.asList(null);
		list.add("Java");
		list.add("JDBC");
		list.add("Servlet/JSP");
		list.add(2, "Database");
		list.add("iBATIS");
		int size = list.size();
		System.out.println("총 객체수: " + size);
		System.out.println();
		
		String skill = list.get(2);
		System.out.println("2: " + skill);
		System.out.println();
		
		for (int i = 0; i < list.size(); i++) {
			System.out.println(i + ":" + list.get(i));
		}
		System.out.println();
		
		list.remove(2);
		list.remove(2);
		list.remove("iBATIS");
		for (int i = 0; i < list.size(); i++){
			String str = list.get(i);
			System.out.println(i + ":" + str);
		}
		
		list.clear();	// 리스트 모든 데이터 삭제
		
	}
}
