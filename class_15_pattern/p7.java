//    2
//    3   5
//    7  11  13
//   17  19  23  29

public class p7 {

    static boolean isPrime(int cnt) {
        if (cnt <= 1)
            return false;
        for (int i = 2; i <= cnt / 2; i++) {
            if (cnt % i == 0)
                return false;
        }
        return true;
    }

    public static void main(String[] args) {

        int n = 4;
        int cnt = 2;

        for (int i = 1; i <= 4; i++) {
            int j = 1;
            while (j <= i) {
                if (isPrime(cnt)) {
                    System.out.printf("%4d", cnt);
                    j++;
                }
                cnt++;
            }
            System.out.println();
        }
    }
}