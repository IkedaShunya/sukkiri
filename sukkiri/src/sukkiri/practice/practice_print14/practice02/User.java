package sukkiri.practice.practice_print14.practice02;

public class User {
	String name;
	int age;
	
	public User(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	@Override
	public boolean equals(Object o) {
		if(this == o) {
			return true;
		}
		if(o instanceof User u) {
			if(this.name.equals(u.name) && this.age == u.age) {
				System.out.println("a");
				return true;
			}
		}
		
		return false;
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	

}
