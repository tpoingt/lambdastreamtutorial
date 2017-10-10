package ca.effenti.tutorial.lambdastream;

import org.junit.Ignore;
import org.junit.Test;

import java.util.List;
import java.util.stream.Collectors;

import static ca.effenti.tutorial.lambdastream.Origin.GOT;
import static ca.effenti.tutorial.lambdastream.Origin.MARVEL;
import static ca.effenti.tutorial.lambdastream.Sex.FEMALE;
import static ca.effenti.tutorial.lambdastream.Sex.MALE;
import static org.junit.Assert.fail;


public class StreamDemoTest {

    List<Person> starkFamily = List.of(
            new Person("Stark", "Rickon", MALE, GOT, 11, false),
            new Person("Stark", "Brandon", MALE, GOT, 16),
            new Person("Stark", "Arya", FEMALE, GOT, 17),
            new Person("Stark", "Sansa", FEMALE, GOT, 19),
            new Person("Snow", "Jon", MALE, GOT, 22),
            new Person("Stark", "Robb", MALE, GOT, 19, false),
            new Person("Stark", "Tony", MALE, MARVEL, 47)
    );

    @Test
    public void shouldCreateSimplePrintlnLambda() {
        fail("Implement Me !");
    }

    @Test
    public void shouldCreateSimplePrintlnLambdaWithBracket() {
        fail("Implement Me !");
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
    @Ignore
    public void youReallyKnowNothing() {
        starkFamily.stream()
                .map(person -> {
                    System.out.println(person.getFirstname() + " is a Stark !");
                    return person;
                }).findFirst();
    }


    @Test
    public void shouldPrintStarkFamily() {
        fail("Implement Me !");
    }

    @Test
    public void shouldPrintAliveStarkFamily() {
        fail("Implement Me !");
    }

    @Test
    public void shouldPrintAliveStarkFamilyWithReference() {
        fail("Implement Me !");
    }

    @Test
    public void shouldPrintAliveMaleStarkFamilyOneFilter() {
        fail("Implement Me !");
    }

    @Test
    public void shouldPrintAliveMaleStarkFamilyTwoFilters() {
        fail("Implement Me !");
    }

    @Test
    public void shouldPrintStarkFamilyUpperCase() {
        fail("Implement Me !");
    }

    @Test
    public void shouldReturnStarkFamilyFirstNameConcat() {
        fail("Implement Me !");
    }

    @Test
    public void shouldReturnStarkFamilyConcatCollectors() {
        fail("Implement Me !");
    }

    @Test
    public void shouldGetStarkAgeStats() {
        fail("Implement Me !");
    }

    @Test
    public void shouldGroupAliveStarkByOrigin() {
        fail("Implement Me !");
    }

    @Test
    public void shouldGroupAliveStarkFirstNameByOrigin() {
        fail("Implement Me !");
    }
}