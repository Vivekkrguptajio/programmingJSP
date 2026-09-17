
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
