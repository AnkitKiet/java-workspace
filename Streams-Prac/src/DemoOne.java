import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class DemoOne {

	public static void main(String[] args) {
		//Filter
		List<String> strings = Arrays.asList("abc", "", "bc", "efg", "abcd", "", "jkl");
		List<String> filteredList = strings.stream().filter(string -> !string.isEmpty()).collect(Collectors.toList());
		filteredList.stream().forEach(System.out::print);
		String filteredStringSeprator = strings.stream().filter(string -> !string.isEmpty())
				.collect(Collectors.joining(","));
		System.out.println(filteredStringSeprator);

		// IntSummaryStatistics
		List<Integer> listNumber = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
		IntSummaryStatistics intSummaryStatistics = listNumber.stream().mapToInt(x -> x).summaryStatistics();
		System.out.println("Average-> " + intSummaryStatistics.getAverage());
		System.out.println("Max Elem-> " + intSummaryStatistics.getMax());

		// Slice
		System.out.println("-----------SLICING-------------");
		Stream<Integer> streamSliced = listNumber.stream().skip(2).limit(7);
		List<Integer> listSliced = listNumber.subList(2, 8);

		streamSliced.forEach(System.out::println);
	}

}
