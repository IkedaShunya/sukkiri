package sukkiri.practice.practice_print14.practice05;

public class Animal {
	private static int totalAnimals;
	private String name;
	private int age;
	
	
	public Animal(String name, int age) {
		this.age = age;
		this.name = name;
		Animal.totalAnimals++;
	}
	
	public static int getTotalAnimals() {
		return Animal.totalAnimals;
	}
	
	public void displayInfo() {
		System.out.println("Name:" +this.name);
		System.out.println("Age:" +this.age);
	}

}
