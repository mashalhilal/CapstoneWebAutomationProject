package KiteClass.CapstoneWebAutomationProjectMashal;

public class LoginApplication {
	private String Url;
	private String Email;
	private String Password;
	private String Login;

	public LoginApplication(String url, String email, String password, String login) {

		super();
		Url= url;
		Email = email;
		Password =password;
		Login = login;
	}

	public String getUrl() {
		return Url;
	}

	public void setUrl(String url) {
		Url = url;

	}

	public String getEmail() {
		return Email;
	}

	public void setEmail(String email) {
		Email = email;
	}
	public String getPassword() {
		return Password;
	}

	public void setPassword(String password) {
		Password =password;
	}

	public String getLogin() {
		return Login;
	}

	public void setLogin(String login) {
		Login = login;

	}
}


