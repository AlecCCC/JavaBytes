public class Main {
    public static void main(String[] args) {

        numbers(4);
        System.out.println();
        upsideDownNumbers(4);


    }
    public static void numbers(int number) {

        for (int i = 1; i <= number; i++) {

            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }

            System.out.println();
        }

    }

    public static void upsideDownNumbers(int number) {

        for (int i = number; i >= 1; i--) {

            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }

            System.out.println();
        }

    }



}