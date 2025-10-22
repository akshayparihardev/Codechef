class Node {
    int data;
    Node next;

    Node(int data){
        this.data = data;
        this.next = null;
    }
}

public class InsertAtBeg {
    Node head;

    public void InsertAtBeg(int newData){
        Node newNode = new Node(newData);
        newNode.next = head;
        head = newNode;
    }

    public void printList(){
        Node temp = head;

        while(temp != null){
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }
    public static void main(String[] args) {
        InsertAtBeg list = new InsertAtBeg();

        list.InsertAtBeg(30);
        list.InsertAtBeg(20);
        list.InsertAtBeg(10);

        list.printList();
    }

}


