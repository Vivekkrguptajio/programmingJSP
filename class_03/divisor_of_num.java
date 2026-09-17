// Q. WAP to find and print all the divisors of a given number N.
//    Example: N = 108 → Output: 1 2 3 4 6 9 12 18 27 36 54 108

package class_03;
public class divisor_of_num {
    public static void main(String[] args) {
        
        int n =108;

        for (int i = 1; i <=n; i++) {
            if(n%i==0){
                System.out.print(i+" ");
            }
        }
    }
}
