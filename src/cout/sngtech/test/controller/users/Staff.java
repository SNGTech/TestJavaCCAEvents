package cout.sngtech.test.controller.users;

import cout.sngtech.test.controller.EventController;
import cout.sngtech.test.controller.services.event.StaffConfirmService;
import cout.sngtech.test.data.events.Account;

public class Staff extends User {
	
	public Staff(EventController controller, Account account) {
		super(controller, account);
		this.confirmSrv = new StaffConfirmService(this.controller);
	}
}
