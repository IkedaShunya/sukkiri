package sukkiri.practice_print12.practice02;

public abstract class Vehicle {
	String name;
	
	public Vehicle(String name) {
		this.name = name;
	}
	
	public abstract void start();
	public abstract void stop();

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
	

}
