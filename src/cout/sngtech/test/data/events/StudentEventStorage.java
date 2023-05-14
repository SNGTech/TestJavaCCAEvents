package cout.sngtech.test.data.events;

import java.util.Vector;

public class StudentEventStorage implements IEventStorage {

	private Vector<Event> events;
	
	public StudentEventStorage() {
		this.events = new Vector<>();
	}

	public Vector<Event> getEvents() {
		return events;
	}

	public void addEvent(Event e) {
		events.add(e);
		System.out.println(events.toString());
	}
}
