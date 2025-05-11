package chapter13;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapExample {
	public static void main(String[] args) {
		// Map 컬렉션 생성
		Map<String,Integer> map = new HashMap<String, Integer>();
		
		// 객체 생성
		map.put("신용권", 85);
		map.put("홍길동", 90);
		map.put("동장군", 80);
		map.put("홍길동", 95);
		System.out.println("총 Entry 수: " + map.size());
		
		// 객체 생성
		System.out.println("\t홍길동 : " + map.get("홍길동"));
		System.out.println();
		
		// 객체를 하나씩 처리
		// 1. entry로 접근
		Set<Entry<String, Integer>> entrySet = map.entrySet();
		Iterator<Entry<String, Integer>> entryIterator = entrySet.iterator();
		while (entryIterator.hasNext()) {
			Entry<String, Integer> entry = entryIterator.next();
			System.out.println(entry.getKey() + ":" + entry.getValue());
		}
//		entrySet => foreach문으로 접근
		for (Entry<String, Integer> entry : entrySet) {
			System.out.println(entry.getKey() + ":" + entry.getValue());
		}
		// 2. key로 접근
		Set<String> keySet = map.keySet();
		for (String key : keySet) {
			System.out.println(key + ":" + map.get(key));
		}
		
		// 3. value로 접근=> 키 값은 모른다.
		Collection<Integer> values = map.values();
		for (Integer value : values) {
			System.out.println(value);
		}
		
		// 객체 삭제
		map.remove("홍길동");

	}
}
