// Take two numbers and determine whether both are even, both are odd, or one is even and one is odd.

import java.util.Scanner;

class Q07_EvenOddCombination{

    public static String evenOddCombination(int num1, int num2){
        if(num1 % 2 == 0 && num2 % 2 == 0){
            return "Both numbers are even";
        }else if(num1 % 2 == 0){
            return "Number 1 is Even and Number 2 is odd";
        }else if(num2 % 2 == 0){
            return "Number 2 is even and Number 1 is odd";
        }
        
        return "Both numbers are odd";
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter first number: ");
        int num1 = sc.nextInt();
        
        System.out.println("Enter second number: ");
        int num2 = sc.nextInt();
        
        System.out.println(evenOddCombination(num1, num2));
        
        sc.close();
    }

}