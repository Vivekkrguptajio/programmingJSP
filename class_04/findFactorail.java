
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
