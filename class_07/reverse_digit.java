// Q. WAP to reverse the digits of a given number N, using a separate method.
//    Example: N = 1234 → Output: 4321

public class reverse_digit {
    public static void main(String[] args) {
        
        int n =1234;
        System.out.println(reversed(n));
    }

    static int reversed(int n){
        
        int revnum =0;
        while(n!=0){
            int r = n%10;
            revnum = revnum*10+r;
            n=n/10;
        }
        return  revnum;
    }

}

/*
 * ========== LOGIC EXPLANATION ==========
 * 
 * int r = n % 10;        → Last digit nikalta hai (remainder)
 * revnum = revnum * 10 + r; → Reversed number banata hai (shift left + add digit)
 * n = n / 10;            → Last digit hata deta hai (quotient)
 * 
 * -------- DRY RUN (n = 1234) --------
 * 
 * Step 1: n = 1234
 *         r = 1234 % 10 = 4
 *         revnum = 0 * 10 + 4 = 4
 *         n = 1234 / 10 = 123
 * 
 * Step 2: n = 123
 *         r = 123 % 10 = 3
 *         revnum = 4 * 10 + 3 = 43
 *         n = 123 / 10 = 12
 * 
 * Step 3: n = 12
 *         r = 12 % 10 = 2
 *         revnum = 43 * 10 + 2 = 432
 *         n = 12 / 10 = 1
 * 
 * Step 4: n = 1
 *         r = 1 % 10 = 1
 *         revnum = 432 * 10 + 1 = 4321
 *         n = 1 / 10 = 0
 * 
 * Loop ends (n == 0), return revnum = 4321 ✅
 * 
 * =======================================
 */
