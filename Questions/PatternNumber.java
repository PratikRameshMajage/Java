public class PatternNumber {
    public static void main(String args[]){
        int num = 3;
        System.out.println("Pattern Number: \n");
        for(int i=1;i<=4;i++){
            for(int j=1; j<=i;j++){
                if(i==1){
                    System.out.print(1+" ");
                }
                else if(i==2){
                    System.out.print(num*6+" ");
                }
                else if(i==4){
                    System.out.print(num*8+" ");
                }
                else{
                    System.out.print(num+"  ");
                }
            }
            System.out.println();
        }
        System.out.println();
    }
}
