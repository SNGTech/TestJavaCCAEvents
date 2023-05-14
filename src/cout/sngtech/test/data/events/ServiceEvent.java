package cout.sngtech.test.data.events;

public class ServiceEvent extends Event {

	public ServiceEvent(String name, String date) {
		super(name, date);
		this.category = Category.SERVICE;
	}
}
