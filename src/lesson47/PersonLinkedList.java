package lesson47;

public class PersonLinkedList {
    private PersonNode first = null;
    private PersonNode last = null;
    private int size = 0;

    public boolean add(PersonNode person) {
        PersonNode newNode = new PersonNode(null, null, person);

        if (first == null) {
            first = newNode;
        } else {
            last.setNext(newNode);
            newNode.setPrev(last);
        }

        last = newNode;
        size++;

        return true;
    }

    public boolean addFirst(PersonNode person) {
        PersonNode newNode = new PersonNode(null, null, person);

        if (first == null) {
            first = newNode;
        } else {
            first.setPrev(newNode);
            newNode.setNext(first);;
        }

        first = newNode;
        size++;

        return true;
    }

    public PersonNode remove(int index) {

        int curIdx = 0;
        PersonNode curNode = first;

        while (curIdx != index) {
            curNode = curNode.getNext();
            curIdx++;
        }

        if (curNode.getPrev() != null) {
            curNode.getPrev().setNext(curNode.getNext());
        }

        if (curNode.getNext() != null) {
            curNode.getNext().setPrev(curNode.getPrev());
        }

        return curNode.getPerson();
    }

    public boolean remove(Person person) {
        PersonNode curNode = first;

        while (!curNode.getPerson().equals(person)) {
            curNode = curNode.getNext();
            if (curNode.getNext() == null) {
                return false;
            }
        }

        if (curNode.getPrev() != null) {
            curNode.getPrev().setNext(curNode.getNext());
        }

        if (curNode.getNext() != null) {
            curNode.getNext().setPrev(curNode.getPrev());
        }

        return true;
    }
}
