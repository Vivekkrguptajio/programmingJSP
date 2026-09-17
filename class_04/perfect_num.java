// Q. WAP to check whether a given number N is a Perfect Number or not.
//    A Perfect Number is a number whose sum of proper divisors equals the number itself.
//    Example: N = 6 → Divisors: 1+2+3 = 6 → Perfect Number

public class perfect_num {
    public static void main(String[] args) {
        int n =14;

        if(isPerfect(n)){
            System.out.println("Perfect Number");
        }else{
            System.out.println("Not Perfact Number");
        }
    }

    static boolean isPerfect(int num){

        int sum =0;
        for (int i = 1; i <= num/2; i++) {
            if(num%i==0)
            sum=sum+i;
        }
        return num==sum;
    }
}
