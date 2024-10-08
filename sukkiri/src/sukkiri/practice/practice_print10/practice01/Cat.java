package sukkiri.practice.practice_print10.practice01;

public class Cat extends Animal{
	String name;
	String cry;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCry() {
		return cry;
	}

	public void setCry(String cry) {
		this.cry = cry;
	}

	public Cat(String name,String cry) {
		super("猫");
		this.name = name;
		this.cry = cry;
		
	}
	
	@Override
	public void showProfile() {
		System.out.println("-------------------");
		System.out.println("カテゴリは" +livingBeings);
		System.out.println("種は" + getKind());
		System.out.println("名前は" + getName());
		System.out.println("鳴き声は" + getCry());
	}
}
