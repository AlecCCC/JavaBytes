import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number of rows: ");
        int rows = scanner.nextInt();

        // rightTriangle(5);
        leftTriangle(5);






    }

    public static void rightTriangle(int rows){

        for (int i = 0; i <= rows; i++) {

            for (int j = 0; j < rows; j++) {
                System.out.print("");
            }

            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }

            System.out.println();

        }

    }

    public static void leftTriangle(int rows) {

        for (int i = 1; i <= rows; i++) {

            for (int j = rows; j > i; j--) {
                System.out.print(" ");
            }

            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }

            System.out.println();

        }

    }

}