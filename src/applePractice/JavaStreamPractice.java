package applePractice;

import java.util.*;
import java.util.stream.Collectors;

public class JavaStreamPractice {
    static void main() {

        // Find Duplicate Number
        List<Integer> list = Arrays.asList(1, 2, 3, 2, 4, 5, 1, 6);
        HashSet<Integer> set = new HashSet<>();
        Set<Integer> collect = list.stream().filter(n -> !set.add(n)).collect(Collectors.toSet());
        System.out.println(collect);

        // Second Highest
        List<Integer> numbers = Arrays.asList(10, 5, 20, 15, 20);
        Optional<Integer> second = numbers.stream().distinct().sorted(Comparator.reverseOrder()).skip(1).findFirst();
        System.out.println("second highest number " + second.get());

        // find highest number
        Optional<Integer> firstHighest = numbers.stream().sorted(Comparator.reverseOrder()).findFirst();
        System.out.println("first highest number = " + firstHighest.get());

        Optional<Integer> reduce = numbers.stream().distinct().reduce((a, b) -> {
            if (a > b) return a;
            else return b;
        });

        System.out.println("another way of getting highest number = " + reduce.get());

        List<Integer> duplicates = list.stream()
                .collect(Collectors.groupingBy(n -> n, Collectors.counting()))
                .entrySet()
                .stream()
                .filter(e -> e.getValue() > 1)
                .map(Map.Entry::getKey)
                .toList();


        // separate odd and even
        List<Integer> numb = List.of(1, 2, 3, 4, 5, 6, 7, 8);
        Map<Boolean, List<Integer>> partition = numb.stream().filter(Objects::nonNull).collect(Collectors.partitioningBy((n -> n % 2 == 0)));
        System.out.println(" odd number = " + partition.get(false));
        System.out.println(" even number = " + partition.get(true));

    }
}
