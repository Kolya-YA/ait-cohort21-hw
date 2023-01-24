package lesson50.part01;

import lesson50.part01.User;

public class Main {
    public static void main(String[] args) {
        User john, paul, george, ringo;
        try {
            john = new User("John;Lennon;40;lennon@mail.com");
            System.out.println(john);
            paul = new User("Paul;McCartney;67;mccartney@mail.com");
            System.out.println(paul);
            george = new User("George;Harrison;50;harrison@mail.com");
            System.out.println(george);
            ringo = new User("Ringo;Starr;77;starr@mail.com");
            System.out.println(ringo);
        } catch (Exception e) {}

    }
}
