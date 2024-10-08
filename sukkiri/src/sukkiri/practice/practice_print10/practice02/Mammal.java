package sukkiri.practice.practice_print10.practice02;

public class Mammal extends Animal{
	private boolean hasFur;
	
	public Mammal(String species, boolean hasFur) {
		super(species);
		this.hasFur = hasFur;
		
	}
	
	public void giveBirth() {
		System.out.println("The mammal gives birth to live young."); 
	}

	public boolean isHasFur() {
		return hasFur;
	}

	public void setHasFur(boolean hasFur) {
		this.hasFur = hasFur;
	}
	
	
	
}
