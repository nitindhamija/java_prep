package java8.feature.interface_changes;

import java.io.IOException;
import java.util.Optional;

public class OptionalInterface {

	public static void main(String[] args) throws IOException {
		String value = null;
		String result = "";
		try {
			result = value.toUpperCase();
		} catch (NullPointerException exception) {
			// throw new CustomException();
			throw new IOException(exception);
		}

		value = null;
		Optional<String> valueOpt = Optional.ofNullable(value);
		result = valueOpt.orElseThrow(IOException::new).toUpperCase();
	}
}
