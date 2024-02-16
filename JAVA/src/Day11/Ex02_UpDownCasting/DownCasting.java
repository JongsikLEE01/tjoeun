package Day11.Ex02_UpDownCasting;

public class DownCasting {
	public static void main(String[] args) {
		// 다운 캐스팅 (강제 형 변환)
		// 전제 조건 : 업 캐스팅
		// - 다운 캐스팅은 업 캐스팅된 부모 객체를 자식 객체로 변환하는것
		
		// 업캐스팅
		Person person = new Student("김조은", 20,1,"컴퓨터공학과");
//		Person person = new Person("김조은", 20); -> ClassCastException 발생
		
		System.out.println(person);
		System.out.println(person.work());
		
		// 다운캐스팅
		Student student = (Student) person;
		
		System.out.println(student);
		System.out.println(student.work());
		
		System.out.println("grade : "+student.grade);
		System.out.println("grade : "+student.major);
	}
}