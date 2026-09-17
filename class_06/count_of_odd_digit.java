// Q. WAP to count the total number of odd digits in a given number N, using a separate method.
//    Example: N = 12345 → Odd digits: 1, 3, 5 → Output: 3

public class count_of_odd_digit {
    public static void main(String[] args) {
        int n = 12345;
        System.out.println(countOfOddDigit(n));
    }

    static int countOfOddDigit(int num){
        
        int count =0;
        while(num!=0){
            int r =num%10;
            if(r%2!=0)
            count++;
            num =num/10;
        }
        return count;
    }
}
