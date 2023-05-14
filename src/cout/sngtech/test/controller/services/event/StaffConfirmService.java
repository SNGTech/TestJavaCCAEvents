package cout.sngtech.test.controller.services.event;

import cout.sngtech.test.controller.EventController;
import cout.sngtech.test.data.events.Event;
import cout.sngtech.test.data.events.EventCatalogue;

public class StaffConfirmService implements IConfirmService {

	EventController controller;
	
	public StaffConfirmService(EventController controller) {
		this.controller = controller;
	}
	
	@Override
	public void confirmEvent(Event e) {
		controller.getCatalogue().addEvent(e);
	}
}
