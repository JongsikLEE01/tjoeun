package Day14.Ex02_WildCard;

public class Student extends Person{

	public Student(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Student ["+ this.getName() +"]";
	}

}