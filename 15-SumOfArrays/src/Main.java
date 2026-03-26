public class Main {
    public static void main(String[] args) {

        int[] array = {1, 9, 11};

        System.out.println(sumArray(array));

    }

    public static int sumArray(int[] array) {

        int sum = 0;

        for (int tempNum : array) {

            sum += tempNum;

        }

        return sum;

    }

}