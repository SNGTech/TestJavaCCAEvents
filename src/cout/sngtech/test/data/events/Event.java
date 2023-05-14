package cout.sngtech.test.data.events;

public abstract class Event {

	public String name;
	public String date;
	public Category category;
	
	public Event(String name, String date) {
		this.name = name;
		this.date = date;
		this.category = null;
	}
}
