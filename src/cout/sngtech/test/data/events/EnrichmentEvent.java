package cout.sngtech.test.data.events;

public class EnrichmentEvent extends Event {

	public EnrichmentEvent(String name, String date) {
		super(name, date);
		this.category = Category.ENRICHMENT;
	}
}
