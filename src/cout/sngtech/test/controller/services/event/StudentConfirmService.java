package cout.sngtech.test.controller.services.event;

import cout.sngtech.test.controller.EventController;
import cout.sngtech.test.data.events.Event;
import cout.sngtech.test.data.events.StudentEventStorage;

public class StudentConfirmService implements IConfirmService {

	EventController controller;
	
	public StudentConfirmService(EventController controller) {
		this.controller = controller;
	}
	
	@Override
	public void confirmEvent(Event e) {
		controller.getStudentEvents().addEvent(e);
	}
}
