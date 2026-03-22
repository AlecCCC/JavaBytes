import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number of rows: ");
        int rows = scanner.nextInt();

        System.out.println();

        for (int i = 0; i < rows; i++) {

            for (int j = 0; j < rows; j++) {
                System.out.print("");
            }

            for (int j = 1; j <i; j++) {
                System.out.print("*");
            }

            System.out.println();



        }

    }
}