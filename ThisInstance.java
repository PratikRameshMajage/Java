public class ThisInstance {
    int a;
    int b;
    void base(int a, int b){
        this.a=a;
        this.b=b;
        System.out.println("\nThe Value of a: "+a+"\n");
        System.out.println("\nThe Value of b: "+b+"\n");
    }
    public static void main(String args[]){
        ThisInstance obj = new ThisInstance();
        obj.base(2,4);
    }
}