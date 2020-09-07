package leetcode.easy.subtract_the_product_and_sum_of_digits_of_an_integer;

/**
 * 1281. Subtract the Product and Sum of Digits of an Integer
 * https://leetcode.com/problems/subtract-the-product-and-sum-of-digits-of-an-integer
 */
public class Solution {
    public int subtractProductAndSum(int n) {
        return getProduct(n) - getSum(n);
    }

    private static int getProduct(int n)
    {
        int product = 1;

        while (n != 0) {
            product = product * (n % 10);
            n = n / 10;
        }

        return product;
    }

    private static int getSum(int n){
        int sum = 0;

        while (n != 0) {
            sum += (n % 10);
            n = n / 10;
        }

        return sum;
    }
}
