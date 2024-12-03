public class InstanceLocalVarivle {
    // Instance Variable
    int a;
    int b;
    // int a = 5;
    // int b = 10;
    void m1(){
        // Local Variable
        int a=15;
        int b=20;
        System.out.println("a is: "+a);
        System.out.println("b is: "+b);
    }
    public static void main(String args[]){
        InstanceLocalVarivle obj = new InstanceLocalVarivle();
        // Instance Variable
        System.out.println("a is: "+ obj.a);
        System.out.println("b is: "+ obj.b);
        // Local Variable
        obj.m1();
    }
}