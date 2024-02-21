package Day14.Ex02_WildCard;
/*
 * 제네릭 기법으로 클래스 정의
 * - 클래스 뒤에 타입매개변수 <T>,<E>,<K> 등을 작성
 * 	 클래스의 변수나 메소드의 타입을 클래스를 정의할때가 아닌 객체를 생성할때 확정하는 클래스 정의 기법
 */
public class Box <T>{
	T t;

	public T getT() {
		return t;
	}

	public void setT(T t) {
		this.t = t;
	}
}