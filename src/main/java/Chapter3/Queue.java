package Chapter3;

import Chapter2.Node;

public class Queue {

    private Node first, last;

    public Object dequeue() {
        if (first == null) {
            return null;
        }
        Object item = first.getValue();
        first = first.getNext();
        return item;
    }

    public void enqueue(Object item) {
        Node node = new Node(item);
        if (first == null) {
            first = node;
            last = node;
        } else {
            last.setNext(node);
            last = last.getNext();
        }
    }
}
