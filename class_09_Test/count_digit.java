/*
 * Question: Write a Java program to count the occurrence/frequency of a specific digit in a given number.
 * 
 * Example:
 * Input : num = 343245, digit = 3
 * Output: 2
 */
public class count_digit {
    public static void main(String[] args) {
        int num = 343245;
        int d = 3;
        System.out.println(count(num, d));
    }
    static int count(int num,int d){

        int count =0;
        while (num!=0) {
            int r =num%10;
            if(d==r){
                count++;
            }
            num =num/10;
        }
        return count;
    }
}
