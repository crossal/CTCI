package Chapter2;

public class Node {
    private int value;
    private Node next;
    private Node prev;

    public Node(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    public Node getPrev() {
        return prev;
    }

    public void setPrev(Node prev) {
        this.prev = prev;
    }

    public String fullNodeString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Integer.toString(value));
        Node node = this;
        while (node.getNext() != null) {
            node = node.getNext();
            sb.append("->" + Integer.toString(node.getValue()));
        }

        return sb.toString();
    }
}
