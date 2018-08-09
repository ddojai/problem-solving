package woowahan.test.Hexadecimal;
//Please don't change class name 'Main'
import java.util.Scanner;

class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        StringBuilder builder = new StringBuilder();
        do {
            int remainder = n % 16;
            n /= 16;

            builder.insert(0, Integer.toHexString(remainder));
        } while (n > 16);
        builder.insert(0, Integer.toHexString(n));

        System.out.println(builder.toString());
    }
}
