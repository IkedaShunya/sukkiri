package sukkiri.practice.practice_print12.practice02;

public class Cat extends Animal{
	private int weight;
	
	public Cat(String name,int age,int weight) {
		super(name,age);
		setWeight(weight);
	
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}
	
	@Override
	public void showProfile() {
		System.out.printf("名前は%sで、%d歳、体重は%dキログラムです。",getName(),getAge(),getWeight());
	}
	
	
	public void sleep() {
		System.out.println("スースー");
	}
	
	@Override
	public void speak() {
		System.out.println("にゃーにゃー");
	}
	

}
