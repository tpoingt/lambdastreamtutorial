package ca.effenti.tutorial.lambdastream;

import java.util.Objects;

public class Person {

    private final String lastname;
    private final String firstname;
    private final Sex sex;
    private int age;

    private boolean alive = true;

    public Person(String lastname, String firstname, Sex sex, int age) {
        this.lastname = lastname;
        this.firstname = firstname;
        this.sex = sex;
        this.age = age;
    }

    public Person(String lastname, String firstname, Sex sex, int age, boolean alive) {
        this.lastname = lastname;
        this.firstname = firstname;
        this.sex = sex;
        this.age = age;
        this.alive = alive;
    }

    public String getLastname() {
        return lastname;
    }

    public String getFirstname() {
        return firstname;
    }

    public void kill(){
        alive = Boolean.FALSE;
    }

    public void reborned(){
        alive = Boolean.TRUE;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return Objects.equals(lastname, person.lastname) &&
                Objects.equals(firstname, person.firstname);
    }

    @Override
    public int hashCode() {
        return Objects.hash(lastname, firstname);
    }

    public boolean isAlive() {
        return alive;
    }

    @Override
    public String toString() {
        return "Person{" +
                "lastname='" + lastname + '\'' +
                ", firstname='" + firstname + '\'' +
                ", alive=" + alive +
                '}';
    }

    public Sex getSex() {
        return sex;
    }

    public int getAge() {
        return age;
    }
}
