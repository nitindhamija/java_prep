package java8.feature.interface_changes;

import java.util.ArrayList;
import java.util.List;

public class Detail {
List<String> parts;

public  Detail() {
	parts=new ArrayList<>();
	parts.add("abc");
	parts.add("def");
	parts.add("ghi");
	}

public List<String> getParts() {
	return parts;
}

public void setParts(List<String> parts) {
	this.parts = parts;
}

}
