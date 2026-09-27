/**
 * Question: Write a Java program to check whether a given number is a Disarium number or not.
 *           (A number is called a Disarium number if the sum of its digits powered with their 
 *           respective positions is equal to the number itself).
 * 
 * Example 1:
 * Input: n = 89
 * Output: True
 * Explanation: 8^1 + 9^2 = 8 + 81 = 89
 * 
 * Example 2:
 * Input: n = 175
 * Output: True
 * Explanation: 1^1 + 7^2 + 5^3 = 1 + 49 + 125 = 175
 * 
 * Example 3:
 * Input: n = 80
 * Output: False
 * Explanation: 8^1 + 0^2 = 8 + 0 = 8 (8 != 80)
 */
public class disarium_number {
    public static void main(String[] args) {
        int n =89;
        
        if(n==isDisarium(n)){
            System.out.println("True");
        }
        else{
            System.out.println("False");
        }
    }

    static  int isDisarium(int num){
        int count =(num+"").length();
        int temp =num;
        int sum =0;
        while (temp!=0) {
            sum+=Math.pow(temp%10,count--);
            temp/=10;
        }
        return sum;
    }
}
