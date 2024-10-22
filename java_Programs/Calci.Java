import java.util.*;
public class Calci {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter First Number: ");
        int num1 = sc.nextInt();
        System.out.println("Enter Second Number: ");
        int num2 = sc.nextInt();
        System.out.println("Addition is: "+(num1+num2));
        System.out.println("Subtraction is: "+(num1-num2));
        System.out.println("Produst is: "+(num1*num2));
        System.out.println("Questiont is: "+(num1/num2));
        System.out.println("Remainder is: "+(num1%num2));
    }
}

