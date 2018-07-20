package datastructure;

public class RecursiveFactorial {
    public static void main(String[] args) {
        System.out.printf("1! = %d \n", factorial(1));
        System.out.printf("2! = %d \n", factorial(2));
        System.out.printf("3! = %d \n", factorial(3));
        System.out.printf("4! = %d \n", factorial(4));
        System.out.printf("9! = %d \n", factorial(9));
    }

    private static int factorial(int n) {
        if (n == 0)
            return 1;
        else
            return n * factorial(n - 1);
    }
}
