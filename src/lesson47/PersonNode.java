package lesson47;

public class PersonNode {
    private PersonNode prev = null;
    private PersonNode next = null;
    private PersonNode person = null;

    public PersonNode(PersonNode prev, PersonNode next, PersonNode person) {
        this.prev = prev;
        this.next = next;
        this.person = person;
    }

    public PersonNode getPrev() {
        return prev;
    }

    public void setPrev(PersonNode prev) {
        this.prev = prev;
    }

    public PersonNode getNext() {
        return next;
    }

    public void setNext(PersonNode next) {
        this.next = next;
    }

    public PersonNode getPerson() {
        return person;
    }

    public void setPerson(PersonNode person) {
        this.person = person;
    }
}
