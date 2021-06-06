import java.util.Arrays;
import java.util.List;
import java.util.OptionalDouble;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Streams {

    public static void main(String[] args){
        List<String> myList = Arrays.asList("amanda", "alex", "sandy", "alina", "sky");
//
//        myList.stream().map(String::toUpperCase).forEach(result -> System.out.println(result));
//        List<String> output = Stream.of("amanda", "alex", "sandy", "alina", "sky")
//                .map(String::toUpperCase)
//                .collect(Collectors.toList());
//
//        System.out.println(output);

//        int total = Stream.of(1, 2, 3, 4, 5, 6, 7)
//                .reduce(0,(sum, num)-> sum += num);
//
//        System.out.println(total);

//        Stream.of(1, 2, 3, 4, 5, 6, 7)
//                .map((num)-> num *2)
//                .forEach(System.out::println);

//        Stream.of(1,2,3,4,5,6,7)
//                .filter((num) -> num %2 == 0)
//                .forEach(System.out::println);

//        Stream.of(99, 3, 61, 20, 83, 12, 2, 18, 10)
//                .sorted()
//                .forEach(System.out::println);
//        Stream.of(99, 3, 61, 20, 83, 12, 2, 18, 10)
//                .sorted()
//                .limit(4)
//                .forEach(System.out::println);

//        OptionalDouble average = Stream.of(99, 3, 61, 20, 83, 12, 2, 18, 10).mapToInt((n) -> n).average();
//
//        System.out.println(average);
//        // average terminates

//        int result = Stream.of(99, 3, 61, 20, 83, 12, 2, 18, 10)
//                .mapToInt((n) -> n)
//                .max()
//                .getAsInt();
//
//        System.out.println(result);

//        int result = Stream.of(99, 3, 61, 20, 83, 12, 2, 18, 10)
//                .mapToInt((n) -> n)
//                .min()
//                .getAsInt();
//        System.out.println(result);

//        int out = IntStream.of(99, 3, 61, 20, 83, 12, 2, 18, 10)
//                .peek(n -> System.out.printf("original: %d%n", n))
//                .map(n -> n * 2)
//                .peek(n -> System.out.printf("doubled : %d%n", n))
//                .filter(n -> n % 3 == 0)
//                .peek(n -> System.out.printf("filtered: %d%n", n))
//                .sum();
//
//        System.out.println(out);

        IntStream.range(1, 5)
                .mapToObj(num -> "number: " + num)
                .forEach(System.out::println);

    }
}
