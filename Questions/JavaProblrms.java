import java.util.*;

public class JavaProblrms {

    public static void add(){
        int a = 2;
        int b = 3;
        System.out.println("Addition is: "+(a+b));
    }
    public static void main(String args[]){
        DoubleReverceNumber obj1 = new DoubleReverceNumber();
        // obj1.doubleReverceNumber();

        EvenNumbers obj2 = new EvenNumbers();
        obj2.evenNumbers();

        PatternNumber obj3 = new PatternNumber();
        obj3.patternNumber();

        ReverceNumber obj4 = new ReverceNumber();
        obj4.reverceNumber();

        Polimorphisum obj5 = new Polimorphisum();
        obj5.polimorphisum();

        Inheritance obj6 = new Inheritance();
        obj6.inheritance();

        System.out.println("Calci Methord One");
        DataType obj7 = new DataType();
        obj7.datatypes();

        System.out.println("Calci Methord One");
        CalciMethord obj8 = new CalciMethord();
        obj8.calc(12);
        obj8.calc();
        obj8.calc(5,2);

        System.out.println("Calci Methord Two");
        CalciMethordTwo obj9 = new CalciMethordTwo();
        obj9.calc();
        obj9.calc(5);
        obj9.calc(5, 5); 

        ThisVariableAndMethord obj10 = new ThisVariableAndMethord();
        obj10.calc(10);


        ArithmaticMethods obj11 = new ArithmaticMethods();
        add();
        obj11.sub();
        obj11.mul();
        obj11.div();
        obj11.mod();


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

class DoubleReverceNumber{
    void doubleReverceNumber(){
        int rem,num;
        int sum = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Three Digit Number: ");
        num = sc.nextInt();
        while(num>0){
            rem = num%10;
            sum = (sum*10) + rem;
            System.out.println(sum);
        }
    }
}

class EvenNumbers {
    void evenNumbers() {
        int num = 1;
        for(;num<=50;){
            if (num%2==0){
                System.out.println(num);
            }
            num++;
        }
    }
}

class PatternNumber {
    void patternNumber(){
        int num = 3;
        System.out.println("Pattern Number: \n");
        for(int i=1;i<=4;i++){
            for(int j=1; j<=i;j++){
                if(i==1){
                    System.out.print(1+" ");
                }
                else if(i==2){
                    System.out.print(num*6+" ");
                }
                else if(i==4){
                    System.out.print(num*8+" ");
                }
                else{
                    System.out.print(num+"  ");
                }
            }
            System.out.println();
        }
        System.out.println();
    }
}

class ReverceNumber {
    void reverceNumber() {
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

class Polimorphisum {
    void polimorphisum(){
        // Methord Overloading: -
        System.out.println("Polymorphism...");
        System.out.println("....Methord Overloading....");
        Calculator object = new Calculator();   //object
        object.calci(5,5);
        object.calci(15, 5, 5);
        object.calci(5, 5, 5, 5);
        object.calci(25, 5);
        object.calci(25, 5);
        System.out.println();
        // Methord Overridding: - 
        System.out.println("....Methord Overridding....");
        Addition obj1 = new Addition(); //object
        obj1.calci(5,5);
        Subtraction obj2 = new Subtraction();
        obj2.calci(5,5);
        Multiplication obj3 = new Multiplication();
        obj3.calci(5,5);
        Division obj4 = new Division();
        obj4.calci(5,5);
        Modulo obj5 = new Modulo();
        obj5.calci(5,5);
    }
}
// Multi level Inheritance
// Polimorphisum
    // Methord Overloading: -
        // Scope of the properties within the cass.
        // Same name of Methord with different number of parameters in within the class is known as methord Overloading.  
    // Methord Overridding: - 
        // Scope of Methord is outof the class
        // we need inheritane for Methord Overridding.
        // we need to create each class object in this methord Overridding.
    // In Which Senario We need to create multiple object of the class
        // 1. Private Properties and Methords.
        // 2. Methord Overridding.

// Methord Overloading: -
class Calculator{
    void calci(int a,int b){
        System.out.println("Additon of Two numbers is: "+(a+b));
    }
    void calci(int a,int b,int c){
        System.out.println("Subtraction of Three numbers is: "+(a-b-c));
    }
    void calci(int a,int b,int c,int d){
        System.out.println("Product of Four numbers is: "+(a*b*c*d));
    }
    void calci(double a, double b){
        System.out.println("Product of Four numbers is: "+(a/b));
    }
    void calci(float a, float b){
        System.out.println("Product of Four numbers is: "+(a%b));
    }
}
// 2. Methord OverRidding.
class Addition{
    void calci(int a, int b){
        System.out.println("Addition of two numbers is: "+(a+b));
    }
}
class Subtraction extends Addition{
    void calci(int a, int b){
        System.out.println("Subtraction of two numbers is: "+(a-b));
    }
}
class Multiplication extends Subtraction{
    void calci(int a, int b){
        System.out.println("Product of two numbers is: "+(a*b));
    }
}
class Division extends Multiplication{
    void calci(int a, int b){
        System.out.println("Questiont of two numbers is: "+(a/b));
    }
}
class Modulo extends Division{
    void calci(int a, int b){
        System.out.println("Remainder of two numbers is: "+(a%b));
    }
}




// Inheritance:- When Chid class object inherit the properties of parent class object tis process known as Inheritance.
// Parent class - Child class
// Base class - Derived class 
// Superclass - SubClass 
// Types of Inheritance:-
// 1. Single level Inheritance - 
    // when single child class inhert the properties from paret calss that is known as Single Level Inheritance. 
    // Example:-
// public class Inheritance {
//     public static void main(String args[]){
//         B obj = new B();
//         obj.m2();
//         obj.m1();
//     }
// }
// class A{
//     void m1(){
//         System.out.println("Class A");
//     }
// }
// class B extends A{
//     void m2(){
//         System.out.println("Class B");
//     }
// }

// 2. Multilevel Inheritance - 
    // when child class work as a parent class for any other child class that is known as multilevel inheritance.
    // Example:-
class Inheritance {
    void inheritance(){
        D obj = new D();
        System.out.println();
        System.out.println("Inheritance...");
        obj.m1();
        obj.m2();
        obj.m3();
        obj.m4();
    }
}
class A{
    void m1(){
        System.out.println("Class A");
    }
}
class B extends A{
    void m2(){
        System.out.println("Class B");
    }
}
class C extends B{
    void m3(){
        System.out.println("Class C");
    }
}
class D extends C{
    void m4(){
        System.out.println("Class D");
    }
}
    
    // 3. Hirarchial Inheritance - 
        // when one child class inherit from more than one parent calss that is known as hirarchial inheritance. 
        
    // 4. Multiple Inheritance -
        // when a multiple child class inherit from one parent class that is known as multiple inheritance.
    
    // 5. Hybrid Inheritance - 
        // the combination of many multiple inheritance classes inherit there propertes that is known as hybrid inheritance.
       
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


class ArithmaticMethods {
    void sub(){
        int a = 2;
        int b = 3;
        System.out.println("Subtraction is: "+(a-b));
    }
    void mul(){
        int a = 2;
        int b = 3;
        System.out.println("Mutiplication is: "+(a*b));
    }
    void div(){
        int a = 2;
        int b = 3;
        System.out.println("Division is: "+(a/b));
    }
    void mod(){
        int a = 2;
        int b = 3;
        System.out.println("Modulos is: "+(a%b));
    }
}