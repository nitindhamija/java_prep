package java8.feature.interface_changes;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.Map;
import java.util.OptionalDouble;
import java.util.OptionalInt;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamsExample {

	public static void main(String[] args) {
		List<Detail> details = new ArrayList<>();
		details.add(new Detail());
		details.add(new Detail());
		Stream<String> stream = details.stream().flatMap(detail -> detail.getParts().stream());
		stream.forEach(System.out::println);
		boolean isValid = details.stream().flatMap(detail -> detail.getParts().stream())
				.anyMatch(element -> element.contains("h")); // true
		boolean isValidOne = details.stream().flatMap(detail -> detail.getParts().stream())
				.allMatch(element -> element.contains("h")); // false
		boolean isValidTwo = details.stream().flatMap(detail -> detail.getParts().stream())
				.noneMatch(element -> element.contains("h")); // false
		System.out.println(isValid + "" + isValidOne + "" + isValidTwo);
		String s = details.stream().flatMap(detail -> detail.getParts().stream()).reduce("", (a, b) -> a + b);
		System.out.println(s);
		List<Integer> integers = Arrays.asList(1, 1, 1);
		Integer reduced = integers.stream().reduce(23, (a, b) -> (a + b));
		System.out.println(reduced);
		int vals[] = { 2, 4, 6, 8, 10, 12, 14, 16 };

		int sum = Arrays.stream(vals).sum();
		int sum1 = Arrays.stream(vals).reduce(0, Integer::sum);
		OptionalDouble avg = Arrays.stream(vals).average();

		OptionalInt min = Arrays.stream(vals).min();
		OptionalInt min1 = Arrays.stream(vals).reduce((a, b) -> a < b ? a : b);
		System.out.println(min + " " + min1);

		OptionalInt max = Arrays.stream(vals).max();
		OptionalInt max1 = Arrays.stream(vals).reduce((a, b) -> a > b ? a : b);
		System.out.println(max + " " + max1);
		// OptionalDouble avg1 = Arrays.stream(vals).reduce(0, Integer::sum);

		List<String> sc = details.stream().flatMap(detail -> detail.getParts().stream()).collect(Collectors.toList());
		System.out.println(sc);

		int reducedParallel = Arrays.asList(1, 2, 3).parallelStream() // combiner is called with paraller stream only
				.reduce(10, (a, b) -> a + b, (a, b) -> {
					System.out.println("combiner was called" + a + " " + b);
					return a + b;
				});
		System.out.println(reducedParallel);
		/*
		 * When a stream executes in parallel, the Java runtime splits the stream into
		 * multiple substreams. In such cases, we need to use a function to combine the
		 * results of the substreams into a single one. This is the role of the combiner
		 * – in the above snippet, it's the Integer::sum method reference.
		 */ List<Integer> ages = Arrays.asList(5, 3, 4, 2, 3);
		int computedAges = ages.parallelStream().reduce(0, (a, b) -> a + b, Integer::sum);

		System.out.println(computedAges);

		List<User> users = Arrays.asList(new User("John", 30), new User("Julie", 35));
		int result = users.stream().reduce(0, (partialAgeResult, user) -> partialAgeResult + user.getAge(),
				Integer::sum);
		System.out.println(result);
		List<User> userList = Arrays.asList(new User("John", 30, "delhi"), new User("Julie", 35, "delhi"),
				new User("harvey", 40, "NYK"), new User("DONNA", 35, "NYK"));
		Stream<User> userStream = userList.stream();
		Map<String, List<User>> peopleByCity = userStream.collect(Collectors.groupingBy(User::getCity));
		peopleByCity.forEach((a, b) -> {
			System.out.println("city is " + a);
			b.forEach(u -> System.out.println(u.getName()));
		});
		Map<Integer, Map<String, List<User>>> peopleByStateAndCity = userList.stream()
				.collect(Collectors.groupingBy(User::getAge, Collectors.groupingBy(User::getCity)));
		System.out.println(peopleByStateAndCity);
		peopleByStateAndCity.entrySet().forEach(e -> {
			e.getValue().entrySet().forEach(ei -> {
				ei.getValue().forEach(u -> {
					System.out.println(u.getName() + " " + u.getAge() + " " + u.getCity());
				});
			});
		});
		
		Map<Boolean, List<User>> mapPartioned = userList.stream()
				  .collect(Collectors.partitioningBy(element -> element.getAge() > 31));
		System.out.println(mapPartioned);
		
		double averageage = userList.stream()
				  .collect(Collectors.averagingInt(User::getAge));
		
		int summingInt = userList.stream()
				  .collect(Collectors.summingInt(User::getAge));
		IntSummaryStatistics statistics = userList.stream()
				  .collect(Collectors.summarizingInt(User::getAge));
		
		System.out.println(summingInt + " "+averageage + " "+  statistics );
	}
}
