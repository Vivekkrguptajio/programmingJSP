
/**
 * Question: Write a Java program to count how many Strong numbers are present in an array.
 *           (A Strong number is a number whose sum of factorials of digits equals the number itself).
 * 
 * Example:
 * Input: arr = {1, 2, 145, 40585, 9, 10, 25, 100, 500, 999}
 * Output: 4
 * Explanation: Strong numbers are 1, 2, 145, and 40585. Total count = 4
 */

public class program_8_strong_ele {
    public static void main(String[] args) {
        int arr [] = {1, 2, 145, 40585, 9, 10, 25, 100, 500, 999};
        int cnt = 0;
        for (int i = 0; i < arr.length; i++) {
            if(isStrong(arr[i])){
                cnt++;
            }
        }
        System.out.println(cnt);
    }

    static boolean isStrong(int num){
        int temp = num;
        int sum =0;
        while(temp!=0){
            sum+=fact(temp%10);
            temp/=10;
        }
        return num==sum;
    }

    static int fact(int num){
        if(num==0) return 1;
        return num*fact(num-1);
    }
}
