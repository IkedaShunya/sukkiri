package comparable.practice.comparable.practice02;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
	public static void main(String[] args) {
		List<User> userList = new ArrayList<>();
		LocalDateTime targetDate = LocalDateTime.of(2023, 3, 15, 10, 30);
		userList.add(new User("Alice",targetDate));
		targetDate = LocalDateTime.of(2023, 3, 14, 15, 45);
		userList.add(new User("Bob",targetDate));
		targetDate = LocalDateTime.of(2023, 3, 16, 8, 0);
		userList.add(new User("Charlie",targetDate));
		
		Collections.sort(userList); 
		for (User user : userList) { // ソートされたリストを出力
			System.out.printf("Username:%-7s Registration Date:%s\n",
					user.getUsername(),user.getRegistrationDate());
			}

	}
}
