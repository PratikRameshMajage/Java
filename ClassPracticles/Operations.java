import java.util.*;
public class Operations 
{
    public static void main(String args[]){

        System.out.println("Calci Methord One");
        DataType obj1 = new DataType();
        obj1.datatypes();

        System.out.println("Calci Methord One");
        CalciMethord obj2 = new CalciMethord();
        obj2.calc(12);
        obj2.calc();
        obj2.calc(5,2);

        System.out.println("Calci Methord Two");
        CalciMethordTwo obj3 = new CalciMethordTwo();
        obj3.calc();
        obj3.calc(5);
        obj3.calc(5, 5); 

        ThisVariableAndMethord obj4 = new ThisVariableAndMethord();
        obj4.calc(10);
    }
}

class DataType{
    void datatypes(){
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

class CalciMethord{
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
        
        System.out.println("Multiplication of"+num1+num2+num3+num4+"is: "+(num1*num2*num3*num4));
    }
}

class CalciMethordTwo{
    Scanner sc = new Scanner(System.in);
    void calc()
    {
        System.out.println("Enter 1st Number: ");
        int num1 = sc.nextInt();
        System.out.println("Enter 2nd Number: ");
        int num2 = sc.nextInt();
        System.out.println("Addition is: "+(num1+num2));
    }
    void calc(int num3){
        System.out.println("Enter 1st Number: ");
        int num1 = sc.nextInt();
        System.out.println("Enter 2nd Number: ");
        int num2 = sc.nextInt();
        System.out.println("Enter 3rd Number: ");
        num3 = sc.nextInt();
        System.out.println("Subtraction is: "+(num1-num2-num3));
    }
    void calc(int num3, int num4){
        System.out.println("Enter 1st Number: ");
        int num1 = sc.nextInt();
        System.out.println("Enter 2nd Number: ");
        int num2 = sc.nextInt();
        System.out.println("Multiplication is: "+(num1*num2*num3*num4));
    }
}
class ThisVariableAndMethord{
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
        this.num1 = sc.nextInt();
        System.out.println("Enter 2nd Value: ");
        this.num2 = sc.nextInt();
        this.num3 = num3;
        System.out.println("Multiplication of Three Number is: "+(this.num1*this.num2*this.num3)+"\n");
    }
}