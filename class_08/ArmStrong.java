/*
 * Question: Write a Java program to check whether a given number is an Armstrong number.
 * 
 * An Armstrong number (or Narcissistic number) of order n is a number that is 
 * equal to the sum of its own digits each raised to the power of n (number of digits).
 * 
 * Examples:
 * - 153 -> 1^3 + 5^3 + 3^3 = 1 + 125 + 27 = 153 (Armstrong)
 * - 9474 -> 9^4 + 4^4 + 7^4 + 4^4 = 6561 + 256 + 2401 + 256 = 9474 (Armstrong)
 */
public class ArmStrong{
    public static void main(String[] args) {
        
        int n =9474;

        if(isArmStrong(n)){
            System.out.println("ArmStrong");
        }else{
            System.out.println("Not ArmStrong");
        }
    }

    static boolean isArmStrong(int num){
        int p = countDigit(num);
        int temp =num;
        int sum =0;
        while(temp!=0){
            int r = temp%10;
            sum=sum+powerValue(r,p);
            temp/=10;
        }
        return sum==num;
    }

    static int powerValue(int a,int b){
        int pow=1;
        for (int i = 1; i <= b; i++) {
            pow=pow*a;
        }
        return pow;
    }

    static int countDigit(int num){
        int count =0;
        while(num!=0){
            num=num/10;
            count++;
        }
        return count;
    }
}