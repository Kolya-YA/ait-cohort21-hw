package Homeworks.hw64;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

class MainTest {
    Address a1 = new Address("123451", "Rome", "Main-01 st.", "123a");
    Address a2 = new Address("123452", "York", "Main-02 st.", "123b");
    Address a3 = new Address("123453", "Bern", "Main-03 st.", "123c");
    Address a4 = new Address("123454", "Bonn", "Main-04 st.", "123d");
    Address a5 = new Address("123455", "Oslo", "Main-05 st.", "123e");
    Person p1 = new Person("Ann", "Lastnamer", "ann@aol.com", "111-999", a1);
    Person p2 = new Person("Bob", "Lastnamer", "bob@aol.com", "222-999", a2);
    Person p3 = new Person("Tom", "Lastnamer", "tom@aol.com", "333-999", a3);
    Person p4 = new Person("Zoe", "Lastnamer", "zoe@aol.com", "444-999", a4);
    Person p5 = new Person("Eva", "Lastnamer", "eva@aol.com", "555-999", a5);
    List<Person> pList = List.of(p1, p2, p3, p4, p5);

    @Test
    void testListOfNames() {
        List<String> expList = List.of("Ann Lastnamer", "Bob Lastnamer", "Tom Lastnamer", "Zoe Lastnamer", "Eva Lastnamer");
        List<String> resList = Main.printFilteredPerson(pList, Main.strOfNames);
        System.out.println(resList);
        Assertions.assertIterableEquals(expList, resList);
    }

    @Test
    void testListOfEmails() {
        List<String> expList = List.of(p1.getEmail(), p2.getEmail(), p3.getEmail(), p4.getEmail(), p5.getEmail());
        List<String> resList = Main.printFilteredPerson(pList, Main.strOfEmails);
        System.out.println(resList);
        Assertions.assertIterableEquals(expList, resList);
    }

    @Test
    void testListOfPhones() {
        List<String> expList = List.of(p1.getPhone(), p2.getPhone(), p3.getPhone(), p4.getPhone(), p5.getPhone());
        List<String> resList = Main.printFilteredPerson(pList, Main.strOfPhones);
        System.out.println(resList);
        Assertions.assertIterableEquals(expList, resList);
    }

    @Test
    void testListOfAddresses() {
        List<String> expList = List.of(
                p1.getAddress().toString(),
                p2.getAddress().toString(),
                p3.getAddress().toString(),
                p4.getAddress().toString(),
                p5.getAddress().toString()
        );
        List<String> resList = Main.printFilteredPerson(pList, Main.strOfAddresses);
        System.out.println(resList);
        Assertions.assertIterableEquals(expList, resList);
    }
}