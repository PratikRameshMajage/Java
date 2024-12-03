import java.util.*;
public class PrimeNumbers {
    public static void main(String args[]){
        int i;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number: ");
        int num = sc.nextInt();
        for( i=1; i<=num; i++){
            if (i%2!=0  && i%3!=0 && i%5!=0 && i%7!=0 && i%11!=0 || i==1 || i==2 || i==3 || i==5 || i==7 || i==11) {
                System.out.print("\t"+i);
            }
        }
    }
}
