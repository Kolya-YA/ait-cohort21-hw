package Homeworks.hw64;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println("HW64");
    }

    static List<String> printFilteredPerson(List<Person> pList, PersonView func) {
        List<String> strList = new ArrayList<>();
        for (Person p : pList) {
            strList.add(func.personToString(p));
        }
        return strList;
    }

    static PersonView strOfNames = p -> p.getFirstName() + ' ' + p.getLastName();
    static PersonView strOfEmails = p -> p.getEmail();
    static PersonView strOfPhones = p -> p.getPhone();
    static PersonView strOfAddresses = p -> p.getAddress().toString();
}
