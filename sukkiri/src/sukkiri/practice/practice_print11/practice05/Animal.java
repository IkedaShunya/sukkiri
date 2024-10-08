package sukkiri.practice.practice_print11.practice05;

public class Animal extends Mammal implements LivingBeing{
	public Animal(String name) {
		super(name);
	}
	
	
	@Override
	public void eat() {
		System.out.println(getName()+ "is eating.");
	};
	
	@Override
	public void breathe() {
		System.out.println(getName()+ " is breathing.");
	};
	
	@Override
	public void makeSound() {
		System.out.println(getName()+ " makes a sound.");
	};
	
	
}
