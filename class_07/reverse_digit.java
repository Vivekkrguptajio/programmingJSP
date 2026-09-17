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
