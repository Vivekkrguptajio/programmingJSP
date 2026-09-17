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
