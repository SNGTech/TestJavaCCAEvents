package cout.sngtech.test.controller.users;

import cout.sngtech.test.controller.EventController;
import cout.sngtech.test.controller.services.event.IConfirmService;
import cout.sngtech.test.data.events.Account;

public abstract class User {

	public Account account;
	public String userId;
	
	EventController controller;
	public IConfirmService confirmSrv;
	
	public User(EventController controller, Account account) {
		this.account = account;
		this.controller = controller;
		this.userId = null;
	}
}
