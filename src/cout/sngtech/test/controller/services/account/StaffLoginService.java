package cout.sngtech.test.controller.services.account;

import cout.sngtech.test.controller.users.User;
import cout.sngtech.test.data.events.Account;

public class StaffLoginService implements ILoginService {
	
	@Override
	public boolean login(User user) {
		Account account = user.account;
		if(account.getEmail().equals("staff@gmail.com") && account.getPassword().equals("staff")) {
			user.account = account;
			user.userId = "S91452350214";
			
			return true;
		}
		
		return false;
	}
}
