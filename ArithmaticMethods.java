public class ArithmaticMethods {
    public static void add(){
        int a = 2;
        int b = 3;
        System.out.println("Addition is: "+(a+b));
    }
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
    public static void main(String args[]){
        ArithmaticMethods obj = new ArithmaticMethods();
        add();
        obj.sub();
        obj.mul();
        obj.div();
        obj.mod();
    }
}