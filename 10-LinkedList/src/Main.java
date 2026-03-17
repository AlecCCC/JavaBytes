public class Main {
    public static void main(String[] args) {

        LinkedList linkedList = new LinkedList(10);
        linkedList.append(13); // add Node

        linkedList.removeLast(); // remove last


        linkedList.prepend(20);  //prepend

        linkedList.removeFirst(); // remove first


        linkedList.append(6); // add Node

        linkedList.append(20); // add Node

        linkedList.printList();


        Node node = linkedList.getNode(2);
        System.out.println("\n");
        System.out.println(node.value);






    }
}