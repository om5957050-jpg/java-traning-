public class deletionfrombetween {
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    Node head;

    public void deleteFromPosition(int position) {
        if (head == null) {
            System.out.println("List is empty. No nodes to delete.");
            return;
        }
        if (position == 0) {
            head = head.next; // Delete the first node
            return;
        }
        Node current = head;
        for (int i = 0; i < position - 1; i++) {
            if (current.next == null) {
                System.out.println("Position out of bounds.");
                return;
            }
            current = current.next;
        }
        if (current.next == null) {
            System.out.println("Position out of bounds.");
            return;
        }
        current.next = current.next.next; // Bypass the node to be deleted
    }

    public void display() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        deletionfrombetween list = new deletionfrombetween();
        list.head = new Node(10);
        list.head.next = new Node(20);
        list.head.next.next = new Node(30);
        list.head.next.next.next = new Node(40);

        System.out.println("Linked List before deletion:");
        list.display();

        list.deleteFromPosition(1); // Delete the node at position 1 (20)

        System.out.println("Linked List after deleting from position 1:");
        list.display();
    }
}
