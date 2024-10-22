package javaAllBasicConcepts;
// import java.util.*;
// PRINT OUTPUT
// public class javaBasic{
//     public static void main(String args[]){
//         System.out.println("Pratik Majage");
//     }
// }

// FACTORIAL
// public class javaBasic{
//     public static void main(String args[]){
//         int n = 5;
//         int fact = 1;
//         for(int i = 1; i <= n; i++){
//             fact = fact * i; 
//         }
//         System.out.println(fact);
//     }
// }

// ADDITION
// import java.util.*;
// public class javaBasic {
//     public static void main(String args[]) {
//         Scanner sc = new Scanner(System.in);
//         int numberOne = sc.nextInt(); 
//         System.out.println("Number One : " + numberOne);
//         int numberTwo = sc.nextInt(); 
//         System.out.println("Number Two : " + numberTwo);
//         int result = numberOne + numberTwo;
//         System.out.println("Result : " + result);
//     }
// }

// SQUARE PATTERN
// public class javaBasic{
//     public static void main(String args[]) {
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         for(int i=1; i<=n; i++){
//             for(int j=1; j<=n; j++){
//                 System.out.print("*"+" ");
//             }
//             System.out.println();
//         }
//     }
// }
// * * * * *
// * * * * *
// * * * * *
// * * * * *
// * * * * *

// ASSENDING PATTERN
// public class javaBasic{
//     public static void main(String args[]) {
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         for(int i=1; i<=n; i++){
//             for(int j=1; j<=i; j++){
//                 System.out.print("*"+" ");
//             }
//             System.out.println();
//         }
//     }
// }
// *
// * *
// * * *
// * * * *
// * * * * *

// DESCENDING PATTERN
// public class javaBasic{
//     public static void main(String args[]) {
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         for(int i=n; i>=1; i--){
//             for(int j=i; j>=1; j--){
//                 System.out.print("*"+" ");
//             }
//             System.out.println();
//         }
//     }
// }
// * * * * *
// * * * *
// * * *
// * *
// *

// public class javaBasic{
//     public static void main(String args[]) {
//         System.out.println("\nPratik Majage\n");
//         int n = 4;
//         for(int i=1; i<=n; i++){
//             for(int j=1; j<=n; j++ ){
//                 if(i==1 || j==1 || i==n || j==n){
//                     System.out.print("*"+" ");
//                 }else{
//                     System.out.print(" "+" ");
//                 }
//             }
//             System.out.println();
//         }
//         System.out.println();
//     }
// }
// * * * *
// *     *
// *     *
// * * * *

// public class javaBasic{
//     public static void main(String args[]) {
//         int n = 4;
//         for(int i=1; i<=n; i++ ){
//             for(int j=n; j>=i; j--){
//                 System.out.print(" ");
//             }            
//             for(int j=1; j<=n; j++){
//                 if (i==1 || j==1 || i==n || j==n) {
//                     System.out.print("*"+" ");
//                 }else{
//                     System.out.print(" "+" ");

//                 }
//             }
//             System.out.println();
//         }
//     }
// }
//     * * * * 
//    *     *
//   *     *
//  * * * *

// public class javaBasic{
//     public static void main(String args[]){
//         int n = 4;
//         for(int i=1; i<=n; i++){
//             for(int j=1; j<=i; j++){
//                 System.out.print("*"+" ");
//             }
//             for(int j=1; j<=(n-i); j++){
//                 System.out.print("-"+" ");
//             }
//             for(int j=1; j<=(n-i); j++){
//                 System.out.print("-"+" ");
//             }
//             for(int j=1; j<=i; j++){
//                 System.out.print("*"+" ");
//             }
//             System.out.println();
//         }

//         for(int i=n; i>=1; i--){
//             for(int j=1; j<=i; j++){
//                 System.out.print("*"+" ");
//             }
//             for(int j=1; j<=n-i; j++){
//                 System.out.print("-"+" ");
//             }
//             for(int j=1; j<=n-i; j++){
//                 System.out.print("-"+" ");
//             }
//             for(int j=1; j<=i; j++){
//                 System.out.print("*"+" ");
//             }
//             System.out.println();
//         }
//     }
// }
// * - - - - - - * 
// * * - - - - * * 
// * * * - - * * * 
// * * * * * * * * 
// * * * * * * * *
// * * * - - * * *
// * * - - - - * *
// * - - - - - - *

// public class javaBasic{
//     public static void main(String args[]){
//         int n = 4;
//         for(int i=n; i>=1; i--){
//             for(int j=1; j<=i; j++){
//                 System.out.print("*"+" ");
//             }
//             System.out.println();
//         }
//     }
// }
// * * * * 
// * * *
// * *
// *

// public class javaBasic{
//     public static void main(String args[]){
//         int n = 5;
//         int num = 1;
//         for(int i=1; i<=n; i++){
//             for(int j=1; j<=i; j++){
//                 System.out.print(num+" ");
//                 num++;
//             }
//             System.out.println();
//         }
//     }
// }
// 1 
// 2 3
// 4 5 6
// 7 8 9 10
// 11 12 13 14 15

// public class javaBasic{
//     public static void main(String args[]){
//         int n = 8;
//         int num = 97;
//         char ch = (char)(num);
//         for(int i=1; i<=n; i++){
//             for(int j=1; j<=i; j++){
//                 System.out.print( ch + " " );
//                 ch++;
//             }
//             System.out.println();
//         }
//     }
// }
// a 
// b c
// d e f
// g h i j
// k l m n o
// p q r s t u
// v w x y z { |
// } ~  ? ? ? ? ?

// FACTORIAL:-
// public class javaBasic{
//     public static int fact(int num){
//         int factorial = 1;
//         for(int i=1; i<=num; i++){
//             factorial = factorial*i; 
//         }
//         return factorial;
//     }
//     public static void main(String args[]){
//         Scanner sc= new Scanner(System.in);
//         int number = sc.nextInt();
//         System.out.println("factorial of "+ number +" is "+fact(number));
//     }
// }
// factorial of 5 is 120

// Fibonnachi searies - 1,1,2,3,5,8,13,21
// public class javaBasic {
//     public static int fib(int n){
//         if (n==0 || n==1) {
//             return n; 
//         }
//         int fnm1 = fib(n-1);
//         int fnm2 =  fib(n-2); 
//         int fn = fnm1 + fnm2;
//         return fn;
//     }
//     public static void main(String args[]) {
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         System.out.println(fib(n));
//     }
// }

// AREA OF CIRCLE:-
// public class javaBasic {
//     public static void areaOfCircle(float radius){
//         float pi = 3.14f;
//         float areaOfCircle = pi * radius * radius;
//         System.out.println(areaOfCircle);
//     }
//     public static void main(String args[]){
//         Scanner sc = new Scanner(System.in);
//         float radius = sc.nextFloat();
//         areaOfCircle(radius);
//     }
// }
// OUTPUT:-
// 5
// 78.5

// CALCULATOR:-
// public class javaBasic {
//     public static void calculator(float number1, float number2, char operator){
//         switch (operator) {
//             case '+': 
//                 float add = number1 + number2;
//                 System.out.println("Add: " + add);
//             break;
//             case '-': 
//                 float subtract = number1 - number2;
//                 System.out.println("Subtract: " + subtract);
//                 break;
//             case '*': 
//                 float multiply = number1 * number2;
//                 System.out.println("Multiply: " + multiply);
//                 break;
//             case '/':
//                 float divide = number1 / number2; 
//                 System.out.println("Divide: " + divide);
//                 break;
//             default: 
//                 System.out.println("NONE");
//                 break;
//         }
//     }
//     public static void main(String args[]){
//         Scanner sc = new Scanner(System.in);
//         System.out.println("1st Number: ");
//         float number1 = sc.nextFloat();
//         System.out.println("2st Number: ");
//         float number2 = sc.nextFloat();
//         System.out.println("Opration: ");
//         char operator = sc.next().charAt(0);
//         calculator(number1, number2, operator);
//     }
// }
// OUTPUT:-1
// 1st Number:
// 10
// 2st Number:
// 5
// Opration:
// 5
// NONE

// OUTPUT:-2
// 1st Number: 
// 10
// 2st Number:
// 5
// Opration:
// ^
// NONE

// VERIFY AGE:-
// public class javaBasic{
//     public static void verify(int age){
//         if(age>=18){
//             System.out.println("you are Adult.");
//         }else{
//             System.out.println("you are NOT Adult.");
//         }
//     }
//     public static void main(String args[]){
//         Scanner sc = new Scanner(System.in);
//         System.out.println("What is your Age?");
//         int age = sc.nextInt();
//         verify(age);
//     }
// }
// OUTPUT: -
// What is your Age?
// 12
// you are NOT Adult.

// LARGEST OF 2 NUMBERS:-
// public class javaBasic{
//     public static int largestOfTwo(int number1, int number2){
//         if(number1>=number2){
//             return number1;
//         }else{
//             return number2;
//         }
//     }
//     public static void main(String args[]){
//         Scanner sc =new Scanner(System.in);
//         System.out.println("Enter 1st Number ");
//         int number1 = sc.nextInt();
//         System.out.println("Enter 2st Number ");
//         int number2 = sc.nextInt();
//         System.out.println("This is the Largest Number " + largestOfTwo(number1, number2));
//     }
// }
// OUTPUT:-
// Enter 1st Number 
// 55
// Enter 2st Number
// 5
// This is the Largest Number 55


// LARGEST BETWEEN 3 NUMBER:-
// public class javaBasic{
//     public static int largestNumber(int number1, int number2, int number3){
//         if(number1>number2){
//             return number1;
//         }
//         else if(number2>number3){
//             return number2;
//         }
//         else{
//             return number3;
//         }
//     }
//     public static void main(String args[]){
//         Scanner sc = new Scanner(System.in);
//         System.out.println("1st Number: ");
//         int number1 = sc.nextInt();
//         System.out.println("2st Number: ");
//         int number2 = sc.nextInt();
//         System.out.println("3st Number: ");
//         int number3 = sc.nextInt();
//         System.out.println("This Number is Largest "+ largestNumber(number1, number2, number3));
//     }
// }
// OUTPUT
// 1st Number: 
// 3
// 2st Number:
// 8
// 3st Number:
// 5
// This Number is Largest 8

// PRIME NUMBER:-
// public class javBasic{
//     public static void primeNumber(int number){
//         if(number%2==0){
//             System.out.println("The given Number is Not Prime");
//         }else{
//             System.out.println("The given Number is Prime");
//         }
//     }
//     public static void main(String args[]){
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter the Number: ");
//         int number = sc.nextInt();
//         primeNumber(number);
//     }
// }
// OUTPUT:-
// Enter the Number: 7
// The given Number is Prime

// EVEN ODD
// public class javaBasic{
//     public static void EvenOdd(int number){
//         if(number%2==0){
//             System.out.println("The given Number "+number+" is Even");
//         }else{
//             System.out.println("The given Number "+number+" is Odd");
//         }
//     }
//     public static void main(String args[]){
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter The Number ");
//         int number = sc.nextInt();
//         EvenOdd(number);
//     }
// }
// OUTPUT:-
// Enter The Number 
// 7
// The given Number 7 is Odd


// INCOME TAX CALCULATOR:-
// public class javaBasic{
//     public static void taxCalculator(int annualIncome){
//         float tax;
//         if(annualIncome>=500000){
//             tax = annualIncome * 0.2f;
//             System.out.println("tax: "+ tax);
//         }else if(annualIncome>=1000000){
//             tax = annualIncome * 0.3f;
//             System.out.println("tax: "+ tax);
//         }else if(annualIncome>=2000000){
//             tax = annualIncome * 0.5f;
//             System.out.println("tax: "+ tax);
//         }else{
//             tax = annualIncome * 0;
//             System.out.println("tax: "+ tax);
//         }
//     }
//     public static void main(String args[]){
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter your Income: ");
//         int annualIncome = sc.nextInt();
//         taxCalculator(annualIncome);
//     }
// }
// OUTPUT:-
// Enter your Income: 
// 2100000
// tax: 420000.0


// TERNORY OPERATOR
// public class javaBasic{
//     public static String checkPassOrFail(int marks){
//         String result =  (marks>=40) ? "Pass" : "Fail";
//         return result;
//     }
//     public static void main(String args[]){
//         Scanner sc =new Scanner(System.in);
//         System.out.print("Enter your Marks: ");
//         int marks = sc.nextInt();
//         System.out.println("You are " + checkPassOrFail(marks) + ".");
//     }
// }
// OUTPUT:-
// Enter your Marks: 40
// You are Pass.


// CANTEEN MENU:-
// public class javaBasic{
//     public static void main(String args[]){
//         Scanner sc = new Scanner(System.in);
//         System.out.println("What do you have in Order?");
//         int orderNo = sc.nextInt();
//         switch (orderNo) {
//             case 1: System.out.println("Samosa.");
//             break;
//             case 2: System.out.println("Wada-Pav.");
//             break;
//             case 3:System.out.println("Sugarcane-Juice.");
//             break;
//             default: System.out.println("NON of this in the Meun.");
//             break;
//         }
//     }
// }
// OUTPUT:-
// What do you have in Order?
// 3
// Sugarcane-Juice.

// Loops Types- for loop, while loop, do-while loop
// public class javaBasic{
//     public static void main(String args[]){
//         int n = 5;
//         int i = 1;
//         while(i<=n){
//             System.out.println("Pratik");
//             i++;
//         }
//     }
// }
// OUTPUT:-
// Pratik
// Pratik
// Pratik
// Pratik
// Pratik

// public class javaBasic{
//     public static void main(String args[]){
//         int i=1;
//         int n=5;
//         do{
//             System.out.println(i);
//             i++;
//         }while(i<=n);
//     }
// }
// OUTPUT:-
// 1
// 2
// 3
// 4
// 5

// PRINT NUMBERS 1 TO 100
// public class javaBasic{
//     public static void main(String args[]){
//         int n=100;
//         int counter=1;
//         while(counter<=n){
//             System.out.print(counter + " ");
//             counter++;
//         }
//     }
// }
// OUTPUT:-
// 1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16 17 18 19 20 21 22 23 24 25 26 27 28 29 30 31 32 33 34 35 36 37 38 39 40 41 42 43 44 45 46 47 48 49 50 51 52 53 54 55 56 57 58 59 60 61 62 63 64 65 66 67 68 69 70 71 72 73 74 75 76 77 78 79 80 81 82 83 84 85 86 87 88 89 90 91 92 93 94 95 96 97 98 99 100

// public class javaBasic{
//     public static void main(String args[]){
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter How much Values you want to Print: ");
//         int n = sc.nextInt();

        // for(int i=0; i<=n; i++){
        //     System.out.println(i);
        // }

        // int i = 1;
        // while(i<=n){
        //     System.out.println(i);
        //     i++;
        // }
        
//         int i = 1; 
//         do {
//             System.out.println(i);
//             i++;
//         } while (i<=n);
//     }
// }

// CALCULATE FIRST N NATURAL NUMBERS
// public class javaBasic{
//         public static void main(String args[]){
//                 Scanner sc =new Scanner(System.in);
//                 System.out.print("Enter Nth Value: ");
//                 int n = sc.nextInt();
//                 int sum = 0;
//                 for(int i=1; i<=n; i++){
//                         sum += i;       
//                 }
//                 System.out.println("Nth Value SUM is: "+sum);
//         }
// }
// OUTPUT:-
// Enter Nth Value: 5
// Nth Value SUM is: 15

// public class javaBasic{
//         public static void main(String args[]){
//                 Scanner sc = new Scanner(System.in);
//                 System.out.print("Enter Number you want to Reverce: ");
//                 int number = sc.nextInt(); 
//                 // for(int i=1; n>0; i++){
//                 //         int lastDigit = n%10;
//                 //         System.out.print("Reverce Digits: " + lastDigit);
//                 //         n/=10;
//                 // }
//                 long result = 0;
//                 while(number>0){
//                         int lastDigit = number%10;
//                         result = (result + lastDigit) * 10;
//                         number/=10;  
//                 }
//                 System.out.println("This is Reverce Number: "+result/10);
//         }
// }
// OUTPUT:-
// Enter Number you want to Reverce: 1234567890
// This is Reverce Number: 987654321

// BREAK AND CONTINUE
// public class javaBasic{
//         public static void main(String args[]){
//                 int number1 = 0;
//                 int number2 = 0;
//                 for(int i = 1; i<=5; i++){
//                         if(i == 3){
//                                 break;
//                         }
//                         number1 = (number1+i)*10;
//                 }
//                 System.out.print(number1/10);
//                 System.out.println();
//                 for(int i = 1; i<=5; i++){
//                         if(i == 3){
//                                 continue;
//                         }
//                         number2 = (number2+i)*10;
//                 }
//                 System.out.print(number2/10);  
//         }
// } 
// OUTPUT:-
// 1 2 
// 1 2 4 5

// KEEP ENTERING NUMBERS TILL IT MULTIPLE OF 10:-
// public class javaBasic{
//         public static void main(String args[]){
//                 Scanner sc = new Scanner(System.in);
//                 int n = 0;
                // for(int i = 1; i<=3; i++ ){
                //         System.out.println("Enter Value: ");
                //         n = sc.nextInt();
                //         if (n%10 == 0) {
                //                 break;
                //         }
                // }

                // int i = 1;
                // while(i<=3){
                //         System.out.println("Enter Value: ");
                //         n = sc.nextInt();
                //         if (n%10 == 0) {
                //                 break;
                //         }
                //         i--; //i-- = infinite loop
                // }
//                 int i = 1;
//                 do{
//                         System.out.println("Enter Value: ");
//                         n = sc.nextInt();
//                         if (n%10 == 0) {
//                                 break;
//                         }
//                         i++;
//                 }while(i<=3);
//         }
// }
// OUTPUT:-
// Enter Value: 
// 5
// Enter Value:
// 10
// PS C


// SWAP NUMBERS:- CLASSICAL CODE FOR SWAPPING 
// public class javaBasic{
//         public static void main(String args[]){
//                 Scanner sc = new Scanner(System.in);
//                 System.out.print("Enter 1st Number: ");
//                 int number1 = sc.nextInt();
//                 System.out.print("Enter 2st Number: ");
//                 int number2 = sc.nextInt();
//                 int temp;
//                 temp = number1;
//                 number1 = number2;
//                 number2 = temp;
//                 System.out.println("After Swap 1st number is: " + number1);  
//                 System.out.println("After Swap 2st number is: " + number2);
//         }
// }
// OUTPUT:-
// Enter 1st Number: 2
// Enter 2st Number: 3
// After Swap 1st number is: 3
// After Swap 2st number is: 2

// public class javaBasic{
//         public static int factorial(int number){ 
//                 if (number==0 || number==1) {
//                         return number; 
//                 }
//                 int fact = number*factorial(number-1);
//                 return fact;
//         }
//         public static void main(String args[]){
//                 Scanner sc = new Scanner(System.in);
//                 System.out.println("Enter Number you want Factorial: ");
//                 int number = sc.nextInt();
//                 System.out.println(factorial(number));
//         }
// }


// BINOMIAL COEFICIENT
// public class javaBasic{
//         public static int factorial(int number){ 
//                 if (number==0 || number==1) {
//                         return number; 
//                 }
//                 int fact = number*factorial(number-1);
//                 return fact;
//         }
//         public static void main(String args[]){
//                 Scanner sc = new Scanner(System.in);
//                 System.out.print("Enter n value: ");
//                 int n = sc.nextInt();
//                 System.out.print("Enter r value: ");
//                 int r = sc.nextInt();
//                 int nFact = factorial(n);
//                 System.out.println(n+" Factorial: "+nFact);
//                 int rFact = factorial(r);
//                 System.out.println(r+" Factorial: "+rFact);
//                 int nmrFact = factorial(n-r);
//                 System.out.println(n+"/"+r+" Factorial: "+nmrFact);
//                 int BinomialCoefficient = nFact / (rFact*nmrFact);
//                 System.out.println("Binomial Coefficient: "+BinomialCoefficient);

//         }
// }
// OUTPUT:-
// Enter n value: 5
// Enter r value: 2
// 5 Factorial: 120
// 2 Factorial: 2
// 5/2 Factorial: 6
// Binomial Coefficient: 10

// FUNCTION OVERLOADING
// public class javaBasic{
//         public static void sum(int number1, int number2){
//                 int ans = number1 + number2;
//                 System.out.println("Integer ANS: "+ans);
//         }
//         public static void sum(float number1, float number2){
//                 float ans = number1 + number2;
//                 System.out.println("Float ANS: "+ans);
//         }
//         public static void main(String args[]){
//                 Scanner sc = new Scanner(System.in);
//                 System.out.println("Enter First Number: ");
//                 int number1 = sc.nextInt();
//                 System.out.println("Enter Second Number: ");
//                 int number2 = sc.nextInt();
//                 sum(number1, number2);
//                 sum((float)(number1), (float)(number2));
//                 // sum(3.5f, 4.5f);
//         }
// }
// OUTPUT:-
// Enter First Number: 
// 3
// Enter Second Number:
// 4
// Integer ANS: 7
// Float ANS: 7.0

// public class javaBasic{
//         public static void sum(int num1, int num2){
//                 int ans = num1 + num2;
//                 System.out.println("2 Parameter ANS: "+ans);
//         }
//         public static void sum(int num1, int num2, int num3){
//                 int ans = num1 + num2 + num3;
//                 System.out.println("3 Parameter ANS: "+ans);
//         }
//         public static void main(String args[]){
//                 int num1 = 12;
//                 int num2 = 13;
//                 int num3 = 14;
//                 sum(num1, num2);
//                 sum(num1, num2, num3);
//         }
// }
// OUTPUT:-
// 2 Parameter ANS: 25
// 3 Parameter ANS: 39

// OPTIMIZE METHORD TO CHECK PRIME NUMBERS:-
// public class javaBasic{
//         public static void checkIsPrime(int number){
//                 for(int i=1; i<=Math.sqrt(number); i++){
//                         if (number%2 != 0 || number == 2) {
//                                 System.out.println(number+" is Prime");
//                                 break;
//                         }else{
//                                 System.out.println(number+" is not Prime");
//                                 break;
//                         }
//                 }
//         }
//         public static void main(String args[]){
//                 Scanner sc = new Scanner(System.in);
//                 System.out.print("Enter Number you want to Check Prime or Not Prime: ");
//                 int number = sc.nextInt();
//                 checkIsPrime(number);
//         }
// }
// but why 9 is Prime number?
// OUTPUT:-
// Enter Number you want to Check Prime or Not Prime: 9
// 9 is Prime

// PRINT ALL INTEGER FROM 1 TO N'TH NUMBER:-
// public class javaBasic{
//         public static boolean isPrime(int nthNumber){
//                 for(int i = 1; i<=nthNumber; i++ ){
//                         if (nthNumber%2==0) {
//                                 return false;
//                         }
//                 }
//                 return true;
//         }
//         public static void printAllPrimeNumbers(int nthNumber){
//                 for(int i=1; i<=nthNumber; i++){
//                         if(isPrime(i)) {
//                                 System.out.print(i+" ");
//                         }
//                 }
//         }
//         public static void main(String args[]){
//                 Scanner sc = new Scanner(System.in);
//                 System.out.print("Enter N'th Number: ");
//                 int nthNumber = sc.nextInt();
//                 printAllPrimeNumbers(nthNumber);
//         }
// }  
// OUTPUT:-
// Enter N'th Number: 20
// 1 3 5 7 9 11 13 15 17 19

// BINARY TO DECIMAL:-
// public class javaBasic{
//         public static void binaryToDecimal(int number){
//                 int decimal = 0;
//                 int pow = 0;
//                 int binNum = number;
//                 while(number>0){
//                         int lastDigit = number%10;
//                         decimal += (lastDigit * (int)Math.pow(2, pow));
//                         pow++;
//                         number = number / 10;
//                 }
//                 System.out.println("Decimal Number of "+ binNum + " is: " +decimal);
//         }
//         public static void main(String args[]){
//                 Scanner sc = new Scanner(System.in);
//                 System.out.print("Enter Binary Number: ");
//                 int number = sc.nextInt(); 
//                 binaryToDecimal(number);
//         }
// }
// OUTPUT:-
// Enter Binary Number: 10101
// Decimal Number of 10101 is: 21

// DECIMAL TO BINARY:-
// public class javaBasic{
//         public static void decimalToBinary(int number){
//                 int binary = 0;
//                 int pow = 0;
//                 int rem = 0;
//                 int decimal = number;
//                 while(number>0){
//                         rem = number%2;
//                         binary += (rem * (int)Math.pow(10, pow));
//                         pow++;
//                         number = number / 2;
//                 }
//                 System.out.print("Decimal Number of "+ decimal + " is: " +binary);
//         }
//         public static void main(String args[]){
//                 Scanner sc = new Scanner(System.in);
//                 System.out.print("Enter the Decimal Number: ");
//                 int number = sc.nextInt();
//                 decimalToBinary(number);
//          }
// }
// OUTPUT:-
// Enter the Decimal Number: 11
// Decimal Number of 11 is: 1011

// PRINT HOLLOW RECTANGLE:-
// public class javaBasic{
//         public static void main(String args[]){
//                 int num = 4;
//                 for(int i =1; i<=num; i++ ){
//                         for(int j=1; j<=num; j++ ){
//                                 if (i==1||j==1||i==num||j==num) {
//                                         System.out.print("*"+" ");
//                                 }else{
//                                         System.out.print(" "+" ");
//                                 }
//                         }
//                         System.out.println();

//                 }
//         }
// }
// OUTPUT:-
// * * * * 
// *     *
// *     *
// * * * *

// INVERTED AND ROTATED HALF PYRAMID
// public class javaBasic{
//         public static void main(String args[]){
//                 int n = 4;
//                 for(int i=1; i<=n; i++ ){
//                         for(int j=1; j<=n-i; j++ ){
//                                 System.out.print("-"+" ");
//                         }
//                         for(int j=1; j<=i; j++ ){
//                                 System.out.print("*"+" ");
//                         }
//                         System.out.println();
//                 }
//         }
// }
// OUTPUT:-
// - - - * 
// - - * *
// - * * *
// * * * *

// INVERTED HALF PYRAMID WITH NUMBERS:-
// public class javaBasic{
//         public static void main(String args[]){
//                 int n = 5; 
//                 for(int i = 1; i<=n; i++){
//                         for(int j = 1; j<=n-i+1; j++){
//                                 System.out.print(j+" ");
//                         }
//                         System.out.println();
//                 }

//         }
// } 
// OUTPUT:-
// 1 2 3 4 5 
// 1 2 3 4
// 1 2 3
// 1 2
// 1

// FLOYD'S TRIANGLE
// public class javaBasic{
//         public static void main(String args[]){
//                 int n = 5;
//                 int count = 1;
//                 for(int i = 1; i<=n; i++){
//                         for(int j = 1; j<=i; j++){
//                                 System.out.print(count+" ");
//                                 count++;
//                         }
//                         System.out.println();
//                 }
//         }
// }
// OUTPUT:-
// 1 
// 2 3
// 4 5 6
// 7 8 9 10
// 11 12 13 14 15

// 1-0 HALF TRIANGLE PATTERN
// public class javaBasic{
//         public static void main(String args[]){
//                 int n = 5;
//                 for(int i = 1; i<=n; i++ ){
//                         for(int j=1; j<=i; j++){
//                                 if((i+j)%2==0){
//                                         System.out.print("1"+" ");
//                                 }else{
//                                         System.out.print("0"+" ");
//                                 }
//                         }
//                         System.out.println();
//                 }
//         }
// }
// OUTPUT:-
// 1 
// 0 1
// 1 0 1
// 0 1 0 1
// 1 0 1 0 1

// BUTTERFLY PATTERN
// public class javaBasic{
//         public static void main(String args[]){
//                 int n = 4;
//                 for(int i=1; i<=n; i++){
//                         for(int j=1; j<=i; j++){
//                                 System.out.print("*"+" ");
//                         }
//                         for(int j=1; j<=2*(n-i); j++){
//                                 System.out.print(" "+" ");
//                         }
//                         for(int j=1; j<=i; j++){
//                                 System.out.print("*"+" ");
//                         }
//                         System.out.println();
//                 }
//                 for(int i=n; i>=1; i--){
//                         for(int j=1; j<=i; j++){
//                                 System.out.print("*"+" ");
//                         }
//                         for(int j=1; j<=2*(n-i); j++){
//                                 System.out.print(" "+" ");
//                         }
//                         for(int j=1; j<=i; j++){
//                                 System.out.print("*"+" ");
//                         }
//                         System.out.println();
//                 }
//         }
// }
// OUTPUT:-
// *             * 
// * *         * *
// * * *     * * *
// * * * * * * * *
// * * * * * * * *
// * * *     * * *
// * *         * *
// *             *

// SOLID RHOMBUS:-
// public class javaBasic{
//         public static void main(String args[]){
//                 int n = 4;
//                 for(int i = 1; i<=n; i++){
//                         for(int j = 1; j<=n-i+1; j++){
//                                 System.out.print(" "+" ");
//                         }
//                         for(int j = 1; j<=n; j++){
//                                 System.out.print(" *"+" ");
//                         }
//                         System.out.println();
//                 }
//         } 
// }
// OUTPUT:-
//          *  *  *  * 
//        *  *  *  *
//      *  *  *  *
//    *  *  *  *

// HOLLOW RHOMBUS:-
// public class javaBasic{
//         public static void main(String args[]){
//                 int n = 5;
//                 for(int i=1; i<=n; i++){
//                         for(int j=1; j<=n-i+1; j++){
//                                 System.out.print(" "+" ");
//                         }
//                         for(int j=1; j<=n; j++){
//                                 if(i==1||j==1||i==n||j==n){
//                                         System.out.print("*"+" ");
//                                 }
//                                 else{
//                                         System.out.print(" "+" ");
//                                 }
//                         }
//                         System.out.println();
//                 }
//         }
// }
// OUTPUT:-
//           * * * * * 
//         *       *
//       *       *
//     *       *
//   * * * * *

// DIAMOND PATTERN:-
// public class javaBasic{
//         public static void main(String args[]){
//                 int n = 4;
//                 for(int i=1; i<=n; i++){
//                         for(int j=1; j<=n-i; j++){
//                                 System.out.print(" "+" ");
//                         }
//                         for(int j=1; j<=2*i-1; j++){
//                                 System.out.print("*"+" ");
//                         }
//                         System.out.println();
//                 }
//                 for(int i=n; i>=1; i--){
//                         for(int j=1; j<=n-i; j++){
//                                 System.out.print(" "+" ");
//                         }
//                         for(int j=1; j<=2*i-1; j++){
//                                 System.out.print("*"+" ");
//                         }
//                         System.out.println();
//                 }
//         }
// }
// OUTPUT:-
//       * 
//     * * *
//   * * * * *
// * * * * * * *
// * * * * * * *
//   * * * * *
//     * * *
//       *

public class javaAllConcepts{
        public static void main(String args[]){
                System.out.println("Pratik");
        }
}


