package cout.sngtech.test.data.events;

import java.util.Vector;

public interface IEventStorage {

	public Vector<Event> getEvents();

	public void addEvent(Event e);
}
