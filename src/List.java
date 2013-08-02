public class List {
    Node head;
    Node tail;

    public List() {
        this.head = null;
        this.tail = null;
    }

    public void add(int value) {
        Node tmp = new Node(value, null);
        if (this.head == null) {
            this.head = tmp;
        }
        else {
            tail.next = tmp;
        }
        tail = tmp;
    }

    public boolean delete(int val) {

    }
}
