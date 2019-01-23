package Chapter3;

import Chapter2.Node;

public class Stack {

    private Node top;

    public Node getTop() {
        return top;
    }

    public void setTop(Node top) {
        this.top = top;
    }

    public Object pop() {
        if (top != null) {
            Object item = top.getValue();
            top = top.getNext();
            return item;
        }
        return null;
    }

    public void push(Object item) {
        Node newTop = new Node(item);
        newTop.setNext(top);
        top.setPrev(newTop);
    }

    public Object peek() {
        return top == null ? null : top.getValue();
    }
}
