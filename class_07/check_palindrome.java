
public class check_palindrome {
    public static void main(String[] args) {
        int n =123;
        if(isPalinDrome(n)){
            System.out.println("Palindrome");
        }else{
            System.out.println("Not Palindrome");
        }
    }

    static boolean isPalinDrome(int n){
        return n==reversed(n);
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
