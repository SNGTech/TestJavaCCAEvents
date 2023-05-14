package cout.sngtech.test.controller.services.account;

import cout.sngtech.test.controller.EventController;
import cout.sngtech.test.controller.users.User;
import cout.sngtech.test.data.events.Account;

public class LoginManager {

	User user;
	
	public LoginManager(User user) {
		this.user = user;
	}
	
	public boolean login(ILoginService srv) {
		return srv.login(user);
	}
	
	public void sendUserToController(EventController controller) {
		controller.setUser(user);
	}
}
