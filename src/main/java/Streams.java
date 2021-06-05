import java.util.Arrays;
import java.util.List;

public class Streams {

    public static void main(String[] args){
        List<String> myList = Arrays.asList("amanda", "alex", "sandy", "alina", "sky");

        myList.stream().map(String::toUpperCase).forEach(result -> System.out.println(result));
    }
}
