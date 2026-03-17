public class Main {
    public static void main(String[] args) {

        LinkedList linkedList = new LinkedList(10);

        linkedList.printList();

        linkedList.append(13);

        System.out.println(" \n ");

        linkedList.printList();

        linkedList.removeLast();

        System.out.println(" \n ");

        linkedList.printList();






    }
}