// Q. WAP to find the Factorial of a given number N using a separate method.
//    Example: N = 5 → Output: 120  (5! = 5×4×3×2×1)

public class findFactorail {
    public static void main(String[] args) {
        int n =5;
        System.out.println(fact(n));
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
