package sukkiri.practice.practice_print10.practice02;

public class Dog extends Mammal{
	private String breeed;
	
	//下記変え
	public Dog(String breed, boolean hasFur) {
		super("Dog",hasFur);
		this.breeed = breed;
		
		
	}
	
	public void wagTail() {
		System.out.println("The dog wags its tail.");
	}
	
	@Override
	public void makeSound() {
		System.out.println("The dog barks.");
	}

	public String getBreeed() {
		return breeed;
	}

	public void setBreeed(String breeed) {
		this.breeed = breeed;
	}
	
	
	
	
	
}
