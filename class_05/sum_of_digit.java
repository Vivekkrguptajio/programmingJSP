// Q. WAP to find the sum of all digits of a given number N, using a separate method.
//    Example: N = 1234 → Output: 10  (1+2+3+4)

public class sum_of_digit {
    public static void main(String[] args) {

        int n =1234;
        System.out.println(sumOfDigit(n));
    }

    static int sumOfDigit(int num){

        int sum =0;
        while(num!=0){
            int r =num%10;
            sum=sum+r;
            num =num/10;
        }
        return sum;
    }
}
