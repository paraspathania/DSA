package Questions.Linked_List;
public class DesignLinkedList {
    class Node {
        int val;
        Node next;
        public Node(int val) {
            this.val = val;
        }
    }
    private Node head;
    private int size;
    public DesignLinkedList() {
        this.head = null;
        this.size = 0;
    }
    public int get(int index) {
        if (index < 0 || index >= size)
            return -1;
        Node curr = head;
        for (int i = 0; i < index; i++) {
            curr = curr.next;
        }
        return curr.val;
    }
    public void addAtHead(int val) {
        Node newNode = new Node(val);
        newNode.next = head;
        head = newNode;
        size++;
    }
    public void addAtTail(int val) {
        if (head == null) {
            addAtHead(val);
        } else {
            Node curr = head;
            while (curr.next != null) {
                curr = curr.next;
            }
            curr.next = new Node(val);
            size++;
        }
    }
    public void addAtIndex(int index, int val) {
        if (index < 0 || index > size)
            return;
        if (index == 0) {
            addAtHead(val);
        } else {
            Node curr = head;
            for (int i = 0; i < index - 1; i++) {
                curr = curr.next;
            }
            Node newNode = new Node(val);
            newNode.next = curr.next;
            curr.next = newNode;
            size++;
        }
    }
    public void deleteAtIndex(int index) {
        if (index < 0 || index >= size)
            return;
        if (index == 0) {
            head = head.next;
        } else {
            Node curr = head;
            for (int i = 0; i < index - 1; i++) {
                curr = curr.next;
            }
            curr.next = curr.next.next;
        }
        size--;
    }
    public static void main(String[] args) {
        System.out.println("Design Linked List implemented.");
    }
}
