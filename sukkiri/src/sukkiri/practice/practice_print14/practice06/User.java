package sukkiri.practice.practice_print14.practice06;

public class User {
	private static int userCount =0;
	private int id;
	private String userName;
	
	public User(int id,String userName) {
		this.id =id;
		this.userName = userName;
		userCount++;
	}
	
	public static int getUserCount() {
		return User.userCount;
	}
	
	public void displayUserInfo() {
		System.out.println("User ID:" +this.id);
		System.out.println("Username:" +this.userName);
		
	}
 
}
