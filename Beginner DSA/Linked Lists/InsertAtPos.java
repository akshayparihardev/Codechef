class Node {

    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class InsertAtPos {

    Node head;

    public void InsertAtPos(int data, int position) {
        Node newwNode = new Node(data);

        if (head == null) {
            head = newwNode;
            return;
        }

        if (position < 1) {
            System.out.println("Invalid Position...");
            return;
        }

        Node temp = head;
        int i = 1;
        while (i < position - 1 && temp.next != null) {
            temp = temp.next;
            i++;
        }

        newwNode.next = temp.next;
        temp.next = newwNode;

    }

    public void printList() {
        Node temp = head;

        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        InsertAtPos list = new InsertAtPos();

        list.InsertAtPos(10, 1);
        list.InsertAtPos(20, 2);
        list.InsertAtPos(30, 3);
        list.InsertAtPos(40, 4);

        list.printList();
    }

}
