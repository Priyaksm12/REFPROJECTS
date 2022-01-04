package Day14;

public class LinkedLists {
    public static void main(String[] arg) {

        LinkedLists List = new LinkedLists();

        List.addAtStart(70);
        List.addAtStart(56);
        List.insertAfter(List.head, 30);
        List.search(30);
        List.display();

    }

    class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public Node head = null;
    public Node tail = null;

    public void addNode(int data) {

        Node newNode = new Node(data);

        if (head == null) {

            head = newNode;
            tail = newNode;
        } else {

            tail.next = newNode;

            tail = newNode;
        }
    }

    public void display() {

        Node current = head;

        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        System.out.println("Sequence of linked list: ");
        while (current != null) {

            System.out.print(current.data + "-> ");
            current = current.next;
        }
        System.out.println("null");
    }

    public void addnode(int new_data) {
        Node newNode = new Node(new_data);
        newNode.next = head;
        head = newNode;
    }

    public void addAtStart(int newdata) {

        Node newNode = new Node(newdata);

        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            Node temp = head;

            head = newNode;
            head.next = temp;
        }
    }

    public void addATEnd(int newdata) {
        Node newNode = new Node(newdata);
        if (head == null) {
            head = new Node(newdata);
            return;
        }
        newNode.next = null;
        Node last = head;
        while (last.next != null)
            last = last.next;
        last.next = newNode;
    }

    public void insertAfter(Node preNode, int newdata) {
        if (preNode == null) {
            System.out.println("invalid");
            return;

        }
        Node newNode = new Node(newdata);
        newNode.next = preNode.next;
        preNode.next = newNode;

    }

    void pop() {
        if (this.head != null) {

            Node temp = this.head;

            this.head = this.head.next;

            temp = null;
        }

    }

    void popLast() {
        if (head == null)
            return;

        if (head.next == null) {
            return;
        }

        // Find the second last node
        Node second_last = head;
        while (second_last.next.next != null)
            second_last = second_last.next;

        // Change next of second last
        second_last.next = null;

        return;
    }

    public void search(Integer data) {
        boolean flag = false;
        int i = 1;

        Node current = head;
        if (head == null) {
            System.out.println("empty");
        }
        while (current != null) {
            if (current.data == data) {
                System.out.println("found");
                flag = true;
                break;
            }
            i++;
            current = current.next;
        }
        if (flag) {
            System.out.println("element is present at:" + i);
        } else {
            System.out.println("element is absent");
        }
    }
}
