package cout.sngtech.test.controller;

import cout.sngtech.test.controller.users.User;
import cout.sngtech.test.data.events.Event;
import cout.sngtech.test.data.events.EventCatalogue;
import cout.sngtech.test.data.events.StudentEventStorage;

public class EventController {

	private User user;
	
	// Should store in a data storage class but oh well
	private EventCatalogue catalogue;
	private StudentEventStorage studentEvents;
	
	public EventController() {
		user = null;
		catalogue = new EventCatalogue();
		studentEvents = new StudentEventStorage();
	}
	
	public void confirmEvent(Event e) {
		user.confirmSrv.confirmEvent(e);
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public EventCatalogue getCatalogue() {
		return catalogue;
	}

	public StudentEventStorage getStudentEvents() {
		return studentEvents;
	}
}
