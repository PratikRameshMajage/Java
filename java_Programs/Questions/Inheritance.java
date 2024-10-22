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
public class Inheritance {
    public static void main(String args[]){
        D obj = new D();
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
