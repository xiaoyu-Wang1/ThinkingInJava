package jdk8.social;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

/**
 * Created by yuquanwang on 18-8-27.
 */
public class Person {

    public enum Sex {
        MALE, FEMALE
    }

    String name;
    LocalDate birthday;
    Sex gender;
    String emailAddress;
    int age;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getBirthday() {
        return birthday;
    }

    public void setBirthday(LocalDate birthday) {
        this.birthday = birthday;
    }

    public Sex getGender() {
        return gender;
    }

    public void setGender(Sex gender) {
        this.gender = gender;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public Person(String name, LocalDate birthday, Sex gender, String emailAddress, int age) {
        this.name = name;
        this.birthday = birthday;
        this.gender = gender;
        this.emailAddress = emailAddress;
        this.age = age;
    }

    public void printPerson() {
        // ...
    }

    public static List<Person> createRoster() {
        return Arrays.asList(
                new Person("xiaoyu", LocalDate.now(), Sex.FEMALE, "xx", 20),
                new Person("xiaoyu", LocalDate.now(), Sex.MALE, "xx", 20));
    }
}
