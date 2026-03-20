public class Main {
    public static void main(String[] args) {

        LinkedList linkedList = new LinkedList(10);
        linkedList.append(13); // add Node
        linkedList.prepend(20);  //prepend
        linkedList.append(6); // add Node
        linkedList.append(20); // add Node
        linkedList.append(6);

        linkedList.printList();
        System.out.println("\n");
        System.out.println(linkedList.kthFromEnd(1).value);

        System.out.println("\n");
        linkedList.removeDuplicate();
        linkedList.printList();





    }
}