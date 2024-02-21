package Day14.Ex01_Collection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
/*	Map
	: 키(key), 값(value)를 쌍으로 구성한 요소를 다루는 컬렉션
	* key는 중복되지 않는다
	 
	요소 추가
	- put(key, value)			: 키와 값을 추가
						 		- 중복된 키가 추가되면, 마지막에 추가된 값이 저장된다
	
	요소 검색
	- get(key)					: 키에 해당하는 값 반환
	- contains(key)				: 키 존재 여부
	- containsValue(value)		: 값 존재 여부
	- isEmpty()					: 비어 있는지 여부
	- size()					: 요소의 개수
	- keySet()					: 모든 키를 Set 객체로 반환
	- values()					: 모든 값을 Collection 객체로 반환
	
	요소 삭제
	- remove(key)				: 키에 해당하는 값 삭제
	- clear()					: 모든 요소 삭제
*/
public class MapEx {
	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<String, Integer>();
		
		//요소 추가
		map.put("제니",100);
		map.put("리사",80);
		map.put("로제",70);
		map.put("지수",90);
		
		// 기존에 있는 키 "제니"에 다시 추가
		// 중복된 키를 추가하면 마지막으로 추가한 값으로 지정
		map.put("제니", 99);
		System.out.println("총개수? "+map.size());
		System.out.println();
		
		System.out.println("제니 성적? "+map.get("제니"));
		System.out.println("리사 성적? "+map.get("리사"));
		System.out.println();
		
		// map반복
		Set<String> keySet = map.keySet();
		for (String key : keySet) {
			Integer value = map.get(key);
			System.out.println(key+" "+value);
		}
		System.out.println();
		
		// map반복2 - Iterator
		// map.entrySet()			: iterator() 메소드를 갖는 Set 객체를 반환
		// entrySet.iterator()		: Map 컬렉션을 순차검색할 수 있는 iterator 객체를 가져옴
		Set<Map.Entry<String, Integer>> entrySet = map.entrySet();
		Iterator<Map.Entry<String, Integer>> entryIterator = entrySet.iterator();
				
		while( entryIterator.hasNext() ) {
			Map.Entry<String, Integer> entry = entryIterator.next();
			String  key = entry.getKey();			// 키
			Integer value = entry.getValue();		// 값
			
			System.out.println(key + " : " + value);
		}
		System.out.println();
		map.clear();		// 모든 요소 삭제
		
		System.out.println("총 개수 : " + map.size());
		System.out.println("empty 여부 : " + map.isEmpty());
	}
}