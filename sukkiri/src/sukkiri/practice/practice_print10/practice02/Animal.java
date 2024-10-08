package sukkiri.practice.practice_print10.practice02;

public class Animal {
	private String species; 
	
	public Animal(String species) {
		this.species = species;
		
	}
	
	public void makeSound() {
		System.out.println("The animal makes a sound.");
	}

	public String getSpecies() {
		return species;
	}

	public void setSpecies(String species) {
		this.species = species;
	}
	
	

}
