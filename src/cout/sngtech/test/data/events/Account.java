package cout.sngtech.test.data.events;

public class Account {

	private String username;
	private String password;
	private String email;
	
	public Account(String username, String email, String password) {
		this.setUsername(username);
		this.setPassword(password);
		this.setEmail(email);
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
}
