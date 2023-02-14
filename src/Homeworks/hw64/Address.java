package Homeworks.hw64;

public class Address {
    private final String postcode;
    private final String city;
    private final String street;
    private final String house;

    public Address(String postcode, String city, String street, String house) {
        this.postcode = postcode;
        this.city = city;
        this.street = street;
        this.house = house;
    }

    @Override
    public String toString() {
        return "\n" + postcode + ", " + city + ", " + street + ", " + house;
    }
}
