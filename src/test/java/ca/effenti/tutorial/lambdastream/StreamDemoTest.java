package ca.effenti.tutorial.lambdastream;

import org.junit.Ignore;
import org.junit.Test;

import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Stream;

import static ca.effenti.tutorial.lambdastream.Sex.FEMALE;
import static ca.effenti.tutorial.lambdastream.Sex.MALE;
import static org.junit.Assert.fail;


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
    public void shouldCreateSimplePrintlnLambda() {
        Consumer<Person> starkConsumer = aStark -> System.out.println(aStark.getFirstname() + " is a stark !");
        starkConsumer.accept(starkFamily.get(0));
    }

    @Test
    public void shouldCreateSimplePrintlnLambdaWithBracket() {
        Consumer<Person> starkConsumer = aStark -> {
            System.out.println(aStark.getFirstname() + " is a stark !");
        };
        starkConsumer.accept(starkFamily.get(0));
    }


    @Test
    @Ignore
    public void youKnowNothing() {
        starkFamily.stream()
                .map(name -> {
                    System.out.println(name + " is a Stark !");
                    return name;
                });

    }

    @Test
    public void youReallyKnowNothing(){
        starkFamily.stream()
                .map(person -> {
                    System.out.println(person.getFirstname() + " is a Stark !");
                    return person;
                }).findFirst();
    }


    @Test
    public void shouldPrintStarkFamily() {
        starkFamily.stream().forEach(System.out::println);
    }
}