import java.util.Scanner;
public class ReverceNumber {
   public static void main(String args[]) {
        int rem;
        int sum = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Three Digit Number: ");
        int number = sc.nextInt();
        System.out.println("You Enter Number is: " + number);

        while(number > 0) {
            rem = number % 10;
            sum = rem + (sum * 10);
            number /= 10;
        }

        System.out.println("Rever Number is: " + sum);
    }
}
