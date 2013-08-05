public class Main {

    public static void main(String[] args) {
        System.out.println("back to school");
        List list = new List();
        list.add(1);
        list.add(3);
        list.add(1);
        list.add(3);
        list.add(1);

        Node n = new Node();
        n = list.head;
        while (n.next != null) {
            System.out.print(n.value);
            System.out.print(", ");
            n = n.next;
        }
        System.out.println(n.value);

        int d = 1;
        while (list.delete(d)) {
            System.out.println("Deleting");
        }

        List.Iterator iter = list.iterator();
        while (iter.hasNext()) {
            System.out.print(iter.next().value);
        }
    }
}
