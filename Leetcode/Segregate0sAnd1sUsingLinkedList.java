import java.util.LinkedList;

public class Segregate0sAnd1sUsingLinkedList {
    public static void segregate0sAnd1sUsingLinkedList(int a[]) {
        LinkedList<Integer> ll = new LinkedList<>();
        for (int i = 0; i < a.length; i++) {
            if (a[i] == 0) {
                ll.addFirst(a[i]);
            } else {
                ll.addLast(a[i]);
            }
        }
        System.out.println(ll);
    }

    public static void main(String[] args) {
        int a[] = { 1, 1, 0, 0, 1, 0, 1, 0 };
        segregate0sAnd1sUsingLinkedList(a);
    }
}