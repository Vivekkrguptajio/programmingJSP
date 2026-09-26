// A 
// a b 
// A B C 
// a b c d 
// A B C D E 
// public class p6 {
    public static void main(String[] args) {
        int n =5;
       for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                if(i%2==1)
                System.out.print((char)(64+j)+" ");
            else
                 System.out.print((char)(96+j)+" ");
        }
            
            System.out.println();
        }
    }
}
