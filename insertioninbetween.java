public class insertioninbetween {
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    Node head;

    public void insertAtPosition(int data, int position) {
        Node newNode = new Node(data);
        if (position == 0) {
            newNode.next = head; 
            head = newNode; 
            return;
        }
        Node current = head;
        for (int i = 0; i < position - 1; i++) {
            if (current == null) {
                throw new IllegalArgumentException("Position out of bounds");
            }
            current = current.next;
        }
        newNode.next = current.next; 
        current.next = newNode; 
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
        insertioninbetween list = new insertioninbetween();
        list.insertAtPosition(10, 0); // Insert at the start
        list.insertAtPosition(20, 1); // Insert at the end
        list.insertAtPosition(15, 1); // Insert in between
        
        System.out.println("Linked List after inserting at specific positions:");
        list.display();
    }
}