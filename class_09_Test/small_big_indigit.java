/*
 * Question: Write a Java program to find the largest and smallest digit in a given number.
 * 
 * Example:
 * Input : n = 36825
 * Output: 
 *   Largest Digit : 8
 *   Smallest Digit: 2
 */
public class small_big_indigit {
    public static void main(String[] args) {
        int n =36825;
        System.out.println(grater(n));
        System.out.println(small(n));
    }

    static int grater(int num){
        int g = 0;
        while (num!=0) {
            int r = num%10;
            if(r>g){
                g=r;
            }
            num=num/10;
        }
        return g;
    }

    static int small(int num){
        int s = 10; // here you can take 9 too 
        while (num!=0) {
            int r = num%10;
            if(r<s){
                s=r;
            }
            num=num/10;
        }
        return s;
    }
}
