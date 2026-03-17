public class LinkedList {

    Node head;
    Node tail;
    int length;

    public LinkedList(int value) {
        Node node = new Node(value);
        node.next = null;
        head = node;
        tail = node;
        this.length = 1;
    }


    public void printList() {
        Node temp = head;

        while(temp!= null) {
            System.out.print(temp.value + " ");
            temp = temp.next;
        }
    }


    public void append(int value) {

        Node newNode = new Node(value);

        if (length == 0) {
            head = newNode;
            tail = newNode;
        }
        else {
            tail.next = newNode;
            tail = newNode;
        }
        length++;
    }

    public Node removeLast() {

        Node temp = head;
        Node pre = head;

        if (length == 0) {
            return null;
        }

        else {

            while (temp.next != null) {

                pre = temp;
                temp = temp.next;

            }
            tail = pre;
            tail.next = null;
            length --;

            if (length == 0) {

                head = null;
                tail = null;

            }

            return temp;

        }




    }









    public void getHead() {
        System.out.println("Head " + head.value);
    }

    public void getTail() {
        System.out.println("Tail " + tail.value);
    }

    public void getLength() {
        System.out.println("length " + length);
    }
}
