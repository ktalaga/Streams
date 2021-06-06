import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
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

        int total = Stream.of(1, 2, 3, 4, 5, 6, 7)
                .reduce(0,(sum, num)-> sum += num);

        System.out.println(total);


    }
}
