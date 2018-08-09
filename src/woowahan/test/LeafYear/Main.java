package woowahan.test.LeafYear;
//Please don't change class name 'Main'
import java.util.Scanner;

class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        boolean isLeap = false;
        if (n % 4 == 0) {
            isLeap = n % 100 != 0 || n % 400 == 0;
        }

        if (isLeap) {
            System.out.println("Leap Year");
        } else {
            System.out.println("Not Leap Year");
        }
    }
}
