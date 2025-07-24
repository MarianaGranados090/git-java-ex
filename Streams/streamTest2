import java.io.IOException;
import java.lang.reflect.Array;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        List<String> nums = List.of("one", "two", "three", "four");

        nums
                .stream()
                //.map(String::toUpperCase)
                .map(String::length)
                .forEach(System.out::println);

        record Car(String make, String model){}
        Stream.of(new Car("Ford", "Bronco"), new Car("Tesla", "3"))
                .filter(c -> "Tesla".equals(c.make))
                .forEach(System.out::println);

        IntStream.range(1, 101)
                .forEach(System.out::println);

        IntStream.rangeClosed(1, 5) //intstream, object itself
                .mapToObj(String::valueOf)
                .map(s -> s.concat("-"))
                .forEach(System.out::print);

        //loading data from a file

        try {
            Files.lines(Path.of("C:\\Users\\mgranadosgonzalez\\IdeaProjects\\streamtest1\\src\\names.txt"))
                    //.sorted(Comparator.comparing())
                    .forEach(System.out::println);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        //creating a Stream from a collection

        //creates a list of string objects containing the
        //elements a, b, c

        //Arrays.asList is a utility method that converts
        // an array into a fixed-size list.
        List<String> list = Arrays.asList("a","b", "c");

        //then we create a Stream from the list:
        //note: the stream() method is available on all
        //Java collection types - list, set,..
        Stream<String> stream = list.stream();
        //it returns a sequential stream of the collection's
        //elements, which can be processed using stream operations-
        //filter, map, collect...

        //Creating a stream from an array
        String[] array1 = {"a", "b", "c"};
        Stream<String> stream1 = Arrays.stream(array1);

        //Operations on streams:
        //filter-select elements based on a condition
        //map-transform elements
        //sorted-sort elements

        //filter example
        List<Integer> numbers = Arrays.asList(1,2,3,4,5);
        List<Integer> evenNumbers = numbers.stream()
                .filter(n -> n % 2 == 0)
                .toList();

        //terminal operations
        //These produce a result or side-effect and close
        //the stream
        //collect: converts the stream into a collection
        //forEach: Perform an action for each element
        //reduce: Aggregate elements

        numbers.stream().forEach(System.out::println);

        //example: filtering and mapping
        List<String> names = Arrays.asList("Alice", "Bob", "Charlie");
        List<String> upperNames = names.stream()
                .filter(name -> name.length() > 3)
                .map(String::toUpperCase)
                //.forEach(System.out::println);
        // .toList();
                .toList();
        System.out.println(upperNames);


    }
}
