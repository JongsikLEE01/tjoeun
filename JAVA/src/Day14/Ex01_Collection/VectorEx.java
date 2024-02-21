package Day14.Ex01_Collection;

import java.util.Iterator;
import java.util.Vector;
/*
	List 인터페이스
	- 요소 추가
	add(E)				:	맨 끝에 추가
	add(index, E)		: 	index 추가
	set(index, E)		:	index 요소를 E로 지정(변경)
	addAll(Collection)	: 	해당 컬렉션에 지정한 컬렉션 요소 전체를 추가
	 
	- 요소 검색
	get(index)			: 	index 에 있는 요소를 반환
	contains(Object)	: 	요소의 포함 여부 (true/false)
	isEmpty()			: 	컬렉션이 비어있는지 여부 (true)/false)
	size()				:	지정된 요소의 개수 반환
	
	- 요소 삭제
	remove(index)		: 	index 에 있는 요소 삭제
	remove(Object)		:	지정된 객체 요소를 삭제
	clear()				: 	모든 요소 삭제			
*/
public class VectorEx {
	public static void main(String[] args) {
		// 컬렉션 생성
		// 컬렉션타입<요소타입> 변수명 = new 클래스명<요소타입>();
		
		// Vector 객체 생성
		Vector<Integer> list = new Vector<Integer>();	// 기본생성시 기본용량10, 2배씩 증분
		// 요소 추가
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		System.out.println(list);
		
		// 용량을 지정해서 생성
		Vector<String> vector =  new Vector<String>(10);
		// 요소 추가
		vector.add("아메리카노");
		vector.add("카페라떼");
		vector.add("카라멜마끼야또");
		vector.add("녹차라떼");
		vector.add("우유");
		System.out.println(vector);
		
		System.out.println("개수? "+vector.size());
		System.out.println("용량? "+vector.capacity());
		System.out.println();
		
		// 반복 방법1
		// for문
		System.out.println("*****for문*****");
		for (int i = 0; i < vector.size(); i++) {
			String item = vector.get(i);
			System.out.println("메뉴이름? "+item);
		}
		System.out.println();
		
		// 반복 방법2
		// foreach문
		System.out.println("*****foreach문*****");
		for (String string : vector) {
			System.out.println("메뉴이름? "+string);
		}
		System.out.println();
		
		// iterator() : 각 리스트 컬렉션 객체로부터 Iterator객체를 반환
		// Iterator
		// hasNext() : 다음 요소의 존재 여부
		// next() : 다음 요소를 반환
		// 컬렉션객체.iterator : 해당 컬렉션에 대한 iterator객체 반환
		
		// 반복 방법3(배열 안의 객체를 구분해야할 때 사용)
		// Iterator을 이용한 방법(반복하다)
		// 해당 리스트 컬렉션으로부터 Iterator객체를 가져와 반복
		System.out.println("*****Iterator*****");
		Iterator<String> it = vector.iterator();
		while(it.hasNext()) {
			String item = it.next();
			System.out.print(item);
			if(it.hasNext()) System.out.print(", ");
			else System.out.println();
		}
		System.out.println();
		
		// 삭제
		// 삭제한 위치 뒤의 index가 앞으로 한칸씩 당겨짐
		vector.remove(0);
		vector.remove(1);
		vector.remove("녹차라떼");
		vector.remove("카페라떼");
		vector.remove("우유");
		System.out.print("삭제 후? "+vector+"\n");
		
		// 컬렉션.isEmpty() : 요소가 없으면 true, 비어있지 않으면 false
		if(vector.isEmpty()) {
			System.out.println("메뉴X");
		}
			
	}
}