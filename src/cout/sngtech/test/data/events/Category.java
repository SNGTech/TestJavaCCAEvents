package cout.sngtech.test.data.events;

public enum Category {
	SERVICE("Service"),
	ENRICHMENT("Enrichment");
	
	private final String label;
	
	private Category(String label) {
		this.label = label;
	}
	
	public String label() {
		return this.label;
	}
}
