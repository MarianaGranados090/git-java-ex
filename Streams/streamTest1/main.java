import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        List<Person> people = new ArrayList<>();

        people.add(new Person("Jim Notec", 120));
        people.add(new Person("Jeff Bezos", 150));
        people.add(new Person("Bill Gates", 200));

        List<Person> sortedList = people.stream()
                .sorted(Comparator.comparing(person -> person.name))
                .toList();

        List<Person> twoHundredClub = people.stream()
                .filter(person -> person.billions >= 200)
                .toList();

        twoHundredClub.forEach(person -> System.out.println(person.name));
        System.out.println("Sorted list: ");
        sortedList.forEach(person -> System.out.println(person.name));

    }

    static class Person{
        String name;
        int billions;

        public Person(String name, int billions) {
            this.name = name;
            this.billions = billions;
        }
    }
}
