class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class InsertAtEnd {
    Node head;

    public void InsertAtEnd(int newData) {
        Node newNode = new Node(newData);

        if (head == null) {
            head = newNode;
        } else {
            Node temp = head;
            while(temp.next != null) {
                temp = temp.next;
            }
            temp.next = newNode;
        }
    }

    public void printList() {
        Node temp = head;

        while(temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        InsertAtEnd list = new InsertAtEnd();

        list.InsertAtEnd(10);
        list.InsertAtEnd(20);
        list.InsertAtEnd(30);

        list.printList();  // Output: 10 -> 20 -> 30 -> null
    }
}
