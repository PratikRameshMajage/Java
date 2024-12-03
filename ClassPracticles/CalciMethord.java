import java.util.Scanner;
public class CalciMethord 
{
    Scanner sc = new Scanner(System.in);
    void calc(int num1)
    {
        
        System.out.println("Enter 2nd Number: ");
        int num2 = sc.nextInt();
        System.out.println("Addition is: "+(num1+num2));
    }
    void calc(){
        System.out.println("Enter 1st Number: ");
        int num1 = sc.nextInt();
        System.out.println("Enter 2nd Number: ");
        int num2 = sc.nextInt();
        System.out.println("Enter 3rd Number: ");
        int num3 = sc.nextInt();
        System.out.println("Subtraction is: "+(num1-num2-num3));
    }
    void calc(int num4,int num3){
        System.out.println("Enter 1st Number: ");
        int num1 = sc.nextInt();
        System.out.println("Enter 2nd Number: ");
        int num2 = sc.nextInt();
        
        System.out.println("Multiplication is: "+(num1*num2*num3*num4));
    }
    public static void main(String args[]){
        CalciMethord obj = new CalciMethord();
        obj.calc(12);
        obj.calc();
        obj.calc(5,2);
    }
}