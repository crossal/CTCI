package Chapter2;

import org.junit.Test;

import static Chapter2.Question1.*;
import static org.junit.Assert.*;

public class Question1Test {

    //region Test removeDuplicates
    @Test
    public void removeDuplicates_hasDuplicates_removesDuplicates() {
        Node head = generateLinkedListWithDuplicates();
        removeDuplicates(head);
        assertEquals(1, head.getValue());
        assertEquals(2, head.getNext().getValue());
        assertEquals(3, head.getNext().getNext().getValue());
        assertNull(head.getNext().getNext().getNext());
    }

    @Test
    public void removeDuplicates_onlyDuplicates_removesDuplicates() {
        Node head = generateLinkedListWithOnlyDuplicates();
        removeDuplicates(head);
        assertEquals(1, head.getValue());
        assertNull(head.getNext());
    }

    @Test
    public void removeDuplicates_noDuplicates_doesNothing() {
        Node head = generateLinkedListWithNoDuplicates();
        removeDuplicates(head);
        assertEquals(1, head.getValue());
        assertEquals(2, head.getNext().getValue());
        assertNull(head.getNext().getNext());
    }
    //endregion

    //region Test removeDuplicatesDoublyLinked
    @Test
    public void removeDuplicatesDoublyLinked_hasDuplicates_removesDuplicates() {
        Node head = generateLinkedListWithDuplicates();
        removeDuplicatesDoublyLinked(head);
        assertEquals(1, head.getValue());
        assertEquals(2, head.getNext().getValue());
        assertEquals(3, head.getNext().getNext().getValue());
        assertNull(head.getNext().getNext().getNext());
    }

    @Test
    public void removeDuplicatesDoublyLinked_onlyDuplicates_removesDuplicates() {
        Node head = generateLinkedListWithOnlyDuplicates();
        removeDuplicatesDoublyLinked(head);
        assertEquals(1, head.getValue());
        assertNull(head.getNext());
    }

    @Test
    public void removeDuplicatesDoublyLinked_noDuplicates_doesNothing() {
        Node head = generateLinkedListWithNoDuplicates();
        removeDuplicatesDoublyLinked(head);
        assertEquals(1, head.getValue());
        assertEquals(2, head.getNext().getValue());
        assertNull(head.getNext().getNext());
    }
    //endregion

    //region Test removeDuplicatesNoBuffer
    @Test
    public void removeDuplicatesNoBuffer_hasDuplicates_removesDuplicates() {
        Node head = generateLinkedListWithDuplicates();
        removeDuplicatesNoBuffer(head);
        assertEquals(1, head.getValue());
        assertEquals(2, head.getNext().getValue());
        assertEquals(3, head.getNext().getNext().getValue());
        assertNull(head.getNext().getNext().getNext());
    }

    @Test
    public void removeDuplicatesNoBuffer_onlyDuplicates_removesDuplicates() {
        Node head = generateLinkedListWithOnlyDuplicates();
        removeDuplicatesNoBuffer(head);
        assertEquals(1, head.getValue());
        assertNull(head.getNext());
    }

    @Test
    public void removeDuplicatesNoBuffer_noDuplicates_doesNothing() {
        Node head = generateLinkedListWithNoDuplicates();
        removeDuplicatesNoBuffer(head);
        assertEquals(1, head.getValue());
        assertEquals(2, head.getNext().getValue());
        assertNull(head.getNext().getNext());
    }
    //endregion

    private static Node generateLinkedListWithDuplicates() {
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

    private static Node generateLinkedListWithNoDuplicates() {
        Node head = new Node(1);
        Node n2 = new Node(2);

        head.setNext(n2);
        n2.setPrev(head);

        return head;
    }

    private static Node generateLinkedListWithOnlyDuplicates() {
        Node head = new Node(1);
        Node n2 = new Node(1);

        head.setNext(n2);
        n2.setPrev(head);

        return head;
    }
}
