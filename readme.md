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

