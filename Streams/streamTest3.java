import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Alice", "Bob", "Charlie");
        names.stream()
                .filter(name -> name.length() > 3)
                .map(String::toUpperCase)
                .forEach(System.out::println);

        //counting elements matching a condition
        long count = names.stream()
                .filter(name -> name.length() > 3)
                .count();
        System.out.println(count);

        //finding the longest name
        Optional<String> longest = names.stream()
                .max(Comparator.comparingInt(String::length));
                     //   .map(String::toUpperCase);
        longest.ifPresent(System.out::println);

        //joining strings
        String joined = names.stream()
                .filter(name -> name.length() > 3)
                .map(String::toUpperCase)
                .collect(Collectors.joining(", "));
        System.out.println(joined);



    }
}
