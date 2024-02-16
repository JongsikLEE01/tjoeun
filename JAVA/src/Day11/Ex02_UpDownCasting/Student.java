package Day11.Ex02_UpDownCasting;

public class Student extends Person{
	int grade;
	String major;
	
	// getter, setter
	public int getGrade() {
		return grade;
	}
	public void setGrade(int grade) {
		this.grade = grade;
	}
	public String getMajor() {
		return major;
	}
	public void setMajor(String major) {
		this.major = major;
	}
	
	// 생성자
	public Student(String name, int age, int grade, String major) {
		super(name, age);
		this.grade = grade;
		this.major = major;
	}
	public Student(String name, int age) {
		this("이름없음",1,1,"없음");
	}
	
	// 오버라이딩
	@Override
	public String work() {
		// TODO Auto-generated method stub
		return "공부하는 중...";
	}
	
	//toString
	@Override
	public String toString() {
		return "Student [grade=" + grade + ", major=" + major + "]";
	}
}