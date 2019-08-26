package abc;

public class player {
	String name;
	int age;
	double runs;
	public player() {
		super();
	}
	public player(String name, int age, double runs) {
		super();
		this.name = name;
		this.age = age;
		this.runs = runs;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public double getRuns() {
		return runs;
	}
	public void setRuns(double runs) {
		this.runs = runs;
	}
	@Override
	public String toString() {
		return "player [name=" + name + ", age=" + age + ", runs=" + runs + "]";
	}
	

}
