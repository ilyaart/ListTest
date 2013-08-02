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
        // while (this.next != null) {

        // }
        return false;
    }

    public class Iterator {
        private Node current = head;

        public boolean hasNext() {
            return current != null;
        }

        public Node next() {
            if (hasNext()) {
                try {
                    return current;
                } finally {
                    current = current.next;
                }
            } else {
                throw new java.util.NoSuchElementException();
            }
        }
    }

    public Iterator iterator() {
        return new Iterator();
    }
}
