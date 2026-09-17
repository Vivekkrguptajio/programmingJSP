
public class NeonNumber {
    public static void main(String[] args) {
        int n = 9;
        if (isNeon(n)) {
            System.out.println("Neon Number");
        } else {
            System.out.println("Not Neon");
        }
    }

 static boolean isNeon(int num){
    int sq = num * num;
    int sum =0;
        while(sq!=0){
            int r =sq%10;
            sum=sum+r;
            sq =sq/10;
        }
        return num==sum;
 }
}
