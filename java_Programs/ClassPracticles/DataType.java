import java.util.Scanner;
public class DataType {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Short Value: ");
        Short num1 = sc.nextShort();
        System.out.println("Enter the Integer Value: ");
        int num2 = sc.nextInt();
        System.out.println("Enter the Long Value: ");
        long num3 = sc.nextLong();
        System.out.println("Enter the Float Value: ");
        Float num4 = sc.nextFloat();
        System.out.println("Enter the Double Value: ");
        double num5 = sc.nextDouble();
        System.out.println("Enter the Char Value: ");
        char ch = sc.next().charAt(0);
        System.out.println("Enter Boolean Value: ");
        boolean b = sc.nextBoolean();
        System.out.println();
        System.out.println("Short Value is: "+num1);
        System.out.println("Integer Value is: "+num2);
        System.out.println("Long Value is: "+num3);
        System.out.println("FLoat value is: "+num4);
        System.out.println("Double Value is: "+num5);
        System.out.println("Char Value is: "+ch);
        System.out.println("Boolean value is: "+b);
    }
}
