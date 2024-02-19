package Day12.Ex01_Object;
// Object 클래스의 equals 메소드 활용
class Student {
	int stuId;			// 학번
	String stuName;		// 이름
	
	public Student(int stuId, String stuName) {
		this.stuId = stuId;
		this.stuName = stuName;
	}

	@Override
	public String toString() {
		return "Student [stuId=" + stuId + ", stuName=" + stuName + "]";
	}

	//equals()메소드 오버라이딩
	@Override
	public boolean equals(Object obj) {
		// 두 객체가 의미상으로 일치하는지 여부를 true 또는 false로 반환
		if(this == obj) {
			return true;
		}
		
		// null 체크
		// NullPoninterException 발생 가능
		if(obj == null) {
			return false;
		}
		
		// 학번과 학생명이 모두 일치하는 경우
		Student student = (Student) obj;	// 다운 캐스팅
		if(this.stuId == student.stuId && this.stuName.equals(student.stuName)) {
			return true;
		}
		return false;
	}
}

public class ObjectEquals {
	public static void main(String[] args) {
		Student student =new Student(1001,"김조은");
		Student student2 = student;
		Student student3 = new Student(1001, "김조은");
		
		// 학생 1,2 레퍼런스 비교
		if(student == student2) {
			System.out.println("student와 student2의 주소(레퍼런스)가 같음");
		}else {
			System.out.println("student와 student2의 주소(래퍼런스)가 다름");
		}
		System.out.println("====================");
		
		// 학생 1,2 인스턴스 비교
		if(student.equals(student2)) {
			System.out.println("student와 student2는 같음");
		}else {
			System.out.println("student와 student2는 다름");
		}
		
		System.out.println();
		// 학생 1,3 레퍼런스 비교
		if(student == student3) {
			System.out.println("student와 student3의 주소(레퍼런스)가 같음");
		}else {
			System.out.println("student와 student3의 주소(래퍼런스)가 다름");
		}
		System.out.println("====================");
		
		// 학생 1,3 인스턴스 비교
		if(student.equals(student3)) {
			System.out.println("student와 student3는 같음");
		}else {
			System.out.println("student와 student3는 다름");
		}
	}
}