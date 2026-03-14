import java.util.Arrays;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        RemoveDuplicatesArray removeDuplicatesArray = new RemoveDuplicatesArray();

        int[] array = {1, 3, 3 , 5, 7, 8, 8, 10};

        // int size =removeDuplicatesArray.removeduplicates(array);
        //    for (int i = 0; i < size; i++ ) {
        //        System.out.println(array[i] + " ");
        //    }

        for (int num : array) {
            System.out.print(num + " ");
        }

        array =  removeDuplicatesArray.removeDupes(array);

        System.out.println();

        for (int num : array) {
        System.out.print(num + " ");
        }

    }
}