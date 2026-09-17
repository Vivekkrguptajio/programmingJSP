public class prod_of_digit {

    public static void main(String[] args) {

        int n = 1234;
        System.out.println(prodOfDigit(n));
    }

    static int prodOfDigit(int num) {

        int prod = 1;
        while (num != 0) {
            int r = num % 10;
            prod = prod * r;
            num = num / 10;
        }
        return prod;
    }
}
