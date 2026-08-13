// Last updated: 8/13/2026, 11:26:00 AM
class MyLinkedList {

    class Node {
        int val;
        Node next;

        Node(int val) {
            this.val = val;
        }
    }

    Node head;

    public MyLinkedList() {
        head = null;
    }

    public int get(int index) {
        Node temp = head;

        for (int i = 0; temp != null && i < index; i++) {
            temp = temp.next;
        }

        return temp == null ? -1 : temp.val;
    }

    public void addAtHead(int val) {
        Node node = new Node(val);
        node.next = head;
        head = node;
    }

    public void addAtTail(int val) {
        Node node = new Node(val);

        if (head == null) {
            head = node;
            return;
        }

        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }

        temp.next = node;
    }

    public void addAtIndex(int index, int val) {
        if (index == 0) {
            addAtHead(val);
            return;
        }

        Node temp = head;

        for (int i = 0; temp != null && i < index - 1; i++) {
            temp = temp.next;
        }

        if (temp == null) return;

        Node node = new Node(val);
        node.next = temp.next;
        temp.next = node;
    }

    public void deleteAtIndex(int index) {
        if (head == null) return;

        if (index == 0) {
            head = head.next;
            return;
        }

        Node temp = head;

        for (int i = 0; temp.next != null && i < index - 1; i++) {
            temp = temp.next;
        }

        if (temp.next != null) {
            temp.next = temp.next.next;
        }
    }
}