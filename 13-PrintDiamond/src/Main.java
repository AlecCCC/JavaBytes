public class Main {
    public static void main(String[] args) {

    diamond(5);

    }

    public static void diamond(int middle) {

        for (int i = 1; i <= middle; i++) {

            for (int j = middle; j > i; j--) {
                System.out.print(" ");
            }

            for(int j = 0; j < 2*i - 1; j++) {
                System.out.print("*");
            }

            System.out.println();

        }

        for (int i = middle - 1; i >= 1; i--) {

            for (int j = middle; j > i; j--) {
                System.out.print(" ");
            }

            for(int j = 0; j < 2*i - 1; j++) {
                System.out.print("*");
            }

            System.out.println();


        }


    }

}