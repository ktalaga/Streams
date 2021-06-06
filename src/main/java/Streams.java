import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Streams {

    public static void main(String[] args){
        List<String> myList = Arrays.asList("amanda", "alex", "sandy", "alina", "sky");
//
//        myList.stream().map(String::toUpperCase).forEach(result -> System.out.println(result));
        List<String> output = Stream.of("amanda", "alex", "sandy", "alina", "sky")
                .map(String::toUpperCase)
                .collect(Collectors.toList());

        System.out.println(output);


    }
}
