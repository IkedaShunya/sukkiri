package sukkiri.practice.practice_print14.practice06;

public class Main {

	public static void main(String[] args) {
		System.out.println("Total users: "+ User.getUserCount());
		User user1 = new User(1,"Alice");
		User user2 = new User(2,"Bob");
		User user3 = new User(3,"Charlie");
		
		
		System.out.println("----------------------------------");
		user1.displayUserInfo();
		user2.displayUserInfo();
		user3.displayUserInfo();
		System.out.println("----------------------------------");

		
		
		System.out.println("Total users: "+ User.getUserCount());

	}

}
