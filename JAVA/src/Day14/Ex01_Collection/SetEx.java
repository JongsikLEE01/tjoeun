package Day14.Ex01_Collection;

import java.util.HashSet;
import java.util.Set;
/*	- Set
	: 순서가 없고, 중복요소를 허용하지 않는 컬렉션
	
	요소 추가
	- add()				: 중복이 아니면, 요소를 추가 (true)
					  	  중복이면, 추가를 안 함 (false)
	요소 검색
	- contains()		: 해당 요소가 존재하면 true
	- isEmpty()			: 요소가 하나도 없으면 true
	- size()			: 요소의 개수를 반환
	
	요소 삭제
	- remove(Object)	: 해당 요소를 삭제
						  index가 없으므로, 객체로만 삭제할 수 있다
*/
public class SetEx {
	public static void main(String[] args) {
		Set<Integer> set = new HashSet<Integer>();
		
		System.out.println(set.add(1));
		System.out.println(set.add(2));
		System.out.println(set.add(3));
		System.out.println(set.add(4));
		System.out.println(set.add(5));
		
		for (Integer item : set) {
			System.out.print("item : "+item);
		}
		System.out.println();
		System.out.println();
		
		//set 컬렉션은 중복된 요소를 저장하지 않음
		// 이미 존재한 3,5 추가
		System.out.println(set.add(3));
		System.out.println(set.add(5));
		System.out.print("size? "+set.size()+"\n");
		for (Integer item : set) {
			System.out.print("item : "+item);
		}		
		System.out.println();
		System.out.println();
		
		// 삭제
		set.remove(3);	// 객체 자체를 삭제
		set.remove(5);
		System.out.println("size? "+set.size());
		for (Integer item : set) {
			System.out.print("item : "+item);
		}		
		
	}
}