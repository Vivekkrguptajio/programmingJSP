
public class findPower {
    public static void main(String[] args) {
        int a =5;
        int b =2;

        System.out.println(power(a,b));
    }

    static int power(int a, int b){

        int prod =1;
        for (int i = 1; i <=b; i++) {
            prod=prod*a;
        }
        return prod;
    }
}
