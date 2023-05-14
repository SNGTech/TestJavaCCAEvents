package cout.sngtech.test.data.events;

import java.util.Vector;

public class EventCatalogue implements IEventStorage {

	private Vector<Event> events;
	
	public EventCatalogue() {
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
