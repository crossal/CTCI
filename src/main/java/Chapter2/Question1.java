package Chapter2;

import java.util.HashSet;
import java.util.Set;

public class Question1 {

    public static void removeDuplicates(Node n) {
        if (n == null) {
            return;
        }

        Set<Object> values = new HashSet<>();

        values.add(n.getValue());
        while (n != null && n.getNext() != null) {
            if (values.contains(n.getNext().getValue())) {
                if (n.getNext().getNext() != null) {
                    n.setNext(n.getNext().getNext());
                    values.add(n.getNext().getValue());
                } else {
                    n.setNext(null);
                }
            } else {
                values.add(n.getNext().getValue());
            }
            n = n.getNext();
        }
    }

    public static void removeDuplicatesDoublyLinked(Node n) {
        Set<Object> values = new HashSet<>();

        while (n != null) {
            if (values.contains(n.getValue())) {
                n.getPrev().setNext(n.getNext());
            } else {
                values.add(n.getValue());
            }
            n = n.getNext();
        }
    }

    public static void removeDuplicatesNoBuffer(Node n) {
        while (n != null) {
            Node runner = n;
            while (runner.getNext() != null) {
                if (runner.getNext().getValue() == n.getValue()) {
                    runner.setNext(runner.getNext().getNext());
                    break;
                }
                runner = runner.getNext();
            }
            n = n.getNext();
        }
    }

    public static void main(String[] args) {
        Node head = generateListA();
        Node headB = generateListB();

        System.out.print("removeDuplicates(" + head.fullNodeString() + "): ");
        removeDuplicates(head);
        System.out.println(head.fullNodeString());

        System.out.print("removeDuplicates(" + headB.fullNodeString() + "): ");
        removeDuplicates(headB);
        System.out.println(headB.fullNodeString());

        head = generateListA();
        headB = generateListB();

        System.out.print("removeDuplicatesDoublyLinked(" + head.fullNodeString() + "): ");
        removeDuplicatesDoublyLinked(head);
        System.out.println(head.fullNodeString());

        System.out.print("removeDuplicatesDoublyLinked(" + headB.fullNodeString() + "): ");
        removeDuplicatesDoublyLinked(headB);
        System.out.println(headB.fullNodeString());

        head = generateListA();
        headB = generateListB();

        System.out.print("removeDuplicatesNoBuffer(" + head.fullNodeString() + "): ");
        removeDuplicatesNoBuffer(head);
        System.out.println(head.fullNodeString());

        System.out.print("removeDuplicatesNoBuffer(" + headB.fullNodeString() + "): ");
        removeDuplicatesNoBuffer(headB);
        System.out.println(headB.fullNodeString());
    }

    private static Node generateListA() {
        Node head = new Node(1);
        Node n2 = new Node(2);
        Node n3 = new Node(1);
        Node n4 = new Node(3);
        Node n5 = new Node(2);

        head.setNext(n2);
        n2.setPrev(head);
        n2.setNext(n3);
        n3.setPrev(n2);
        n3.setNext(n4);
        n4.setPrev(n3);
        n4.setNext(n5);
        n5.setPrev(n4);

        return head;
    }

    private static Node generateListB() {
        Node head = new Node(1);
        Node n2 = new Node(1);

        head.setNext(n2);
        n2.setPrev(head);

        return head;
    }
}
