public class Main {

    public static void main(String[] args) {
        System.out.println("back to school");
        List list = new List();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        Node n = new Node();
        n = list.head;
        while (n.next != null) {
            System.out.print(n.value);
            System.out.print(", ");
            n = n.next;
        }
        System.out.println(n.value);

        list.reverse();

        List.Iterator i1 = list.iterator();
        while (i1.hasNext()) {
            System.out.print(i1.next().value);
        }
        System.out.println();
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
