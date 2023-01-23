package lesson50;

public class Main {
    public static void main(String[] args) {
        try {
            User john = new User("John;Lennon;40;lennon@mail.com");
            System.out.println(john);
            User paul = new User("Paul;McCartney;67;mccartney@mail.com");
            System.out.println(paul);
            User george = new User("George;Harrison;50;harrison@mail.com");
            System.out.println(george);
            User ringo = new User("Ringo;Starr;77;starr@mail.com");
            System.out.println(ringo);
        } catch (Exception e) {}

    }
}
