// Q. WAP to find the sum of all prime digits of a given number N.
//    Prime digits are: 2, 3, 5, 7
//    Example: N = 12345 → Prime digits: 2, 3, 5 → Output: 10

public class sum_of_prime_digit {
    public static void main(String[] args) {
        int n = 12345;
        System.out.println(sumOfPrimeDigit(n));
    }
    static int sumOfPrimeDigit(int num){
        int sum =0;
        while(num!=0){
            int r =num%10;
            if(isPrime(r))
            sum=sum+r;
            num =num/10;
        }
        return sum;
    }

    static boolean isPrime(int r){
        if(r<=1) return false;
        for (int i = 2; i <=r/2; i++) {
            if(r%i==0)
            return  false;
        }
        return true;
    }
}
