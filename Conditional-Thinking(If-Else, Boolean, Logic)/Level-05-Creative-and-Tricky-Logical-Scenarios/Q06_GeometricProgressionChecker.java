// 

import java.util.Scanner;

class Q06_GeometricProgressionChecker{
    public static String geometricProgressionChecker(int num1, int num2, int num3){
        return (num2 * num2 == num1 * num3) ? "It's Geometric Progression" : "It's Not Geometric Progression";
    }
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter Number 1");
        int num1 = sc.nextInt();
        
        System.out.println("Enter Number 2");
        int num2 = sc.nextInt();
        
        System.out.println("Enter Number 3");
        int num3 = sc.nextInt();
        
        System.out.println(geometricProgressionChecker(num1, num2, num3));
        
        sc.close();
    }

}