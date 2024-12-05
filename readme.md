# `Java Notes:`
# `Classes & Objects:`
- **OOP: Object Oriented Programming:** Style of Writing Code.
- **Objects:** Entities in Real World. 
- **Casses:** Group of these Entities | Collection of Real World Objects | BluePrint of on object | has Attributes & Methods | ex: Pen
- **Attributes:** Properties | ex: color, thickness
- **Methods:** Functions Which is use in the Class | Behaviours | ex: setColor(), setTip()
- **Java Code Writing Convention: Traditional Java Developers Follow this Convention**
    - Always Make Classes After Public Class. 
    - File_Name & Public_Class_Name Should be Same.
    - **Class** name Should be Start With **Capital Letter**.
    - **Methords** name Should be Start with **Small Letter** - **CamelCase**.
# `Code:`
```java 
public class OOP{
    // Compiler Always Start Execution From Main Method:
    // Public: Access Specifier.
    // Static: Without Creating Object to Use Main Method. 
    // Void: Return DataType.
    public static void main(String args[]){ 
        // Pen: Class.
        // P1: Reference Variable.
        // new: Memory Allocation.
        // Pen(): Pen Class Default Constructor.
        // ; : Treminate the Line.
        // Created a Pen Object called p1.
        // Stack:
        // Heap: Object Created in Heap Memory (alocates Memory) by using New Keyword.  
        Pen p1 = new Pen(); 
        p1.setColor("BLue");
        // p1.color = "Green"; We can Also Write in this Way. 
        System.out.println(p1.color);
        p1.setTip(10);
        System.out.println(p1.tip);
    }
}
// Pen Class
class Pen{
    // Properties and Methods:
    String color = "Red";
    int tip = 5;
    void setColor(String newColor){
        color = newColor;
    }
    void setTip(int newTip){
        tip = newTip;
    }
}
// Student Class
class Student{
    String name;
    int age;
    float percentage;

    void calcPercentage(int phy, int che, int math){
        percentage = (phy + che + math)/3;
    }
}
```
# `Access Modifiers:`
|Access Specifier|Within Class|Within Package|Outside Package BySubClass Only|OutSide Package|
|----------------|------------|--------------|-------------------------------|---------------|
|- **Private:**  |Y           |NO            |NO                             |NO             |
|- **Default:**  |Y           |Y             |NO                             |NO             |
|- **Protected:**|Y           |Y             |Y                              |NO             |
|- **Public:**   |Y           |Y             |Y                              |Y              |

# `Getter & Setter:`
- Get: To Return the Value.
- Set: To Modify the Value.
- This Keyword is Used to refer to the Current Object.
```java
public class OOP{
    public static void main(String args[]) {
        Pen p1 = new Pen();
        p1.setColor("Red");
        p1.setTip(10);
        System.out.println(p1.getColor());
        System.out.println(p1.getTip());
        
    }
}
class Pen {
    private String color;
    private int tip;

    String getColor(){
        return this.color;
    }
    int getTip(){
        return this.tip;
    }

    void setColor(String newColor){
        // you can use this when instance variable and local variable names are same 
        // color: Instance Variable.
        // newColor: Local Variable.  
        this.color = newColor;
    }
    void setTip(int newTip){
        this.tip = newTip;
    }
}
```
# `Encapsulation:`
- **Four Pillers of OOP**.
    - **Encpsulation:** Encapsulation is defined as the **wrapper up of Data & Methods ( Properties|Variables & Functions) under a Single Unit. It also Implements Data Hiding (Useless | Sensitive -> Private|Protected|Default ).** 
    - **Abstraction:**
    - **Inheritance:**
    - **Polimorphisum:**
# `Constructors:`
- Constructor is a **Special Method** which is **invoked by Automatically at the time of Object Creation.**
    - Constructor have the Same name as Class Structure.
    - Constructor Don't have Return Type.(Not even void)
    - Constructors are Only called Once.
    - Memory Allocation happens when Constructor is Called.
- **Types Of Constructor:** 
    - **Non-Parametrized:**
    - **Parametrized:** 
        - Constructor Overloading - Polymorphisum
    - **Copy Constructor:**
        - Shallw (On a Surface Changes) Copy: Refrence Copy - Changes Reflect
        - Deep (Totally Deep Inside Changes) Copy: New Copy - Changes Not Reflect
```java
public class OOP{
    public static void main(String args[]) {
        Student s1 = new Student();
        Student s2 = new Student("Pratik",22,"12345");
        s2.marks[0] = 90;
        s2.marks[1] = 95;
        s2.marks[2] = 99;
        // Copy Constructor:
        Student s3 = new Student(s2);
        // Beacouse of Array are Referece Variables.
        s3.password = "67890";
        s2.marks[2] = 12; 
        for(int i=0; i<3;i++){
            System.out.println(s3.marks[i]);
        }
    }
}
class Student{
    String name;
    int rollno;
    String password;
    int marks[];
    // Default Constructor | Non-Parametrized Constructor:
    Student(){
        System.out.println("Student Constructor Called...");
    }
    // Parametrized Constructor:
    Student(String name, int rollno, String password){
        this.name = name; 
        this.rollno = rollno;
        this.password = password;
        marks = new int[3];
    }
    // Copy Constructor: Shallw Copy Constructor
    // Student(Student s2){
    //     this.name = s2.name;
    //     this.rollno = s2.rollno;
    //     this.marks = s2.marks;
    // }
    // Deep Copy Constructor:
    Student(Student s2){
        marks = new int[3];
        this.name = s2.name;
        this.rollno = s2.rollno;
        this.marks = s2.marks;
        for(int i =0; i<3; i++){
            this.marks[i] = s2.marks[i];
        }
    }
}
```
# `Destructors:`
- Garbage Collector:
# `Inheritance:`
- Inheritance is when Properties and Methods of **base | Parent | Super** class are passed on **Derived | Child | Sub** Class.
- In Java Multiple Inheritance is Not Exist | Not Possible by Classes. But We Can Achive by using Interface.
- Multiple Base Class - Single Derived Class
## `Single Level Inheritance:`
- Single Base Class to Single Child Class (1 on 1): 
- ![Single Level Inheritance](OOPS%20Diagrams/Single%20Level%20Inheritance.png)
```java
// Inheritance
// Singlr Level Inheritance
public class OOP{
    public static void main(String[] args) {
        Fish shark = new Fish();
        shark.eat();    
    }
}
// BaseCLass
class Animal{
    String color;
    void eat(){
        System.out.println("Eats");
    }
    void breath(){
        System.out.println("Breathes");
    }
}
// DerivedClass
class Fish extends Animal{
    int fins;
    void swim(){
        System.out.println("Swims in Water");
    }
}
```
## `Multiple Inheritance:`
- Single Base class to Single Child Class Again Inherit by Another Single Child Classes (1 on 1 on 1...):
- ![Single Level Inheritance](OOPS%20Diagrams/Multi%20level%20Inheritance.png)
```java
```java
public class OOP{
    public static void main(String[] args) {
        Dog dobby = new Dog();
        dobby.eat();
        dobby.legs = 4;
        System.out.println(dobby.legs);
    }
}
class Animal{
    String color;
    void eat(){
        System.out.println("Eats");
    }
    void breathe(){
        System.out.println("Breaths");
    }
}
class Mammal extends Animal{
    int legs;
}
class Dog extends Mammal{
    String breed;
}
```
## `Hierarchial Inheritance:`
- Single Base class to Many Child Class (1 on MANY):
- ![Single Level Inheritance](OOPS%20Diagrams/Hierarchial%20Inheritance.png)
```java
public class OOP{
    public static void main(String[] args) {
        Mammal
    }
}
class Animal{
    String color;
    void eat(){
        System.out.println("Eats");
    }
    void Breath(){
        System.out.println("Breathes");
    }
}
class Mammal extends Animal{
    void walk(){
        System.out.println("Walks");
    }
}
class Fish extends Animal{
    void swim(){
        System.out.println("Swims");
    }
}
class Bird extends Animal{
    void fly(){
        System.out.println("Fly");
    }
}
```
## `Hybrid Inheritance:`
- Single Base class to Many Child Class Again Inherit by Another Many Child Classes (1 on MANY on Many) Combination of all inheritance:
- ![Single Level Inheritance](OOPS%20Diagrams/Hybrid%20Inheritance.png)
```java
// Hybrid Inheritance:
public class OOP{
    public static void main(String[] args) {
        Dog dobby = new Dog();
        dobby.eat();
        dobby.breath();
        dobby.walk();
        dobby.bark();
    }
}
class Animal{
    String color;
    void eat(){
        System.out.println("Eats");
    }
    void breath(){
        System.out.println("Breathes");
    }
}
class Mammal extends Animal{
    void walk(){
        System.out.println("Walks");
    }
}
class Fish extends Animal{
    void swim(){
        System.out.println("Swims");
    }
}
class Bird extends Animal{
    void fly(){
        System.out.println("Fly");
    }
}
class Dog extends Mammal{
    void bark(){
        System.out.println("Barking");
    }
}
```
# `Polymorphism:`
- Poly: Many 
- Morph: Forms
- **Compile Time Polymorphism** (Static)
    - Methord Overloading: Multiple Functions with the Same Name but Different Parameters.
- **Run Time Polymorphism** (Dynamic)
    - Method Overriding: Parent and Child Classes both Contain the Same functions with a Different Defination.   

## `Method Overloading:`
- Multiple Functions with the Same Name but Different Parameters.
```java
// Polymorphism:
// Compile Time Polymorphism:
// Method Overloading:
public class OOP{
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        System.out.println(calc.sum(2,3));
        // System.out.println(calc.sum(2.2,3.3)); By Default it takes as a Double thts why we have to Type Cast.
        System.out.println(calc.sum((float)2.2,(float)3.3));
        System.out.println(calc.sum(2,3,4));
    }
} 
class Calculator{
    int sum(int num1, int num2){
        return num1+num2;
    }
    float sum(float num1, float num2){
        return num1+ num2;
    }
    int sum(int num1, int num2, int num3){
        return num1+num2+num3;
    }
}
```
## `Method Overloading:`
- Parent and Child Classes both Contain the Same functions with a Different Defination.
```java
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
```
# `Packages:`
- Packages is a Groupof Similar Types of Classes, Interfaces and Sub-Packages.
- InBuild Packages: java.util.*;
- UserDefined Packages: package myPackage;















































Java -> Android, Web, Enterprise Market | Applications | Complex Web Applications | Mobile Applications | Emmbeded Softwares
Language -> Syntax Cahange
Basic -> Core (OOP) -> JDBC(Java Database Connectivity) -> Servelet -> Jsp -> Hybernate Framework -> Spring -> Spring Boot 
Java as Language: 
    - Basic: Syntax, Cnstruct, loop, Condition, logic.
    - Core:- Object, Inheritance, Polymorphism, Encapsulation, Abstraction. 
    - Advanced:- Files, Database, Multithreading. 
Java as Technology: Servelet, Spring Framework, Hibernate Framework
IDE: Integrated Devlopment Environment -> Type - Compile - Run.
In Java Every Line make Scence.
Prespective: Core Java: Java Prespective | Web: Java EE (Enterprise Editor)
Create:
    New Java Project
    New Package | Class  
 
String Should be in Double Coatation: ("")
Semicolan: Terminates the line: ();
Block of Code: Class{}, Methods(){}
Source Code: Compile: Byte Code: Java Virtual Machine
Variables: Container, Memory Name, To Store Data,
Primitive Data Types & Refrence Data Types:
Premitive Data Types:
|Data Type|Keyword|Size(bit)|Size(Byte)|
|---------|-------|---------|----------|
|CHarecter|Char   |16       |2         |
|Byte     |Byte   |8        |1         |   
|Short    |Short  |16       |2         |
|Integer  |Int    |32       |4         |
|Float    |FLoat  |32       |4         |
|Long     |Long   |64       |8         |
|Double   |Double |64       |8         |
|Boolean  |Boolean|8        |1         |

- Allowed in Variable: $ _ 
- Not Allowed: Start with Number
- Decimal Numbers: By Default Double
- To Declare Float: Mention 5.5f; 
- To Long Number: Mention 50000000000l;
- Char ch = 'C';
- American Standard Code For Information Interchange:
- Implicit Convertion: Mean Java Do By Default.  
Double d1 = 5; 
- Explicit Conversion: Type Casting: Changes ForceFully Done By Us. 
int k = (int)5.6
Byte - Char - Short - int - long - Float - Double
- Naming Convantion in Java: Specific Standards:
Look Good, More Efficient, Readable
- In Java We Follow Camel-Casing Rule:
- Variable Name: sname, stockprice
- Constant: PI, DENSITY, MAX_PRICE
- Method: Verb : actionPerformed(), run(), print(), write()
- Class Name: Noun : String, Integer, Student, Worker, Engineer, Person, Computer, HashMap
- Constructor: Car(), Run(), Swim()
- Interface Name: Adjective - able : Runable, Serializable, Remote, Readable 
- Multiline Comment: /*-----*/ 
- Single Line Comment: //
- Operators:
    - Arithmatic Operators:
    - Bitwise Operators:
    - Relational Operators:
    - Logical Operators:


















