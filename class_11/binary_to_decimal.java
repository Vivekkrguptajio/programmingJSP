/**
 * Question: Write a Java program to convert a given binary number into its decimal equivalent.
 * 
 * Example:
 * Input: 100011
 * Output: 35
 */
public class binary_to_decimal {
    public static void main(String[] args) {
        int n = 100011;
        System.out.println(decimal(n));
    }

    static int decimal(int num) {
        int sum = 0;
        int cnt = 0;
        while (num != 0) {
            int r = num % 10;
            sum += r * Math.pow(2, cnt++);
            num /= 10;
        }
        return sum;
    }
}
