public class ConstructorOverloading {
    ConstructorOverloading(){
        System.out.println("pratik");
    }
    ConstructorOverloading(int num){
        this();
        System.out.println("num is: "+num);
    }
    ConstructorOverloading(int num1, int num2){
        // this();
        this(5);
        System.out.println("num is: "+(num1+num2));
    }

    void print(){
        System.out.println("hi");
    }
    void print(int num){
        System.out.println("byy");
    }
    void print(int num, char ch){
        System.out.println("number is: "+num+"\ncharecter is: "+ch);
    }
    
    public static void main(String args[]){
        ConstructorOverloading obj = new ConstructorOverloading(5,5);
        obj.print();
        obj.print(5);
        obj.print(5, 'a');
    }
}