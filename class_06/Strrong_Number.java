// Q. WAP to check whether a given number N is a Strong Number or not.
//    A Strong Number is a number whose sum of factorial of each digit equals the number itself.
//    Example: N = 145 → 1! + 4! + 5! = 1 + 24 + 120 = 145 → Strong Number

public class Strrong_Number {
    public static void main(String[] args) {
        
        int n = 145;
        if(isStrongNumber(n)){
            System.out.println("Strong Number");
        }else{
            System.out.println("Not Strong Number");
        }
    }

    static boolean isStrongNumber(int num){
        int temp =num;
        int sum =0;
        while(num!=0){
            int r =num%10;
            sum=sum+fact(r);
            num =num/10;
        }
        return sum==temp;
    }

    static int fact(int num){
        if(num==0) return 1;
        int prod =1;
        for (int i = 1; i <=num; i++) {
            prod =prod*i;
        }
        return prod;
    }
}
