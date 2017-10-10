package ca.effenti.tutorial.lambdastream;

import org.junit.Test;

import java.util.List;
import java.util.function.Consumer;

import static ca.effenti.tutorial.lambdastream.Sex.FEMALE;
import static ca.effenti.tutorial.lambdastream.Sex.MALE;
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
    @Test
    public void shouldCreateSimplePrintlnLambda(){
        Consumer<Person> printlnConsumer = person -> System.out.println(person + " is a Stark !");
        assertNotNull(printlnConsumer);
        printlnConsumer.accept(starkFamily.get(0));
    }

    @Test
    public void shouldCreateSimplePrintlnLambdaWithBracket(){
        Consumer<Person> printlnConsumer = person -> {
            System.out.println(person + " is a Stark !");
        };
        assertNotNull(printlnConsumer);
        printlnConsumer.accept(starkFamily.get(0));

    }


}
