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
        boolean wasDeleted = false;

        Node cur = head;
        Node prev = null;
        while (cur != null && cur.value != val) {
            prev = cur;
            cur = cur.next;
        }
        if (cur != null) {

            if (cur == head) {
                head = cur.next;
            }
            else {
                prev.next = cur.next;
            }
            if (cur == tail) {
                tail = prev;
            }
            wasDeleted = true;

        }
        return wasDeleted;
    }

    public class Iterator {
        private Node next = head;

        public boolean hasNext() {
            return next != null;
        }

        public Node next() {
            Node tmp = null;
            if (next != null) {
                tmp = next;
                next = next.next;
            }
            return tmp;
        }
    }

    public Iterator iterator() {
        return new Iterator();
    }
}
