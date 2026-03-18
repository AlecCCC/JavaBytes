public class Main {
    public static void main(String[] args) {

        LinkedList linkedList = new LinkedList(10);
        linkedList.append(13); // add Node



        linkedList.prepend(20);  //prepend



        linkedList.append(6); // add Node

        linkedList.append(20); // add Node

        linkedList.printList();


        Node node = linkedList.getNode(2);

        linkedList.delete(0); // delete node at index i
        System.out.println("\n");
        linkedList.printList();
        linkedList.reverse();
        System.out.println("\n");
        linkedList.printList();


    }
}