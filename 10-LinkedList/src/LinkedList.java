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

    public void prepend (int value) {

        Node newNode = new Node(value);

        if (length == 0) {
            head = newNode;
            tail = newNode;
        }
        else {
            newNode.next = head;
            head = newNode;
        }
        length++;
    }

    public Node removeFirst() {

        if (length == 0) {return null;}

        Node temp = head;
        head = head.next;
        temp.next = null;
        length--;

        if (length == 0) {
            tail = null;
        }

        return temp;

    }

    public Node getNode(int index){

        if (index < 0 || index >= length ){return null;}

        Node temp = head;

        for (int i = 0; i < index; i++) {

            temp = temp.next;

        }
        return temp;
    }

    public boolean set(int index, int value) {

        Node temp = getNode(index);

        if (temp != null) {
            temp.value = value;
            return true;
        }

        return false;
    }

    public boolean insert(int index, int value) {

        if (index < 0 || index > length) {
            return false;
        }
        if ( index == 0 ) {
            prepend(value);
            return true;
        }
        if (index == length) {
            append(value);
            return true;
        }
        Node newNode = new Node(value);
        Node temp = getNode(index - 1); // our temp points to the node before the index

        newNode.next = temp.next; //have the newNode pointer same as temp.next
        temp.next = newNode;

        length++;
        return true;




    }

    public Node delete(int index) {

        if (index < 0 || index >= length) {
            return null;
        }

        if (index == 0) {
           return removeFirst();
        }

        if (index == length -1) return removeLast();

        Node prev = getNode(index - 1); // get node before index
        Node temp = prev.next; // set our temp node to node after index
        prev.next = temp.next; // points to node After temps node.

        temp.next = null; // disconnect deleted node

        length--;

        return temp;




    }

    public void reverse() {
        Node temp = head;
        head = tail;
        tail = temp; //temp was head, so tail =  tamp to complete swap;
        Node after;
        Node before = null;


        for (int i = 0; i < length; i++) {

            after = temp.next;  // set node to node that temp is pointing to
            temp.next = before; // we are now pointing to the node that is behind temp;

            before = temp;
            temp = after;
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
