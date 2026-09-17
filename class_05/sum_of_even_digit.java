// Q. WAP to find the sum of all even digits of a given number N, using a separate method.
//    Example: N = 1234 → Output: 6  (2+4)

public class sum_of_even_digit {
    public static void main(String[] args) {
        int n = 1234;
        System.out.println(sumOfEvenDigit(n));
    }

    static int sumOfEvenDigit(int num){
        
        int sum =0;
        while(num!=0){
            int r =num%10;
            if(r%2==0)
            sum=sum+r;
            num =num/10;
        }
        return sum;
    }
}
