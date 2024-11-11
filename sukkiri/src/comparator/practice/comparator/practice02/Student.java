package comparator.practice.comparator.practice02;

public class Student {
	private String name;
	private int score;
	private int age;

	public Student(String name, int score, int age) {
		this.name = name;
		this.score = score;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}


	@Override
	public String toString() {
		String str = "Student: name=" +getName() +
				"  score=" +getScore() + "  age="  +getAge(); 
		return str;
	}
}
