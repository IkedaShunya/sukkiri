package comparable.practice.comparable.practice02;

import java.time.LocalDateTime;

public class User implements Comparable<User>{
	private String username;
	private LocalDateTime registrationDate;

	public User(String username, LocalDateTime registrationDate) {
		this.username = username;
		this.registrationDate = registrationDate;
	}




	public String getUsername() {
		return username;
	}




	public void setUsername(String username) {
		this.username = username;
	}




	public LocalDateTime getRegistrationDate() {
		return registrationDate;
	}




	public void setRegistrationDat(LocalDateTime registrationDate) {
		this.registrationDate = registrationDate;
	}



	@Override
	public int compareTo(User user) {
		return this.getRegistrationDate()
				.compareTo(user.getRegistrationDate());

	}




}
