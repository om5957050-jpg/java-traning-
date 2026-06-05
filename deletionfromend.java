public class deletionfromend {
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    Node head;

    public void deleteFromEnd() {
        if (head == null) {
            System.out.println("List is empty. No nodes to delete.");
            return;
        }
        if (head.next == null) {
            head = null; // Only one node in the list
            return;
        }
        Node current = head;
        while (current.next.next != null) { 
            current = current.next;
        }
        current.next = null; // Remove the last node
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
        deletionfromend list = new deletionfromend();
        list.head = new Node(10);
        list.head.next = new Node(20);
        list.head.next.next = new Node(30);
        list.head.next.next.next = new Node(40);

        System.out.println("Linked List before deletion:");
        list.display();

        list.deleteFromEnd();

        System.out.println("Linked List after deleting from end:");
        list.display();
    }
}
