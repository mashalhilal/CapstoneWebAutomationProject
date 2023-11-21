package KiteClass.CapstoneWebAutomationProjectMashal;

import java.util.ArrayList;

public class LoginPage {
	
	
	ArrayList <LoginApplication>LoginWeb =new ArrayList<>();
	
	public boolean LogginIn(LoginApplication newurl) {
		return LoginWeb.add(newurl);
	}

	public boolean DoesItLogin (LoginApplication newurl) {
		boolean Exist = false;
		
		if (LoginWeb.contains(newurl)) {
			Exist =true;
		}
		return Exist;
	}
}
