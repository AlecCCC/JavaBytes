
public class Main {
    public static void main(String[] args) {

    diamond(4);

    }


    public static void diamond(int middle) {

        for (int i = 1; i <= middle; i++) {

            for (int j = middle; j > i; j--) {
                System.out.print(" ");
            }

            for(int j = 0; j < 2*i - 1; j++) {
                if (j == 0 || j == 2*i - 2) {
                    System.out.print("*");
                }
                else {
                    System.out.print(" ");
                }
            }

            System.out.println();

        }

        for (int i = middle - 1; i >= 1; i--) {

            for (int j = middle; j > i; j--) {
                System.out.print(" ");
            }

            for(int j = 0; j < 2*i - 1; j++) {
                if (j == 0 || j == 2*i - 2) {
                    System.out.print("*");
                }
                else {
                    System.out.print(" ");
                }
            }

            System.out.println();


        }


    }


}