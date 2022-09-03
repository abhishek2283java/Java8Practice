package optionaldemoWithPerson;

import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

class OptionalScenariosDemo {

    List<Person> people = List.of(
            new Person("Jack", 15),
            //new Person("Jack", 55),
            new Person("Sara", 20),
            new Person("Bob", 20),
            new Person("Paula", 35),
            new Person("Nancy", 40),
            new Person("Bill", 25),
            new Person("Jill", 50),
            //new Person("Tom", 60),
            new Person("Tom", 70)
    );

    @Test
    //Given a list of persons, get the person's age with name as jack
    public void getAgeOfPersonThatExistsInTheList() {
        int age = people.stream()
                .filter(e -> e.getName().equalsIgnoreCase("jack"))
                .findFirst()
                .map(Person::getAge)
                .orElse(0);

        System.out.println("age = " + age);
    }

    @Test
    //Given a list of persons, get the person's age with name as jack
    public void getAgeOfPersonThatDOesNotExistInTheList() {
        int age = people.stream()
                .filter(e -> e.getName().equalsIgnoreCase("jacke"))
                .findFirst()
                .map(Person::getAge)
                .orElse(0);

        System.out.println("age = " + age);
    }

    @Test
    //Given a list of names, get a list of ages
    public void shouldGetListOfAgesForListOfNames() {
        List<String> names = List.of("Jack", "Sara");
        final List<Integer> collect = names.stream()
                .map(Person::findByName)
                .filter(Optional::isPresent)
                .map(Optional::get)
                .map(Person::getAge)
                .collect(toList());
        System.out.println(collect);

        //Using flatMap on Stream of Optionals
        final List<Integer> collect1 = names.stream()
                .map(Person::findByName)
                .flatMap(Optional::stream)
                .map(Person::getAge)
                .collect(toList());

        System.out.println("collect1 = " + collect1);
    }
}
