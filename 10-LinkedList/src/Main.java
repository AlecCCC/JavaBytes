public class Main {
    public static void main(String[] args) {

        LinkedList linkedList = new LinkedList(10);
        linkedList.append(13);
        linkedList.append(6);
        linkedList.append(20);
        linkedList.append(6);

        LinkedList linkedList1 = new LinkedList(3);

        for (int i = 0; i < 10; i++) {
            linkedList1.append((int)(Math.random() * 20) + 1);
        }

        linkedList1.printList();
        System.out.println();
        linkedList1.partitionList(6);
        linkedList1.printList();




    }
}