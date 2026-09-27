public class disarium_number {
    public static void main(String[] args) {
        int n =89;
        
        if(n==isDisarium(n)){
            System.out.println("True");
        }
        else{
            System.out.println("False");
        }
    }

    static  int isDisarium(int num){
        int count =(num+"").length();
        int temp =num;
        int sum =0;
        while (temp!=0) {
            sum+=Math.pow(temp%10,count--);
            temp/=10;
        }
        return sum;
    }
}
