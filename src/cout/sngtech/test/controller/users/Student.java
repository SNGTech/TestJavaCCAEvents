package cout.sngtech.test.controller.users;

import cout.sngtech.test.controller.EventController;
import cout.sngtech.test.controller.services.event.StudentConfirmService;
import cout.sngtech.test.data.events.Account;

public class Student extends User {
	
	public Student(EventController controller, Account account) {
		super(controller, account);
		this.confirmSrv = new StudentConfirmService(this.controller);
	}
}
