import java.util.Scanner;
public class RunTimeCode {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Integer: ");
        int num1 = sc.nextInt();

        System.out.println("Enter Float: ");
        float num2 = sc.nextFloat();

        System.out.println("Enter Long: ");
        long num3 = sc.nextLong();

        System.out.println("Enter Double: ");
        double num4 = sc.nextDouble();

        System.out.println("Enter Short: ");
        short num5 = sc.nextShort();

        System.out.println("Enter Byte: ");
        byte num6 = sc.nextByte();

        System.out.println("Enter Boolean : ");
        boolean num7 = sc.nextBoolean();

        System.out.println("Enter Charecter: ");
        char ch = sc.next().charAt(0);

        System.out.println("Integer is: "+num1+"\nFloat is: "+num2+"\nLong is: "+num3+"\nDouble is: "+num4+"\nShort is: "+num5+"\nByte is: "+num6+"\nBoolean is: "+num7+"\nCharecter is: "+ch);
    }
}
