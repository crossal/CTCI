package Chapter2;

public class Node {
    private Object value;
    private Node next;
    private Node prev;

    public Node(Object value) {
        this.value = value;
    }

    public Object getValue() {
        return value;
    }

    public void setValue(Object value) {
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
        sb.append(value);
        Node node = this;
        while (node.getNext() != null) {
            node = node.getNext();
            sb.append("->" + node.getValue());
        }

        return sb.toString();
    }
}
