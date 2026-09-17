// Q. WAP to count the total number of digits in a given number N, using a separate method.
//    Example: N = 1234 → Output: 4

public class count_of_digit {
    public static void main(String[] args) {
        int n = 1234;
        System.out.println(countOfDigit(n));
    }

    static int countOfDigit(int num){
        int count = 0;
        while (num!=0) {
            num =num/10;
            count++;
        }
        return count;
    }
}
