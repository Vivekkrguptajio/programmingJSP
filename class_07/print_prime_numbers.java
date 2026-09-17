// Q. WAP to print all Prime Numbers from 1 to N.
//    Example: N = 20 → Output: 2 3 5 7 11 13 17 19

public class print_prime_numbers {
    public static void main(String[] args) {
        int n =100;
        for (int i = 1; i <=n; i++) {
            if(isPrime(i)){
                System.out.print(i+" ");
            }
        }
    }

     static boolean isPrime(int num){
        if(num<=1) return false;
        for (int i = 2; i <=num/2; i++) {
            if(num%i==0)
            return  false;
        }
        return true;
    }
}
