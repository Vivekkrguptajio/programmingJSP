// Q. WAP to check whether a given number N is a Prime Number or not, using a separate method.
//    A Prime Number is divisible only by 1 and itself.
//    Example: N = 7 → Output: Prime

public class primeCheck {
    public static void main(String[] args) {
        int n = 2;

        if(isPrime(n)){
            System.out.println("Prime");
        }else{
            System.out.println("Not Prime");
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
