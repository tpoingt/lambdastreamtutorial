package java.ca.effenti.tutorial.lambdastream;

import ca.effenti.tutorial.lambdastream.Person;
import org.junit.Test;

import java.util.List;
import java.util.stream.Stream;

import static ca.effenti.tutorial.lambdastream.Sex.FEMALE;
import static ca.effenti.tutorial.lambdastream.Sex.MALE;


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
    public void youKnowNothing(){
        Stream.of("Rickon", "Bran", "Arya", "Sansa", "Jon", "??")
                .map(name -> {
                    System.out.println(name + " is a Stark !");
                    return name;
                });

    }

}
