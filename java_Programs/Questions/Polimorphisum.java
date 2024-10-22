public class Polimorphisum {
    public static void main(String args[]){
        // Methord Overloading: -
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