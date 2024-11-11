package sukkiri.practice.practice_print12.practice02;

public class Animal {
	private String name;
	private int age;
	
	public Animal(String name, int age) {
		setAge(age);
		setName(name);
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
	
	public void showProfile() {
		System.out.printf("名前は%sで、%d歳です。",getName(),getAge());
	}
	
	public void speak() {
		System.out.println(".........");
		
	}
	

}
