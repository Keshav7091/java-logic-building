// 5. Take three numbers and check if they are in arithmetic progression.

import java.util.Scanner;

class Q05_ArithmeticProgressionChecker{

    public static String arithmeticProgressionChecker(int num1, int num2, int num3){
            return (num3 - num2 == num2 - num1) ? "It's Arithmetic Progression" : "It's Not Airthemtic Progression";
        }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter Number 1");
        int num1 = sc.nextInt();
        
        System.out.println("Enter Number 2");
        int num2 = sc.nextInt();
        
        System.out.println("Enter Number 3");
        int num3 = sc.nextInt();
        
        System.out.println(arithmeticProgressionChecker(num1, num2, num3));
        
        sc.close();
    }

}