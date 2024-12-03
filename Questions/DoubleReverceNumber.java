import java.util.*;
public class DoubleReverceNumber {
    public static void main(String args[]){
        int rem,num;
        int sum = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Three Digit Number: ");
        num = sc.nextInt();
        while(num>0){
            rem = num%10;
            sum = (sum*10);
        }
    }
}
