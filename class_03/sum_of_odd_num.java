// Q. WAP to find the sum of all odd numbers from 1 to N (exclusive).
//    Example: N = 50 → Output: 625

package class_03;
public class sum_of_odd_num {
    public static void main(String[] args) {
        
        int n = 50;
        int sum =0;
        for (int i = 1; i <n; i+=2) {
            sum=sum+i;
        }
        System.out.println(sum);
    }
}
