// public class OOP{
//     // Compiler Always Start Execution From Main Method:
//     // Public: Access Specifier.
//     // Static: Without Creating Object to Use Main Method. 
//     // Void: Return DataType.
//     public static void main(String args[]){ 
//         // Pen: Class.
//         // P1: Reference Variable.
//         // new: Memory Allocation.
//         // Pen(): Pen Class Default Constructor.
//         // ; : Treminate the Line.
//         // Created a Pen Object called p1.
//         // Stack:
//         // Heap: Object Created in Heap Memory (alocates Memory) by using New Keyword.  
//         Pen p1 = new Pen(); 
//         p1.setColor("BLue");
//         System.out.println(p1.color);
//         p1.setTip(10);
//         System.out.println(p1.tip);
//     }
// }
// // Pen Class
// class Pen{
//     // Properties and Methods:
//     String color = "Red";
//     int tip = 5;
//     void setColor(String newColor){
//         color = newColor;
//     }
//     void setTip(int newTip){
//         tip = newTip;
//     }
// }
// // Student Class
// class Student{
//     String name;
//     int age;
//     float percentage;

//     void calcPercentage(int phy, int che, int math){
//         percentage = (phy + che + math)/3;
//     }
// }

// Access Specifier:
// public class OOP{
//     public static void main(String args[]) {
//         Pen p1 = new Pen();
//         p1.setColor("Red");
//         p1.setTip(10);
//         System.out.println(p1.getColor());
//         System.out.println(p1.getTip());
        
//     }
// }
// class Pen {
//     private String color;
//     private int tip;

//     String getColor(){
//         return this.color;
//     }
//     int getTip(){
//         return this.tip;
//     }

//     void setColor(String newColor){
//         // you can use this when instance variable and local variable names are same 
//         // color: Instance Variable.
//         // newColor: Local Variable.  
//         this.color = newColor;
//     }
//     void setTip(int newTip){
//         this.tip = newTip;
//     }
// }

// Constructor:
// public class OOP{
//     public static void main(String args[]) {
//         Student s1 = new Student();
//         Student s2 = new Student("Pratik",22,"12345");
//         s2.marks[0] = 90;
//         s2.marks[1] = 95;
//         s2.marks[2] = 99;
//         // Copy Constructor:
//         Student s3 = new Student(s2);
//         // Beacouse of Array Here Referece is Copy.
//         s3.password = "67890";
//         s2.marks[2] = 12; 
//         for(int i=0; i<3;i++){
//             System.out.println(s3.marks[i]);
//         }
//     }
// }
// class Student{
//     String name;
//     int rollno;
//     String password;
//     int marks[];
//     // Default Constructor | Non-Parametrized Constructor:
//     Student(){
//         System.out.println("Student Constructor Called...");
//     }
//     // Parametrized Constructor:
//     Student(String name, int rollno, String password){
//         this.name = name; 
//         this.rollno = rollno;
//         this.password = password;
//         marks = new int[3];
//     }
//     // Copy Constructor: Shallw Copy Constructor
//     // Student(Student s2){
//     //     this.name = s2.name;
//     //     this.rollno = s2.rollno;
//     //     this.marks = s2.marks;
//     // }
//     // Deep Copy Constructor:
//     Student(Student s2){
//         marks = new int[3];
//         this.name = s2.name;
//         this.rollno = s2.rollno;
//         this.marks = s2.marks;
//         for(int i =0; i<3; i++){
//             this.marks[i] = s2.marks[i];
//         }
//     }
// }


// Inheritance
// Singlr Level Inheritance
// public class OOP{
//     public static void main(String[] args) {
//         Fish shark = new Fish();
//         shark.eat();    
//     }
// }
// // BaseCLass
// class Animal{
//     String color;
//     void eat(){
//         System.out.println("Eats");
//     }
//     void breath(){
//         System.out.println("Breathes");
//     }
// }
// // DerivedClass
// class Fish extends Animal{
//     int fins;
//     void swim(){
//         System.out.println("Swims in Water");
//     }
// }

// Multiple Inheritance
// public class OOP{
//     public static void main(String[] args) {
//         Dog dobby = new Dog();
//         dobby.eat();
//         dobby.legs = 4;
//         System.out.println(dobby.legs);
//     }
// }
// class Animal{
//     String color;
//     void eat(){
//         System.out.println("Eats");
//     }
//     void breathe(){
//         System.out.println("Breaths");
//     }
// }
// class Mammal extends Animal{
//     int legs;
// }
// class Dog extends Mammal{
//     String breed;
// }

// Hierarchial Inheritance:
// public class OOP{
//     public static void main(String[] args) {
//         Mammal
//     }
// }
// class Animal{
//     String color;
//     void eat(){
//         System.out.println("Eats");
//     }
//     void Breath(){
//         System.out.println("Breathes");
//     }
// }
// class Mammal extends Animal{
//     void walk(){
//         System.out.println("Walks");
//     }
// }
// class Fish extends Animal{
//     void swim(){
//         System.out.println("Swims");
//     }
// }
// class Bird extends Animal{
//     void fly(){
//         System.out.println("Fly");
//     }
// }

// // Hybrid Inheritance:
// public class OOP{
//     public static void main(String[] args) {
//         Dog dobby = new Dog();
//         dobby.eat();
//         dobby.breath();
//         dobby.walk();
//         dobby.bark();
//     }
// }
// class Animal{
//     String color;
//     void eat(){
//         System.out.println("Eats");
//     }
//     void breath(){
//         System.out.println("Breathes");
//     }
// }
// class Mammal extends Animal{
//     void walk(){
//         System.out.println("Walks");
//     }
// }
// class Fish extends Animal{
//     void swim(){
//         System.out.println("Swims");
//     }
// }
// class Bird extends Animal{
//     void fly(){
//         System.out.println("Fly");
//     }
// }
// class Dog extends Mammal{
//     void bark(){
//         System.out.println("Barking");
//     }
// }

// Polymorphism:
// Compile Time Polymorphism:
// Method Overloading:
// public class OOP{
//     public static void main(String[] args) {
//         Calculator calc = new Calculator();
//         System.out.println(calc.sum(2,3));
//         // System.out.println(calc.sum(2.2,3.3)); By Default it takes as a Double thts why we have to Type Cast.
//         System.out.println(calc.sum((float)2.2,(float)3.3));
//         System.out.println(calc.sum(2,3,4));
//     }
// } 
// class Calculator{
//     int sum(int num1, int num2){
//         return num1+num2;
//     }
//     float sum(float num1, float num2){
//         return num1+ num2;
//     }
//     int sum(int num1, int num2, int num3){
//         return num1+num2+num3;
//     }
// }

// Polymorphism:
// Run Time Polymorphism:
// Method Overriding:
public class OOP{
    public static void main(String[] args) {
        Deer deer = new Deer();
        deer.eat();
        Animal animal = new Animal();
        animal.eat();
    }
} 
class Animal{
    void eat(){
        System.out.println("Eats");
    }
}
class Deer extends Animal{
    void eat(){
        System.out.println("Eats Grass");
    }
}