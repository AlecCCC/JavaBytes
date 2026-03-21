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

    public Node findMiddleNode()  {

        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next != null) {

            fast = fast.next.next;
            slow = slow.next;

        }

        return slow;

    }

    public boolean hasLoop() {

        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next != null) {

            slow = slow.next;
            fast = fast.next.next;

            if (slow == fast) {
                return true;
            }
        }
        return false;

    }

    public Node kthFromEnd(int k ) {

        if (k <= 0 ) return null;

        Node fast = head;
        Node slow = head;



        for (int i = 0; i < k; i ++) {
            fast = fast.next;
            if (fast == null) return null;
        }

        while(fast != null) {
            slow = slow.next;
            fast = fast.next;
        }

        return slow;

    }

    public void removeDuplicate() {

        Node current = head;

        while(current != null) {
            Node runner = current;
            while (runner.next != null) {
                if (runner.next.value == current.value) {
                    runner.next = runner.next.next;
                    length = length - 1;
                } else {
                    runner = runner.next;
                }
            }
            current = current.next;
        }
    }


    public void getLength() {
        System.out.println("length " + length);
    }

    public int getDecimal(){

        int sum = 0;

        Node current = head;

        while(current != null) {

            sum = sum * 2 + current.value;
            current = current.next;

        }
        return sum;
    }

    public void partitionList(int x) {

        if (head == null) {return;}

        Node dummy1 = new Node(0);
        Node dummy2  = new Node(0);

        Node prev1 = dummy1;
        Node prev2 = dummy2;

        Node current = head;

        while (current != null) {

            if (current.value < x ) {

                prev1.next = current;
                prev1 = current;

            }

            else {

                prev2.next = current;
                prev2 = current;

            }

            current = current.next;

        }
        prev2.next = null;
        prev1.next = dummy2.next;

        head = dummy1.next;
    }









    public void getHead() {
        System.out.println("Head " + head.value);
    }

    public void getTail() {
        System.out.println("Tail " + tail.value);
    }
}
