package setexam;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapExam {

	// entry point
	public static void main(String[] args) {

		Map<String, Integer> map = new HashMap<String, Integer>();

		map.put("김원중", 100);
		map.put("김자바", 98);
		map.put("홍길동", 67);
		map.put("이리온", 88);
		map.put("김원중", 73);// key 값이 같을경우 가장 마지막에 추가된 value 값으로 대체 된다.

		System.out.println(map.size());
		System.out.println(map.get("김자바"));// key로 value에 접근
		map.remove("홍길동");
		System.out.println(map.get("홍길동"));

		System.out.println("******************************************");

		Set<String> keySet = map.keySet();// key set만 가져옴

		Iterator<String> keyIterator = keySet.iterator();// 향상된 for문 처럼 배열의 하나씩 꺼내서 반복할 수 있게 해줌.

		while (keyIterator.hasNext()) {// 다음 key 값이 있으면 반복
			String key = keyIterator.next();// key 값을 꺼내옴
			Integer value = map.get(key);// 꺼내온 key에 해당하는 value를 가져옴
			System.out.println(key + " , " + value);
		} // end of while
		System.out.println();

		Set<Map.Entry<String, Integer>> entrySet = map.entrySet();// key랑 value를 다가져옴

		for (Entry<String, Integer> ent : entrySet) {
			System.out.println(ent.getKey() + " , " + ent.getValue());
		} // end of for-each

	}// end of main

}// end of class
