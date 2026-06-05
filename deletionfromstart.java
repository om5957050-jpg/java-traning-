public  class deletionfromstart {
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    Node head;

    public void deleteFromStart() {
        if (head == null) {
            System.out.println("List is empty. No nodes to delete.");
            return;
        }
        head = head.next; // Move head to the next node, effectively deleting the first node
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
        deletionfromstart list = new deletionfromstart();
        list.head = new Node(10);
        list.head.next = new Node(20);
        list.head.next.next = new Node(30);

        System.out.println("Linked List before deletion:");
        list.display();

        list.deleteFromStart();

        System.out.println("Linked List after deleting from start:");
        list.display();
    }
}