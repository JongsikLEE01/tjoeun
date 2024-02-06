package Day05.Ex01_Student;

public class StudentEx {
	public static void main(String[] args) {
		Student student =new Student();
		
		// student 변수에 접근해 값을 지정하기.
		student.name = "홍길동";
		student.age = 22;
		student.major = "Java";
		student.stdNo = "T000001";
		int scores[] = {100,80,90,50,75}; // 학생 1의 성적
		
		System.out.println("========= 학생1 =========");
		System.out.println("학생1 - 이름 : "+student.name);
		System.out.println("학생1 - 나이 : "+student.age);
		System.out.println("학생1 - 전공 : "+student.major);
		System.out.println("학생1 - 학번 : "+student.stdNo);
		student.study("자바 프로그래밍");
		System.out.println("학생1 - 중간고사 점수 " + student.getAvg(100,90));
		System.out.println("학생1 - 기말고사 점수 " + student.getAvg(100,85,70));	
		System.out.println("학생1 - 최종 점수 " + student.getAvg(scores));	
		
		// student2 객체 생성, 자신의 이름, 나이(20), 전공, 학번(T100000)을 입력
		Student student2 =new Student("이종식", 20,"T000002", "컴퓨터공학");
		int scores2[] = {55,80,60,35,90}; // 학생 2의 성적
		System.out.println("========= 학생2 =========");
		System.out.println("학생2 - 이름 : "+student2.name);
		System.out.println("학생2 - 나이 : "+student2.age);
		System.out.println("학생2 - 전공 : "+student2.major);
		System.out.println("학생2 - 학번 : "+student2.stdNo);
		student2.study("음운론");
		System.out.println("학생2 - 중간고사 점수 " + student2.getAvg(100,90));
		System.out.println("학생2 - 기말고사 점수 " + student2.getAvg(100,85,70));	
		System.out.println("학생2 - 최종 점수 " + student2.getAvg(scores2));
	}
}