public class Node<String> {
    private String data;
    private Node<String> next;

    public Node(String data) {
        this.data = data;
        this.next = null;
    }

    public Node(String data, Node<String> next) {
        this.data = data;
        this.next = next;
    }
}
