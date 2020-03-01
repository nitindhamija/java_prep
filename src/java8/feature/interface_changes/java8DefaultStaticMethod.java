package java8.feature.interface_changes;

public interface java8DefaultStaticMethod extends java8Interface{

	default String print() {
	    return "interface 1"; 
	}
	
}
