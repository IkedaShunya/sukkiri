package sukkiri.practice.practice_print11.practice05;

public abstract class Mammal {
	String name;
	
	public Mammal(String name) {
		this.name = name;
	}
	
	public abstract void makeSound();

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	

}
