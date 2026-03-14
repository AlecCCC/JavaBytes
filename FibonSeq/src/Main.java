import java.util.Arrays;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

//        int a = 0;
//        int b = 1;
//        int c;
//
//        int index = 0;
//
//        System.out.print(a + " " + b );
//
//        while (index < 7) {
//
//            c = a + b;
//
//            System.out.print(" " + c);
//
//            a = b;
//            b = c;
//            index++;
//
//        }

        System.out.println(Arrays.toString(fibSeq(15, 9, 11)));


    }


    public static int[] fibSeq(int size, int a, int b) {

        int array[] = new int[size];

        System.out.println(a + " " + b);

 /// /
        for (int i = 0; i < array.length; i++) {
            int c = a + b;

            System.out.println(" " + c);

            a = b;
            b = c;

            array[i] = c;

        }

        return array;

    }


}
