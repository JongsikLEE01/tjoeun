package Day14.Ex02_WildCard;

public class Worker extends Person{

	public Worker(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Worker ["+ this.getName() +"]";
	}
}