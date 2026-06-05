public class insertioninstart {
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    Node head;

    public void insertAtStart(int data) {
        Node newNode = new Node(data);
        newNode.next = head; // Point the new node to the current head
        head = newNode; // Update head to the new node
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
        insertioninstart list = new insertioninstart();
        list.insertAtStart(10);
        list.insertAtStart(20);
        list.insertAtStart(30);
        list.insertAtStart(40);
        
        System.out.println("Linked List after inserting at the start:");
        list.display();
    }
}
