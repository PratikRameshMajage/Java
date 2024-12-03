public class ReturnMethord {
    int add(){
        int a = 2;
        int b = 3;
        return a+b;
    }
    int sub(){
        int a = 2;
        int b = 3;
        return a-b;
    }
    int mul(){
        int a = 2;
        int b = 3;
        return a*b;
    }
    int div(){
        int a = 2;
        int b = 3;
        return a/b;
    }
    int mod(){
        int a = 2;
        int b = 3;
        return a%b;
    }
    char value(){
        char ch = 'A';
        return ch;
    }
    public static void main(String args[]){
        ReturnMethord obj = new ReturnMethord();
        System.out.println("Return Methord: -");
        System.out.println("Addition is: "+obj.add());
        System.out.println("Subtaraction is: "+obj.sub());
        System.out.println("Product is: "+obj.mul());
        System.out.println("Questiont is: "+obj.div());
        System.out.println("Remainder is: "+obj.mod());
        System.out.println("Charecter is: "+obj.value());
    }
    
}
