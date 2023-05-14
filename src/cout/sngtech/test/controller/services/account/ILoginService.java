package cout.sngtech.test.controller.services.account;

import cout.sngtech.test.controller.users.User;
import cout.sngtech.test.data.events.Account;

public interface ILoginService {

	public boolean login(User user);
}
