package java8.feature.interface_changes;

public interface java8Interface {
	static String producer() {
	    return "N&F Vehicles";
	}
	default String getOverview() {
	    return "ATV made by " + producer();
	}
	
}
