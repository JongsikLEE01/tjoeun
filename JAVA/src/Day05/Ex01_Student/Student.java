package Day05.Ex01_Student;

public class Student {
	// 학생의 속성(이름, 나이, 학번, 전공)
	// 학생의 행동(공부하기, 성적 평균 구하기)

	// 변수 선언
	String name;
	int age;
	String stdNo;
	String major;
	
	// 기본 생성자
	public Student(){
		this("이름없음", 1, "0000000", "없음");
	}
	// 매개 변수가 있는 생성자
	public Student(String name, int age, String stdNo, String major) {
		this.name = name;
		this.age = age;
		this.stdNo = stdNo;
		this.major = major;
	}
	
	// 메소드
	// 1. 공부하기
	public void study(String subject) {
		System.out.println(subject + "을(를) 공부합니다.");
		// void = 반환 타입 없음 -> return 생략 가능
	}
	// 2. 성적 평균 구하기
	public double getAvg(int score1,int score2) {
		double avg = 0.0;
		avg = (double)(score1 + score2) / 2;
		return avg;
	}
	// method over-loading
	public double getAvg(int score1,int score2, int score3) {
		double avg = 0.0;
		avg = (double)(score1 + score2) / 3;
		return avg;
	}
	// 배열을 이용해 n개의 성적의 평균을 계산
	public double getAvg(int[] scores) {
		double avg = 0.0;
		// 합계 저장
		int hap = 0;
		//for(int i : scores)
		//	hap += i;
		
		for (int i = 0; i <= scores.length; i++) {
			hap += i;
		}
		// 평균
		avg = (double) hap / scores.length;
		return avg;
	}
}