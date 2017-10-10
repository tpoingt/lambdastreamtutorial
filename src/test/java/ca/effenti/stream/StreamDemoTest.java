package ca.effenti.stream;

import org.junit.Test;

import java.util.List;
import java.util.function.Consumer;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static ca.effenti.stream.Sex.FEMALE;
import static ca.effenti.stream.Sex.MALE;
import static org.junit.Assert.assertNotNull;


public class StreamDemoTest {

    List<Person> starkFamily = List.of(
            new Person("Stark", "Rickon", MALE, 11, false),
            new Person("Stark", "Brandon", MALE, 16),
            new Person("Stark", "Arya", FEMALE, 17),
            new Person("Stark", "Sansa", FEMALE, 19),
            new Person("Snow", "Jon", MALE, 22),
            new Person("Stark", "Robb", MALE, 19, false),
            new Person("Stark", "Tony", MALE, 47)
            );


}
