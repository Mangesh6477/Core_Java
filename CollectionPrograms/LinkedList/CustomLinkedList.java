
class CustomLinkedList {
    //this class for create the first node structure

    class Node {

        private String data;
        private Node next;

        Node(String data) {
            this.data = data;
            this.next = null;
        }
    }

//first node is indicate head
    private Node head = null;
    private int size = 0;

//add first elements inside the first node 
    public void addFirst(String data) {

        size++;
        Node newNode1 = new Node(data);
        if (head == null) {
            head = newNode1;
            return;

        }

        newNode1.next = head;
        head = newNode1;
    }

//add last elements inside the linked list at last
    public void addLast(String data) {
        size++;
        Node newNode1 = new Node(data);
        if (head == null) {
            head = newNode1;
            return;
        }

        Node currNode = head;
        while (currNode.next != null) {
            currNode = currNode.next;

        }

        currNode.next = newNode1;
    }
//delete the first node after that eligible for GC

    public void deleteFirst() {

        if (head == null) {
            System.out.println("linked list already empty ");
            return;

        }
        size--;
        Node currNode = head;
        head = head.next;
        currNode.next = null;
    }

//delete the last node 
    public void deleteLast() {
        if (head == null) {
            System.out.println("linked list empty");
            return;
        }

        size--;
        Node currNode = head;
        while (currNode.next.next != null) {
            currNode = currNode.next;

        }
        // currNode=currNode.next;
        currNode.next = null;
    }

    public void getSize() {
        System.out.println(this.size);
    }

//display the elements
    public void display() {
        if (head == null) {
            System.out.println("linked list is null ");
            return;

        }

        Node currNode = head;
        while (currNode != null) {
            System.out.print(currNode.data + "->");
            currNode = currNode.next;
        }

        System.out.println("linked list end");

    }

    public static void main(String[] args) {
        CustomLinkedList ls = new CustomLinkedList();
        ls.addFirst("mangesh");
        ls.addFirst("pawan");

        ls.addFirst("vaibhav");
        ls.addFirst("gaurav");
        ls.addFirst("gaurav");
        ls.display();

        ls.addLast("shiv");

        ls.display();

        ls.deleteFirst();
        ls.display();

        ls.deleteLast();
        ls.display();

        ls.getSize();
    }
}
