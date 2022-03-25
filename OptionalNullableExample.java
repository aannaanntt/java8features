package optional;

import java.util.Optional;

public class OptionalNullableExample {
	public static Optional<String> ofNullable() {
		return Optional.ofNullable(null);
	}
	
	public static Optional<String> ofNull() {
		return Optional.of("Hello");
	}
	
	
	public static Optional<String> ofEmpty() {
		return Optional.empty();
	}

	public static void main(String[] args) {
		System.out.println(ofNullable().isPresent());
		System.out.println(ofNull());
		System.out.println(ofEmpty());
	}
}
