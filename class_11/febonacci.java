//febonacci 0 1 1 2 3 5 8 13
public class febonacci {
    public static void main(String[] args) {
        int n = 10;
        febonacci(n);
    }

    static void febonacci(int num) {
        int a = 0;
        int b = 1;
        System.out.print(" 0 1 ");

        while (num != 2) {
            System.out.print(a + b+" ");
            int c=a+b;
            a=b;
            b=c;
            num--;
        }
    }
}
