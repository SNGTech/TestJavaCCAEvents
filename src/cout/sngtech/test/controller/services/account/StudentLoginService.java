package cout.sngtech.test.controller.services.account;

import cout.sngtech.test.controller.EventController;
import cout.sngtech.test.controller.users.User;
import cout.sngtech.test.data.events.Account;

public class StudentLoginService implements ILoginService {
	
	@Override
	public boolean login(User user) {
		Account account = user.account;
		if(account.getEmail().equals("test@gmail.com") && account.getPassword().equals("test")) {
			user.account = account;
			user.userId = "091452350214";
			
			return true;
		}
		
		return false;
	}
}
