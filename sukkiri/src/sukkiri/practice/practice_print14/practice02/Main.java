package sukkiri.practice.practice_print14.practice02;

public class Main {
	public static void main(String[] args) {
		User user1 = new User("Alice", 25);
		User user2 = new User("Bob", 30);
		User user3 = new User("Alice", 25);
		
		System.out.println("user1 equals user2:"+user1.equals(user2));
		System.out.println("user1 equals user3:"+user1.equals(user3));
		
	}

}
