package Day05.Class;

// 자식클래스 상속(extends) 부모클래스{ }
public class Raichu extends Pikachu{
	//부모 생성자 그대로 만들기 == 단축키 : alt + shift + S → C
	public Raichu(int energy, String type) {
		super(energy, type);
	}
	
	public Raichu() {
		// 서브클래스에서 부모클래스 생성자 호출
		super(200,"메가전기");
	}
	
	// 메소드 오버 라이딩 : 부모 클래스에서 정의한 메소드를 자식 클래스에서 재정의,
	//				부모 클래스의 메소드를 무시하고 자식 클래스의 메소드를 우선 실행
	@Override  // 어노테이션(기능 활성화, 기능 명시)
	public String aAttack() {
		// TODO Auto-generated method stub
		return "백만볼트";
	}
	@Override
	public String bAttack() {
		// TODO Auto-generated method stub
		return "볼트체인지";
	}
	public String cAttack() {
		return "아이언테일";
	}
}