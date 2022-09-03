package optionaldemoWithPerson;

import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.function.Function;

import static java.util.Optional.ofNullable;
import static java.util.stream.Collectors.toMap;

public class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public static Optional<Person> findByName(String name) {
        Person person = getPersonsMap().get(name);
        return ofNullable(person);
    }

    private static Map<String, Person> getPersonsMap() {
        List<Person> people = List.of(
                new Person("Jack", 15),
                new Person("Sara", 20),
                new Person("Bob", 20),
                new Person("Paula", 35),
                new Person("Nancy", 40),
                new Person("Bill", 25),
                new Person("Jill", 50),
                //new Person("Tom", 60),
                new Person("Tom", 70)
        );

        return people.stream()
                .collect(toMap(Person::getName, Function.identity()));
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
