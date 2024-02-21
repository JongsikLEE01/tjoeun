package Day14.Ex02_WildCard;

import Day05.Class.Pikachu;
import Day05.Class.Raichu;

public class BoxEx {
	public static void main(String[] args) {
		//제네릭
		/*모든 클래스 타입을 다룰 수 있도록 클래스와 메소드를 정의하는 기법
		 * - 타입 매개변수 : 모든 클래스 타입을 일반화한 변수
		 * - 객체를 생성할때 타입을 결정
		 * - 구조 : class 클래스명 <타입매개변수1,2>{  }
		 * - 예시 : class Box<T> {  }
		 * - 생성 : Box<클래스> box= new Box<클래스>();
		 */
		Box<String> box1 = new Box<String>();
		box1.setT("쿠팡택배");
		String boxName = box1.getT();
		System.out.println("box : "+boxName);
		
		Box<Integer> box2 = new Box<Integer>();
		box2.setT(1234);
		int value = box2.getT();
		System.out.println("box2 : "+value);
		
		Box<Pikachu> monsterBall = new Box<Pikachu>();
		monsterBall.setT(new Pikachu());
		Pikachu pikachu = monsterBall.getT();
		System.out.println("pikachu : "+pikachu);
		
		// 제네릭 기법의 타입으로는"클래스"만 사용 가능
		// 기본 타입은 저장할 수 없음
		// Box<int> boxInt = new Box<int>();
		
		// 배열은 참조 자료형이므로 제네릭의 타입으로 사용 가능
		Box<int[]> boxBintz = new Box<int[]>();
		boxBintz.setT(new int[] {1,2,3,4,5});
		int[] bintzArr = boxBintz.getT();
		for (int i : bintzArr) {
			System.out.print(i+" ");
		}
		System.out.println();
		
		// 제네릭 와일드카드
		// - 알 수 없는 타입을 대체하여 사용하는 기호
		// - 주로 타입 제한을 주기 위해서 사용한다.
		//   1) ? super T 	: 해당 클래스부터 상위 클래스를 허용하도록 제한
		//   2) ? extends T : 해당 클래스부터 하위 클래스를 허용하도록 제한
		Box<?> wildCardBox = new Box<>();
		
		Box<?> wBox = box1;
		Box<? extends Number> wbox2 = box2;			// Number 클래스와 하위 클래스 허용
		Box<? super Raichu> wbox3 = monsterBall;	// Raichu 클래스와 상위 클래스 허용
		
		
	}
}