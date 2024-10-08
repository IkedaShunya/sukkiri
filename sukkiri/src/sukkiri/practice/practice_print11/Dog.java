package sukkiri.practice.practice_print11;

public class Dog extends Animal{
	
	public Dog(String name) {
		super(name);
	}
	
	@Override
	public void makeSound() {
		System.out.println(getName() + " says Woof!");
	}
}
