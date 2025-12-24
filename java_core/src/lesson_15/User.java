package lesson_15;

import java.util.Objects;

public class User {
	private String username;
	private String password;

	User(String username, String password) {
		this.username = username;
		this.password = password;
	}

	@Override
	public boolean equals(Object obj) {

		User user = (User) obj;

		return this.password.equals(user.password);
	}

	@Override
	public int hashCode() {
		return Objects.hash(username, password);
	}

}
