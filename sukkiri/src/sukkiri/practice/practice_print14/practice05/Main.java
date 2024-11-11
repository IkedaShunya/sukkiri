package sukkiri.practice.practice_print14.practice05;

public class Main {
	public static void main(String[] args) {
		System.out.println("Total animals:"+ Animal.getTotalAnimals());
		System.out.println("-----------------------------");
		
		Animal dog = new Animal("Dog", 3);
		Animal cat = new Animal("Cat", 2);
		
		dog.displayInfo();
		cat.displayInfo();
		
		
		
		System.out.println("-----------------------------");

		
		System.out.println("Total animals:"+ Animal.getTotalAnimals());

		
	}

}
