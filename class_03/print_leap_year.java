// Q. WAP to check whether a given year is a Leap Year or Not.
//    Example: Year = 2012 → Output: Leap Year

package class_03;
public class print_leap_year {
    public static void main(String[] args) {
        
        int year = 2012;

        if(year%400 ==0 || (year%4==0 && year%100==0)){
            System.out.println("Leap Year : " +year);
        }else{
            System.out.println("Not Leap Year : "+year);
        }
    }
}
