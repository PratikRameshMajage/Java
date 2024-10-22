import java.util.Scanner;
public class ThisVariableAndMethord {
    Scanner sc = new Scanner(System.in);
    int num1,num2,num3;
    void calc(){
        System.out.println("Enter 1st Value: ");
        int num1 = sc.nextInt();
        this.num1 = num1;
        System.out.println("Enter 2nd Value: ");
        int num2 = sc.nextInt();
        this.num2 = num2;
        System.out.println("Addition of Two Number is: "+(this.num1+this.num2)+"\n");
    }
    void calc(int num3){
        this.calc();
        System.out.println("Enter 1st Value: ");
        int num1 = sc.nextInt();
        this.num1 = num1;
        System.out.println("Enter 2nd Value: ");
        int num2 = sc.nextInt();
        this.num2 = num2;
        this.num3 = num3;
        System.out.println("Multiplication of Three Number is: "+(this.num1*this.num2*this.num3)+"\n");
    }
    public static void main(String args[]){
        ThisVariableAndMethord obj = new ThisVariableAndMethord();
        obj.calc(10);
    }
}